import java.util.Scanner;
public class TesteFrequenciaCardiaca {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		FrequenciaCardiaca perfil = new  FrequenciaCardiaca(null, null, 0, 0);
		
		System.out.printf("Nome: ");
		String nome = entrada.nextLine();
		perfil.setNome(nome);
		
		System.out.printf("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		perfil.setSobrenome(sobrenome);
		
		System.out.printf("Dia do nascimento: ");
		int dia = entrada.nextLine();
		perfil.setDia(dia);
		
		System.out.printf("Mes do nascimento: ");
		int mes = entrada.nextLine();
		perfil.setMes(mes);
		
		System.out.printf("Ano do nascimento: ");
		int ano = entrada.nextLine();
		perfil.setAno(ano);
		
		System.out.printf("%nIdade: %d", perfil.getIdade());
		System.out.printf("%nFCM: %d", perfil.getFcm());
		System.out.printf("%nFCA máximo: %d", perfil.getFcaMax());
		System.out.printf("FCA mínimo: %d", perfil.getFcaMin());

		entrada.close();
	}
}

