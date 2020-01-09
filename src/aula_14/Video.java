package aula_14;

public class Video implements AcoesVideo {
	private String titulo;
	private int avalicao;
	private int views;
	private boolean reproduzindo;

	/* Construtor padrao */
	public Video(String titulo) {
		this.titulo = titulo;
		this.avalicao = 1;
		this.views = 0;
		this.reproduzindo = false;
	}
	

	/* GETTERS AND SETTERS */
	public String getTitulo() {
		return titulo;
	}

	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(int avalicao) {
		this.avalicao = avalicao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	/* Implementado metados abstract da Interface da Classe AcoesVideos */
	@Override
	public void play() {
		this.reproduzindo= true;
	}

	@Override
	public void pause() {
		this.reproduzindo= false;

	}

	@Override
	public void like() {
		this.views ++;

	}


	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avalicao=" + avalicao + ", views=" + views + ", reproduzindo="
				+ reproduzindo + "]";
	}
	
	

}
