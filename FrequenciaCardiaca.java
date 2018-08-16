public class FrequenciaCardiaca {
//Atributos
	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
//Construtores
	public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
//Metodos
	public String getNome(){
		return nome;
	}
	public String getSobrenome (){
		return sobrenome;
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
}
