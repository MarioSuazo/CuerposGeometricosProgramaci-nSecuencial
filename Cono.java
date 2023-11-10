import java.util.Scanner;

public class Cono {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double altura, radio, generatriz, areaL, areaT;
        double Abase, volumen;

        System.out.println("Calculadora de Cono.");
        System.out.println("Digitar la altura: ");
        altura = lector.nextDouble();
            
        System.out.println("Digitar el radio: ");
        radio = lector.nextDouble();
            
        generatriz = Math.sqrt(Math.pow(altura, 2) + Math.pow(radio, 2));
        areaL = Math.PI * radio * generatriz;
        Abase = Math.PI * (radio * radio);
        areaT = areaL + Abase;
        volumen = (Abase + areaL) /3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
        lector.close();
    }
}
