package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here.
        System.out.println(" ---------------------- ");

        Scanner dato = new Scanner(System.in);

        System.out.println("Nombre: ");
        Persona calculosPersona1 = new Persona(dato.nextLine());
        
        //condicion.
        /*
        * Se ha de cumplir que el datoActual sea 2017
        * en caso contrario debera pedirse insertar ano.
        * El programa entonces calculara con el nuevo ano.
        */
        //fin condicion.
        
        System.out.println("Fecha de Nacimiento: ");
        Persona.fechaNacimiento(dato.nextInt(), dato.nextInt(), dato.nextInt());
        dato.close();
        calculosPersona1.tieneEdad();
        calculosPersona1.getTieneEdad();
        calculosPersona1.calculos();
        calculosPersona1.vivido();

        System.out.println(" ---------------------- ");

    }

}
