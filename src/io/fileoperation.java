package io;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;




public class fileoperation {



    public static void main(String[] args) {



        // Carpeta logs dentro del directorio del proyecto

        String folderPath = System.getProperty("user.dir") + File.separator + "logs";



        // Archivo dentro de esa carpeta

        File directory = new File(folderPath);

        File file = new File(directory, "/logs/user.log");



        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));



        createPath(directory);

        createFile(file);

        File absolutedirFile = new File(System.getProperty("use.dir") + "/logs/user.log");

        absolutedirFile.mkdir();

        wrutefile();
        
        readFile();

    }

 



    private static void wrutefile() {


		try {
			FileWriter writer = new FileWriter("log.txt");
			writer.write("Black holes");
			writer.write("Jorge");
			writer.write(4);
			//close the writer and
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//refresh data we have written to the file
		//writer.flush;
		
		

	}
    
     
    
    private static void readFile() {
        try {
            FileReader reader = new FileReader("log.txt");
            int c;

            // -------- WHILE --------
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

            reader.close();

            // Volvemos a abrir el archivo para el do-while
            reader = new FileReader("log.txt");

            // -------- DO-WHILE --------
            do {
                c = reader.read();
                if (c != -1) {
                    System.out.println((char) c);
                }
            } while (c != -1);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

			
			
			
 





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

                System.out.println("Error creando el archivo:");

                e.printStackTrace();

            }

        }

    }

}