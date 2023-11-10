import java.util.Scanner;

public class Hexaedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double arista, diagonal, area, volumen;
        
        System.out.println("Hexaedro.");
        System.out.println("Digitar un arista: ");
        arista = lector.nextDouble();

        area = 6 * Math.pow(arista, 2);
        diagonal = arista * Math.sqrt(3);
        volumen = Math.pow(arista, 3);

        System.out.println("El Area es: " + area);
        System.out.println("El Diagonal es: " + diagonal);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
