package aula_14;

public class Aula14 {

	public static void main(String[] args) {
		Video v[] = new Video[2];

		v[0] = new Video("Aula de java");
		v[1] = new Video("Aula de php");
		System.out.println(v[0].toString());

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Rodrigo", 33, "M", 8.5f);
		g[1] = new Gafanhoto("Joana", 22, "F", 6.5f);

		//System.out.println(g[0].toString());

		Visualizacao vis[] = new Visualizacao[2];
		vis[0] = new Visualizacao(g[0], v[0]);
		vis[0].avaliar(20);
		System.out.println(vis[0].toString());

	}

}
