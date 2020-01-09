package aula_14;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected float experiencia;

	/* Construtor padrao */
	public Pessoa(String nome, int idade, String sexo, float experiencia) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
	}

	/* GETTERS AND SETTERS */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	/* Declarando metado */
	protected void ganharExperiencia() {

	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}

}
