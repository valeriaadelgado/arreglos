import java.util.Scanner;

public class Arreglos{

    public static int T = 25;

    public static void leerCalificaciones(){

    }

    public static void evaluarCalificaciones(){
        
    }

    public static void main(String[] args) {
        double[] parcial1, parcial2, parcial3, parcial4; //solo declarando arreglos
        double[] promInd;
        boolean[] aprobados;


        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<calificaciones.length; i++){
            System.out.println("Escribe calificacion  [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        //No se imprime el contenido de todas las casillas del arreglo
        //solo se imprimen la direccion de memoria en donde empieza el arreglo
        //System.out.println("calificaciones: " + calificaciones);

        //impresion usando el for extenido
        System.out.println("Contenido del arreglo calificaciones: ");
        for(double calificacion : calificaciones)
        System.out.println(calificacion);

        System.out.println("contenido de calificaiones: ");
        //impresion con el for tradidiconal
        for ( int i=0; i<calificaciones.length; i++)
        System.out.println(calificaciones[i]);
        sc.close();
    }
}