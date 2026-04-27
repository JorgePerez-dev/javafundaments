

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase para manejar operaciones básicas sobre bases de datos relacionales
 * usando JDBC.
 */
public class relationaldbs {

    private String url;
    private String user;
    private String password;
    private Connection connection;

    /* =======================
       CONSTRUCTOR
       ======================= */

    public relationaldbs(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    /* =======================
       CONEXIÓN
       ======================= */

    public void connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(true);
            System.out.println("✅ Conectado a la base de datos");
        }
    }

    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("🔌 Conexión cerrada");
        }
    }

    public boolean isConnected() throws SQLException {
        return connection != null && !connection.isClosed();
    }

    /* =======================
       TRANSACCIONES
       ======================= */

    public void beginTransaction() throws SQLException {
        connection.setAutoCommit(false);
    }

    public void commit() throws SQLException {
        connection.commit();
        connection.setAutoCommit(true);
    }

    public void rollback() {
        try {
            if (connection != null) {
                connection.rollback();
                connection.setAutoCommit(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* =======================
       CONSULTAS SELECT
       ======================= */

    public ResultSet executeQuery(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(sql);
    }

    public ResultSet executeQuery(String sql, Object... params) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(sql);
        setParameters(stmt, params);
        return stmt.executeQuery();
    }

    /* =======================
       INSERT / UPDATE / DELETE
       ======================= */

    public int executeUpdate(String sql) throws SQLException {
        Statement stmt = connection.createStatement();
        return stmt.executeUpdate(sql);
    }

    public int executeUpdate(String sql, Object... params) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(sql);
        setParameters(stmt, params);
        return stmt.executeUpdate();
    }

    /* =======================
       INSERT CON ID GENERADO
       ======================= */

    public int executeInsertAndReturnId(String sql, Object... params) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement(
                sql,
                Statement.RETURN_GENERATED_KEYS
        );

        setParameters(stmt, params);
        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }

    /* =======================
       MÉTODOS CRUD GENÉRICOS
       ======================= */

    public int insert(String table, String[] columns, Object[] values) throws SQLException {
        StringBuilder sql = new StringBuilder("INSERT INTO ");
        sql.append(table).append(" (");

        for (int i = 0; i < columns.length; i++) {
            sql.append(columns[i]);
            if (i < columns.length - 1) sql.append(", ");
        }

        sql.append(") VALUES (");

        for (int i = 0; i < values.length; i++) {
            sql.append("?");
            if (i < values.length - 1) sql.append(", ");
        }

        sql.append(")");

        return executeUpdate(sql.toString(), values);
    }

    public int update(
            String table,
            String[] columns,
            Object[] values,
            String whereClause,
            Object... whereParams
    ) throws SQLException {

        StringBuilder sql = new StringBuilder("UPDATE ");
        sql.append(table).append(" SET ");

        for (int i = 0; i < columns.length; i++) {
            sql.append(columns[i]).append(" = ?");
            if (i < columns.length - 1) sql.append(", ");
        }

        sql.append(" WHERE ").append(whereClause);

        Object[] allParams = new Object[values.length + whereParams.length];
        System.arraycopy(values, 0, allParams, 0, values.length);
        System.arraycopy(whereParams, 0, allParams, values.length, whereParams.length);

        return executeUpdate(sql.toString(), allParams);
    }

    public int delete(String table, String whereClause, Object... params) throws SQLException {
        String sql = "DELETE FROM " + table + " WHERE " + whereClause;
        return executeUpdate(sql, params);
    }

    /* =======================
       UTILIDADES
       ======================= */

    private void setParameters(PreparedStatement stmt, Object... params)
            throws SQLException {

        for (int i = 0; i < params.length; i++) {
            stmt.setObject(i + 1, params[i]);
        }
    }
}
