import java.util.Scanner;

public class HusoYCuñaEsferico {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double radio, noGrados, area, volumen;

        System.out.println("Huso y Cuña Esferico.");
        System.out.println("Digitar el radio: ");
        radio = lector.nextDouble();

        System.out.println("Digitar el numero de grados: ");
        noGrados = lector.nextDouble();

        area = (4 * Math.PI * Math.pow(radio, 2) * noGrados)/360;
        volumen = (4/3) * ((Math.PI * Math.pow(radio, 3) * noGrados)/360);

        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
