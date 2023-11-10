import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double radio, area, volumen;

        System.out.println("Esfera.");
        System.out.println("Ingresar el radio: ");
        radio = lector.nextDouble();
            
        area = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4/3) * Math.PI * Math.pow(area, 3);
            
        System.out.println("El Area es: " + area);
        System.out.println("El Volumen es: " + volumen);

        lector.close();
    }
}
