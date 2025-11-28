package datastructure;

public class AnalizadorNumerico {
    public static void main(String[] args) {
        int numero = 164;
        procesarNumero(numero);
        
        
        
        
       
        
        
    }

    public static void procesarNumero(int numero) {
        int sumaCubos = sumaCubosDigitos(numero);
        System.out.println("Suma de los cubos de los dígitos: " + sumaCubos);

        if (esPrimo(sumaCubos)) {
            System.out.println("El resultado (" + sumaCubos + ") es un número primo.");
        } else {
            System.out.println("El resultado (" + sumaCubos + ") no es un número primo.");
        }
        
        if (numero % 2 == 0) {
        	System.out.println("El numero "  +  numero  + " es par");
        }
        else {
			System.out.println("El numero "  +  numero  + " es impar");
		}
        	
        
        
    }
    
    
    
    

    public static int sumaCubosDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, 3);
            numero /= 10;
        }
        return suma;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }


}
