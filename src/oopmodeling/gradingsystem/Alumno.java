package oopmodeling.gradingsystem;

public class Alumno {
    String nombre;
    double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String mostrar() {
        return "Nombre: " + nombre + " | Nota: " + nota;
    }
}
