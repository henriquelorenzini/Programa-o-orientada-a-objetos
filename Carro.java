import java.util.Scanner;

public class Carro {
	public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int repetir;
		int totalKm = 0;
		int totalgas = 0;
        boolean fim = false;
		double total;
        while(!fim) {
        	System.out.println("Informe a quilometragem percorrida: ");
        	int Km = entrada.nextInt();
        	

        	System.out.println("Informe a quantidade de combustivel consumida: ");
        	int gas = entrada.nextInt();
        	
        	totalKm += Km;
        	totalgas += gas;
        	total = totalKm/totalgas;
        	
        	System.out.println("Quilometragem total: " + totalKm);
        	System.out.println("Litragem total: " + totalgas);
        	System.out.println("Rendimento: " + Math.floor(total * 100) / 100);
        	
        	System.out.println("Deseja calcular novamente?  Sim - 0 | Nao - 1");
        	repetir = entrada.nextInt();
        	fim = (repetir == 1) ? true : false;
        	
        }
	}
}
