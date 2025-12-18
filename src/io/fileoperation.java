package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class fileoperation {

    // 👉 reader declarado a nivel de clase
    static FileReader reader;

    public static void main(String[] args) {

        // Carpeta logs dentro del directorio del proyecto
        String folderPath = System.getProperty("user.dir") + File.separator + "logs";

        // Archivo dentro de esa carpeta
        File directory = new File(folderPath);
        File file = new File(directory, "user.log");

        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));

        createPath(directory);
        createFile(file);

        writeFile();
        readFile();
        ReadFile1();
        
        bufferedRead();
        
        bufferedWriter();
        
        
        
        
        
    }
    
    
    
    private static void bufferedWriter() {
        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("contacts.txt"));

            writer.write("Jorge + ':' + Jorge@P");
            writer.newLine();
            writer.write("Jorge + ':' + Jorge@P");
            writer.newLine();

            writer.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    
    
    
    

    // ================= WRITE =================
    private static void writeFile() {
        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Black holes\n");
            writer.write("Jorge\n");
            writer.write("4\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    private static void bufferedRead() {
        try {
            System.out.println();
            System.out.println("Buffered reader");

            BufferedReader br = new BufferedReader(new FileReader("log.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    // ================= READ (while y do-while) =================
    private static void readFile() {
        try {
            FileReader reader = new FileReader("log.txt");
            int c;

            // -------- WHILE --------
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();

            System.out.println("\n--- DO WHILE ---");

            // -------- DO-WHILE --------
            reader = new FileReader("log.txt");
            do {
                c = reader.read();
                if (c != -1) {
                    System.out.print((char) c);
                }
            } while (c != -1);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ================= READ usando while (f != -1) =================
    private static void ReadFile1() {
        int f = 0; // inicialización obligatoria

        try {
            reader = new FileReader("log.txt");

            while (f != -1) {
                f = reader.read();
                if (f != -1) {
                    System.out.print((char) f);
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ================= CREATE PATH =================
    private static void createPath(File directory) {
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Carpeta creada: " + directory.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        } else {
            System.out.println("La carpeta ya existe: " + directory.getAbsolutePath());
        }
    }

    // ================= CREATE FILE =================
    private static void createFile(File file) {
        if (file.exists()) {
            System.out.println("El archivo ya existe: " + file.getAbsolutePath());
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo creado: " + file.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
