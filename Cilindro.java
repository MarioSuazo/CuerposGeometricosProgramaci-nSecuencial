import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double radio, altura, Pbase, areaL, Abase;
        double areaT, volumen;

        System.out.println("Calculadora Para Cilindro:");
        System.out.println("Digitar el radio: ");
        radio = lector.nextDouble();
            
        System.out.println("Digitar la altura: ");
        altura = lector.nextDouble();
        
        Pbase = (2* Math.PI) * radio;
        areaL = Pbase * altura;
        Abase = Math.PI * Math.pow(radio, 2);
        areaT = areaL + (2 * Abase);
        volumen = Abase * altura;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area Total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
        lector.close();
    }
}
