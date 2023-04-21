/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5.grupo11;

/**
 *
 * @author nacho
 */
public class Arreglo {
    
    public static void sumarLista(int[]array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        double promedio = (double) suma / array.length;
        System.out.println("La suma de los elementos del arreglo es de: "+suma);
        System.out.println("El promedio de los elementos del arreglo es de: "+promedio);
    }
    
    public static int buscarMayor(int[][]array){
        int mayor = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>=mayor){
                    mayor = array[i][j];
                }
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        return mayor;
    }
    
    public static int cuentaVocales (String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            switch(cadena.toLowerCase().charAt(i)){
                case 'a':contador++;break; 
                case 'e':contador++;break; 
                case 'i':contador++;break; 
                case 'o':contador++;break; 
                case 'u':contador++;break; 
            }
        }
        return contador;
    }
    
    public static int cuentaCaracter(String cadena,char letra){
        char letra2 = Character.toLowerCase(letra);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.toLowerCase().charAt(i)==letra2){
                contador++;
            }
        }
        return contador;
    }
    
}
