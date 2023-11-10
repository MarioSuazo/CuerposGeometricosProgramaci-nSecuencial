import java.util.Scanner;

public class Icosaedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double arista, area, volumen;

        System.out.println("Icosaedro.");
        System.out.println("Ingresar un arista: ");
        arista = lector.nextDouble();

        area = 5 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = (5/12) * (3 + Math.sqrt(5)) * Math.pow(arista, 3);

        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
