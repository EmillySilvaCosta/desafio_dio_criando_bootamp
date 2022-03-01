package desafio_dio_bootcamp;

//abstract nao consigo instanciar o conteudo
public abstract class Conteudo {
//çriando atributos da classe conteudo
	// final estou representando uma constante

	protected static final double XP_PADRAO = 10;
	private String titulo;
	private String descricao;

	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
