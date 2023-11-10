import java.util.Scanner;

public class Dodecaedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double arista, apotemaPent, areaPent, area, volumen;

        System.out.println("Dodecaedro.");
        System.out.println("Digitar un arista: ");
        arista = lector.nextDouble();

        apotemaPent = arista / (2 * Math.tan(36));
        areaPent = (5/2) * arista * apotemaPent;
        area = 3 * Math.pow(arista, 2) * Math.sqrt(25 + 10 + Math.sqrt(5));
        volumen = (1/4) * (15 + 7 * Math.sqrt(5)) * Math.pow(arista, 3);
        
        System.out.println("El Area del Pentagono es: " + areaPent);
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
