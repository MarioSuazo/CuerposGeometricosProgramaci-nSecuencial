import java.util.Scanner;

public class TroncoDePiramide {
    public static void main(String[] args) throws Exception{
        Scanner lector = new Scanner(System.in);

        double longMayor, longMenor, longMayor_Mitad, altura, areaL, areaT;
        double Apir, ABase, Abase, PBase, Pbase, volumen;

        System.out.println("Tronco de Piramide.");
        System.out.println("Ingresar la longitd del lado mayor: ");
        longMayor = lector.nextDouble();

        System.out.println("Ingresar la longitud del lado menor: ");
        longMenor = lector.nextDouble();

        System.out.println("Ingresar la altura: ");
        altura = lector.nextDouble();

        longMayor_Mitad = longMayor / 2;
        Apir = (Math.sqrt(Math.pow(altura, 2)) + (Math.pow(longMayor_Mitad, 2)));
        ABase = Math.pow(longMayor, 2);
        Abase = Math.pow(longMenor, 2);
        PBase = longMayor * 4;
        Pbase = longMenor * 4;
        areaL = ((PBase + Pbase)/2) * Apir;
        areaT = areaL + ABase + Abase;
        volumen = ((1/3) * altura * (ABase + Abase + Math.sqrt(ABase * Abase)));

        System.out.println("El Area lateral es: " + areaL );
        System.out.println("El Area total es: " + areaT );
        System.out.println("El Volumen es: " + volumen );
        lector.close();
    }
}
