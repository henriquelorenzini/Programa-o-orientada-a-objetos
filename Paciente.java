import java.util.Scanner;
public class Paciente{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.printf("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Sexo: ");
		String sexo= entrada.nextLine();
		
		System.out.printf("Peso: ");
		Double peso = entrada.nextDouble();
		
		System.out.printf("Altura: ");
		Double altura = entrada.nextDouble();
		
		System.out.printf("Dia do nascimento: ");
		int dia = entrada.nextInt();
		
		System.out.printf("Mes do nascimento: ");
		int mes = entrada.nextInt();
		
		System.out.printf("Ano do nascimento: ");
		int ano = entrada.nextInt();

		PerfilMedico perfil = new PerfilMedico(nome, sobrenome, dia, mes, ano, sexo, peso, altura);

		
		System.out.printf("%nNome: %s", perfil.getNome());
		System.out.printf("%nSobrenome: %s", perfil.getSobrenome());
		System.out.printf("%nSexo: %s", perfil.getSexo());
		System.out.printf("%nIdade: %d", perfil.getIdade());
		System.out.printf("%nImc: %.1f", perfil.getImc());

		entrada.close();
	}
}
