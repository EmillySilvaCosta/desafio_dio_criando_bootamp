package desafio_dio_bootcamp;

public class Curso extends Conteudo {
	// encapsulamos os atributos

	private int cargaHoraria;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargaHoraria;
	}

	public Curso() {

	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

//imprimindo pra ver se ficou tudo direitinho
	@Override
	public String toString() {
		return "\nCurso [título = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHoraria = " + cargaHoraria
				+ "]";
	}

}
