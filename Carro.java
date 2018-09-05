
import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int repetir;
        int totalKm = 0;
        int totalGas = 0;
        double total;

        System.out.print("Informe a quilometragem percorrida ou digite -1 para terminar: ");
        int km = entrada.nextInt();

        while (km >= 0) {

            System.out.print("Informe a quantidade de combustivel consumida: ");
            int gas = entrada.nextInt();

            totalKm += km;
            totalGas += gas;
            total = totalKm / totalGas;

            System.out.println("Quilometragem total: " + totalKm);
            System.out.println("Litragem total: " + totalGas);
            System.out.println("Rendimento desta viagem: " + Math.floor(total * 100) / 100);
            System.out.print("Informe a quilometragem percorrida ou digite -1 para terminar: ");
             km = entrada.nextInt();
        }
    }
}
