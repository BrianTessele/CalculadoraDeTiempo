package edad;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        // TODO code application logic here.
        System.out.println(" ---------------------- ");

        Scanner dato = new Scanner(System.in);

        System.out.println("Nombre: ");
        Persona calculosPersona1 = new Persona(dato.nextLine());

        //condicion.
        /*
        * Se ha de cumplir que el añoActual sea 2015
        * en caso contrario debera pedirse insertar año.
        * El programa entonces calculara con el nuevo año.
        */
        //fin condicion.
        
        System.out.println("Fecha de Nacimiento: ");
        calculosPersona1.fechaNacimiento(dato.nextInt(), dato.nextInt(), dato.nextInt());

        calculosPersona1.tieneEdad();
        calculosPersona1.getTieneEdad();
        calculosPersona1.calculos();
        calculosPersona1.vivido();

        System.out.println(" ---------------------- ");

    }

}

