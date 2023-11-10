import java.util.Scanner;

public class Octaedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double arista, area, volumen;

        System.out.println("Octaedro.");
        System.out.println("Ingresar un arista: ");
        arista = lector.nextDouble();

        area = 2 * Math.pow(arista, 2) * Math.sqrt(3);
        volumen = (Math.sqrt(2)/3) * Math.pow(arista, 3);

        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
