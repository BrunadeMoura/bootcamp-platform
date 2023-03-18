import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("aprendendo POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("aprendendo node");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("professor de java a 10 anos");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("O que falta para você se tornar um desenvolvedor Java e começar 2023 com uma formação completa? Inscreva-se já no Orange Tech+ Back-End e tenha mais de 80 horas para transformar sua carreira e conquistar as melhores vagas do mercado tech em 2023! Tenha acesso a módulos sobre a linguagem Java que vão desde o básico e introdução ao ambiente até códigos mais avançados e frameworks mais usados.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        devBruna.porgredir();
        devBruna.porgredir();
        System.out.println("Conteudos inscritos Bruna: " + devBruna.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruna: " + devBruna.getConteudosConcluidos());
        System.out.println("XP: " + devBruna.calcularTotalXp());

        System.out.println("----------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.porgredir();
        devJoao.porgredir();
        devJoao.porgredir();
        System.out.println("Conteudos inscritos João: " + devBruna.getConteudosInscritos());
        System.out.println("Conteudos concluidos João: " + devBruna.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}