import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double altura, longitudLados, anchoL, APiramide;
        double areaL, areaT, Abase, volumen, Pbase, apotema;

        System.out.println("Caculadora de Piramide.");
        System.out.println("Ingresar la altura: ");
        altura = lector.nextDouble();
            
        System.out.println("Ingresar la longitud de los lados: ");
        longitudLados = lector.nextDouble();
            
        System.out.println("Ingresar el ancho de los lados: ");
        anchoL = lector.nextDouble();
            
        Pbase = 2 * longitudLados + 2 * anchoL;
        apotema = longitudLados/2;
        APiramide = Math.sqrt(Math.pow(altura, 2) + Math.pow(apotema, 2));
        areaL = (Pbase * APiramide)/2;
        areaT = areaL + Pbase;
        Abase = longitudLados/2;
        volumen = (Abase* altura)/3;
            
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
        lector.close();
    }
}
