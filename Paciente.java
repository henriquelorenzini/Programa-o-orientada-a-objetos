import java.util.Scanner;
public class Paciente{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		 PerfilMedico paciente = new PerfilMedico(nome, sobrenome, sexo, dia, mes, ano);
		
		
		System.out.printf("Nome: ");
		String nome = entrada.nextLine();
		perfil.setNome(nome);
		
		System.out.printf("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		perfil.setSobrenome(sobrenome);
		
		System.out.printf("Sexo: ");
		String sexo= entrada.nextLine();
		perfil.setSexo(sexo);
		
		System.out.printf("Peso: ");
		Double peso = entrada.nextFloat();
		perfil.setPeso(peso);
		
		System.out.printf("Altura: ");
		Double altura = entrada.nextFloat();
		perfil.setAltura(altura);
		
		System.out.printf("Dia do nascimento: ");
		int dia = entrada.nextInt();
		perfil.setDia(dia);
		
		System.out.printf("Mes do nascimento: ");
		int mes = entrada.nextInt();
		perfil.setMes(mes);
		
		System.out.printf("Ano do nascimento: ");
		int ano = entrada.nextInt();
		perfil.setAno(ano);
		
		System.out.printf("%nNome: %d", perfil.getNome());
		System.out.printf("%nSobrenome: %d", perfil.getSobrenome());
		System.out.printf("%nSexo: %d", perfil.getSexo());
		System.out.printf("%nIdade: %d", perfil.getIdade());
		System.out.printf("Imc: %d", perfil.getImc());

		entrada.close();
	}
}
