package desafio_dio_bootcamp;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// a partir da palavra new instancio o objeto
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso JavaScript");
		curso2.setDescricao("descrição curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("curso Phython");
		curso3.setDescricao("descrição curso Phython");
		curso3.setCargaHoraria(6);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		
		System.out.println("Olá, Dev. Bem- vindo a Dio! Por favor, informe seu nome: ");
		String nome = scan.next();
		System.out.println("Agora escolha o que deseja fazer " + nome +"!");
		int opcao = 0;
		Dev devnome = new Dev();
		
		
		
		System.out.println("----------------------");
		do {
			System.out.println("<< 1-Curso 2-Progredir 3-Verificar XP 4-Sair >>");
			opcao = scan.nextInt();
			
			switch(opcao) {
			case 1:
				devnome.inscreverBootcamp(bootcamp);
				System.out.println("Inscrito nos Bootcamps." + devnome.getConteudosInscritos());
				break;
			case 2:
				devnome.progredir();
				System.out.println("Conteúdos Concluídos" + devnome.getConteudosConcluidos());
				break;
				
			case 3:
				System.out.println("XP:" + devnome.calcularTotalXp());
				break;
				
			case 4:
				System.out.println("Encerrando por hoje. Amanhã tem mais!");
				break;
				
				default:					
					System.out.println("Por favor, informe um valor válido");
					break;
				
			}
			
		}while(opcao != 4);
		

	}

}
