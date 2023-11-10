import java.util.Scanner;

public class ZonaEsferica {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double radio, altura, radioMayor, area, volumen;

        System.out.println("Zona Esferica.");
        System.out.println("Digitar el radio: ");
        radio = lector.nextDouble();

        System.out.println("Digitar la altura ");
        altura = lector.nextDouble();

        System.out.println("Digitar el radio mayor: ");
        radioMayor = lector.nextDouble();

        area = 2 * Math.PI *  radioMayor * altura;
        volumen = (Math.PI * altura * (Math.pow(altura, 2) + 3*Math.pow(radio, 2) + 3*Math.pow(radioMayor, 2)))/6;


        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);

        lector.close();
    }
}
