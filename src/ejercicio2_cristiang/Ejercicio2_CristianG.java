package ejercicio2_cristiang;

import java.io.File;

/**
 * @author Cristian G. 
 * EJERCICIO 2 ACCESO A DATOS
 */
public class Ejercicio2_CristianG {

    public static void main(String[] args) {

        File f = new File("D:\\2ºDAM\\ACCESO A DATOS\\Ejercicio2_CristianG");//RUTA ABSOLUTA
                            //(".") DIRECTORIO ACTUAL
                            //"..\\EjercicioX" RUTA RELATIVA
        //PUNTO 1: FORMA 1
        File[] lista = f.listFiles();//TE DEVUELVE EL NUMERO DE ARCHIVOS+CARPETAS
        System.out.println("Numero de archivos lista 1: " + lista.length);

        //PUNTO 1: FORMA 2
        String[] lista2 = f.list();
        System.out.println("Numero de archivos lista 2: " + lista2.length);

        //SI QUEREMOS QUE NOS MUESTRE SOLO EL NUMERO DE ARCHIVOS SIN CARPETAS O SOLO EL NUMERO DE CARPETAS HAREMOS ESTO
        int numeroArchivos = 0;
        int numeroCarpetas = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isFile()) {
                numeroArchivos++;
            }
            if (lista[i].isDirectory()) {
                numeroCarpetas++;
            }
        }
        System.out.println("Hay " + numeroArchivos + " archivos");
        System.out.println("Hay " + numeroCarpetas + " carpetas");

        //PUNTO 2
        System.out.println("El contenido de la carpeta es " + f.getTotalSpace() + " Bytes");
        System.out.println("El contenido de la carpeta es " + f.getUsableSpace() + " Bytes");
        System.out.println(f.length());

        /*long byTotal = 0;
        for (int i = 0; i < lista.length; i++) {
            long byDir = 0;
            long byFich = 0;
            if (f.isFile()) {
                byFich=f.length(); 
            }
            if (f.isDirectory()) {
               byDir=f.length();
            }
            byTotal=byFich+byDir;
        }
        System.out.println(byTotal);*/
        //PUNTO 3
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista2[i] + ":");
            if (f.isFile()) {
                System.out.println("Es un Archivo");
            }
            if (f.isDirectory()) {
                System.out.println("Es un Directorio");
            }
        }

    }

}
