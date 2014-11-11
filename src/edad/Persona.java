package edad;

public class Persona {

    private String nombre;
    public int i, j, k;//FECHA: DIA/MES/AÑO
    private final int añoActual = 2014;
    private int años, dias, semanas, meses, horas, minutos, segundos;

    //constructor
    public Persona() {

    }

    public Persona(String a) {
        nombre = a;
    }

    //metodos
    
    /*
    * public void setAñoActual (int a){
    *     añoActual=a;
    * }
    */
    
    public void fechaNacimiento(int d, int m, int a) {
        this.i = d;
        this.j = m;
        this.k = a;
    }

    public void tieneEdad() {
        años = añoActual - k;
    }

    public int getTieneEdad() {
        System.out.println("Tienes " + años + " años.");
        return años;
    }

    public void calculos() {
        dias = años * 365;
        semanas = dias / 7;
        meses = dias / 30;
        horas = dias * 24;
        minutos = dias * 1440;
        segundos = dias * 86400;
    }

    public void vivido() {
        System.out.println("Has vivido: \n"
                + dias + " dias.\n"
                + meses + " meses.\n"
                + semanas + " semanas.\n"
                + horas + " horas.\n"
                + minutos + " minutos.\n"
                + segundos + " segundos.\n");
    }

}
