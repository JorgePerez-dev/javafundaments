package io;

import java.io.File;
import java.io.IOException;

public class fileoperation {

    public static void main(String[] args) {

        File file = new File("/logs/user.log");  
        File directory = new File("/jorge/logs/");
        		
        		
        		
        System.out.println("Working directory : " + System.getProperty("User.dir"));
        
       CreatePath(directory);

        createFile(file);     
        
        File absoluteDir = new File(System.getProperty("user.dir") + "/logs/user.log");
        absoluteDir.mkdirs();
    }
    
    
    
    
    
    private static void CreatePath(File file) {
    	System.out.println(file.isAbsolute());
    	System.out.println(file.getPath());
    	
        //create direcories specified by the "file" object
    	
        file.getParentFile().mkdirs();
        
        System.out.println(file.getAbsolutePath());

        

	}
    
    
    
    
    

    private static void createFile(File file) {

        if (file.exists()) {
            System.out.println("The log file exists");
        } else {
            System.out.println("The log file does not exist");
            try {
                file.createNewFile();
                System.out.println("Archivo creado");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //with try catch, we can continue executing the program without interruption
            System.out.println("Finished");
        }
    }
}
