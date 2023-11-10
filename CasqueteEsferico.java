import java.util.Scanner;

public class CasqueteEsferico {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double altura, radioMayor, area, volumen;

        System.out.println("Casquete Esferico.");
        System.out.println("Ingresar la altura ");
        altura = lector.nextDouble();

        System.out.println("Ingresar el radio mayor: ");
        radioMayor = lector.nextDouble();

        area = 2 * Math.PI *  radioMayor * altura;
        volumen = (Math.PI * Math.pow(altura, 2) * (3*radioMayor - altura))/6;


        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);
        lector.close();
    }
}
