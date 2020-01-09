package aula_14;

public class Gafanhoto extends Pessoa {
	
	public Gafanhoto(String nome, int idade, String sexo, float experiencia) {
		super(nome, idade, sexo, experiencia);
		this.login= login;
		this.totAssistido= 0;
		
	}

	private String login;
	private int totAssistido;
	
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	/*Declarando metados*/
	private void viuMaisum() {
		
	}
	/*super.toString() esta chamando os dados da Classe Pessoa*/
	@Override
	public String toString() {
		return "Gafanhoto [login=" + super.toString() + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	
	

	

}
