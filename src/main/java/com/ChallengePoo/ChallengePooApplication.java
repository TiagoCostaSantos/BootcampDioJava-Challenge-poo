package com.ChallengePoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ChallengePooApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengePooApplication.class, args);

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição do curso de java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso1.setTitulo("curso PHP");
		curso1.setDescricao("descrição do curso de PHP");
		curso1.setCargaHoraria(7);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria java");
		mentoria.setDescricao("descrição da mentoria java");
		mentoria.setData(LocalDate.now());

		Conteudo conteudo = new Curso();

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescrição("Descrição do bootcamp java developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devTiago = new Dev();
		devTiago.setNome("Tiago");
		devTiago.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos: " + devTiago.getConteudosIncritos());
		devTiago.progredir();
		System.out.println("-");
		System.out.println("Conteúdos incritos: " + devTiago.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos: " + devTiago.getConteudosConcluidos());
		System.out.println("XP: " + devTiago.calcularTotalXp());

		System.out.println("------------");

		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos incritos: " + devJoao.getConteudosIncritos());
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos incritos: " + devJoao.getConteudosIncritos());
		System.out.println("Conteúdos Concluidos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());


//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);

	}

}
