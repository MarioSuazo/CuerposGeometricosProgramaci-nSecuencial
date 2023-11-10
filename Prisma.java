import java.util.Scanner;

public class Prisma{
    public static void main(String args[]) throws Exception{
        Scanner lector = new Scanner(System.in);

        int cantidadLados;
        double longitudLados, altura, Pbase, areaL, alfa;
        double apotema, Abase, areaT, volumen;
        
        System.out.println("Calculadora de Prisma");
        System.out.println("Prisma.");
        System.out.println("Ingresar la cantidad de lados: ");
        cantidadLados = lector.nextInt();

        System.out.println("Ingresar la longitud de un lado: ");
        longitudLados = lector.nextDouble();

        System.out.println("Ingresar la altura: ");
        altura = lector.nextDouble();

        Pbase = cantidadLados * longitudLados;
        areaL = Pbase * altura;
        alfa = (Math.PI/180) * (380/cantidadLados);
        apotema =  longitudLados / (2 * Math.tan((alfa)/2));
        Abase = (Pbase * apotema)/2;
        areaT = areaL + 2 * Abase;  
        volumen = Abase * altura; 
        
        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area Total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );  
        lector.close();
    }
}