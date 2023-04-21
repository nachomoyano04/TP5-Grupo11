package tp5.grupo11;

/**
 *
 * @author nacho
 */
public class TP5Grupo11 {

    public static void main(String[] args) {
        System.out.println("------------------");
        int array[]={1,2,3,4,5,6,7,8,9,10};
        Arreglo.sumarLista(array);
        System.out.println("------------------");
        int array2[][] = {{1,2,3,4,5},{7,8,21},{123,443,5445,4545}};
        System.out.println("El mayor numero del arreglo es: "+Arreglo.buscarMayor(array2));
        System.out.println("------------------");
        String palabra = "SuperCalifragilisticoEspiralidoso";
        System.out.println("La cantidad de vocales que tiene la palabra -"+palabra+"- es de: "+Arreglo.cuentaVocales(palabra));
        System.out.println("------------------");
        String palabra2 = "ORnitoRrinco";
        System.out.println("La cantidad de letras 'r' que tiene la palabra -"+palabra2+"- es de:"+Arreglo.cuentaCaracter(palabra2, 'r'));
        System.out.println("------------------");
    }
}
