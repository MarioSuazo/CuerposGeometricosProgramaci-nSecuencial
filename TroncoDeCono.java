import java.util.Scanner;

public class TroncoDeCono {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double altura, radioMayor, radioMenor, generatriz, Abase;
        double areaL, areaT, volumen, ABase;

        System.out.println("Tronco de Cono.");
        System.out.println("Digitar la altura: ");
        altura = lector.nextDouble();

        System.out.println("Digitar el radio menor: ");
        radioMenor = lector.nextDouble();

        System.out.println("Digitar el Radio mayor: ");
        radioMayor = lector.nextDouble();

        generatriz = Math.sqrt(Math.pow(altura, 2) + (Math.pow(radioMayor - radioMenor, 2)));
        ABase = Math.PI * Math.pow(radioMayor, 2);
        Abase = Math.PI * Math.pow(radioMenor, 2);
        areaL = Math.PI * generatriz * (radioMayor + radioMenor);
        areaT = areaL + ABase + Abase;
        volumen = (1/3) * Math.PI * altura * (Math.pow(radioMayor, 2) + Math.pow(radioMenor, 2) + (radioMayor * radioMenor));


        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
        lector.close();
    }
}
