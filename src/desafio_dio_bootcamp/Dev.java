package desafio_dio_bootcamp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	// adiciona um elemento de cada vez e organiza em ordem a medida que eu for me
	// inscrevendo
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	

	public void inscreverBootcamp(Bootcamp bootcamp) {
    this.conteudosInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()){
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("Voc� n�o est� matriculado em nenhum conte�do!");
		}
	}
	
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp())
				.sum();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	

	
}
