import java.util.Scanner;

public class Tetraedro {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double arista, area, altura, volumen;

        System.out.println("Tetraedro.");
        System.out.println("Ingresar un arista: ");
        arista = lector.nextDouble();

        area = Math.pow(arista, 3) * Math.sqrt(3) ;
        volumen = (Math.sqrt(2)/12) * arista;
        altura = arista * (Math.sqrt(6)/3);

        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        System.out.println("El Altura es: " + altura);
        lector.close();
    }
}
