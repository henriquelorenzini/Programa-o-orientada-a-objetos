public class PerfilMedico {
//Atributos
	private String nome;
	private String sobrenome;
	private String sexo;
	private int dia;
	private int mes;
	private int ano;
	private Double altura;
	private Double peso;
	private Double imc;
//Construtores
	public PerfilMedico(String nome, String sobrenome, int dia, int mes, int ano, String sexo){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.ano = ano;
		this.mes = mes;
		this.sexo = sexo;
	}
//Metodos
	public String getNome(){
		return nome;
	}
	public String getSobrenome (){
		return sobrenome;
	}
	public String getSexo(){
		return sexo;
	}
	public int getDia (){
		return dia;
	}
	public int getMes (){
		return mes;
	}
	public int getAno (){
		return ano;
	}
	public int getIdade (){
		return (2018-getAno());
	}
	public int getFcm(){
		return (220-getIdade());
	}
	public int getFcaMax(){
		return ((getFcm()*85)/100);
	}
	public int getFcaMin(){
		return((getFcm()*50)/100);
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	public void setDia (int dia){
		if(dia > 0 && 31 > dia){
			this.dia = dia;
		}
	}
	public void setMes (int mes){
		if(mes > 0 && 12 > mes){
			this.mes = mes;
		}
	}
	public void setAno (int ano){
		this.ano = ano;
	}
	
    public void getImc(){
        this.imc = this.peso / (this.altura * this.altura);

        if (this.imc < 18.5){
            System.out.printf("Seu IMC e %.2f abaixo do peso%n", this.imc);
        }
        else if (this.imc > 18.5 && imc < 24.9){
            System.out.printf("Seu IMC e %.2f normal%n", this.imc);
        }
        else if (this.imc > 25 && this.imc < 29.9){
            System.out.printf("Seu IMC e %.2f  sobrepeso%n", this.imc);
        }
        else if (this.imc > 30){
            System.out.printf("Seu IMC e %.2f obeso%n", this.imc);
        }

    }

}
