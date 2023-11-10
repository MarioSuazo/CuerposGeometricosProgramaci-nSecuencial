import java.util.Scanner;

public class Ortoedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double altura, base, arista, area, diagonal;
        double volumen;

        System.out.println("Ortoedro.");
        System.out.println("Digitar la altura");
        altura =  lector.nextDouble();

        System.out.println("Digitar la base: ");
        base = lector.nextDouble();

        System.out.println("Digitar la arista: ");
        arista = lector.nextDouble();

        area = 2 * (arista * base + arista * altura + base * altura);
        diagonal = Math.sqrt(Math.pow(arista, 2) + Math.pow(base, 2) + Math.pow(altura, 2));
        volumen = arista * base * altura;

        System.out.println("El Area es: " + area);
        System.out.println("El Diagonal es: " + diagonal);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
