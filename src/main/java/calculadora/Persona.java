package calculadora;

public class Persona {

    public static int i;//FECHA: DIA/MES/AÑO
	public static int j;
	public static int k;
    private final int datoActual = 2017;
    private int anos, dias, semanas, meses, horas, minutos, segundos;

    //constructor
    public Persona() {

    }

    public Persona(String a) {
    }

    //metodos
    
    /*
    * public void setAñoActual (int a){
    *     añoActual=a;
    * }
    */
    
    public static int fechaNacimiento(int d, int m, int a) {
       
    	//comando do desenvolvedor para lan�ar uma Exception
    	if(d<0) {  
			throw new IllegalArgumentException("O dia � negativo");
		}
		if(m<0) {
			throw new IllegalArgumentException("O m�s � negativo");
		}
		if(a<0) {
			throw new IllegalArgumentException("O ano � negativo"); 
		}
		
		i = d;
		j = m;
		k = a;
			
		return i & j & k;
    }
    	

    public void tieneEdad() {
        anos = datoActual - k;
    }

    public int getTieneEdad() {
        System.out.println("Tienes " + anos + " anos.");
        return anos;
    }

    public void calculos() {
        dias = anos * 365;
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
