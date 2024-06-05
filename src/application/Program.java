package application;

import entities.BootCamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criando cursos
        Curso santander = new Curso();
        santander.setTitulo("Bootcamp Santander");
        santander.setDescricao("Santander");
        santander.setCargaHoraria(4);

        Curso collections = new Curso();
        collections.setTitulo("Collections in Java");
        collections.setDescricao("Collections");
        collections.setCargaHoraria(2);

        //Criando mentoria
        Mentoria mentoriaSantander = new Mentoria();
        mentoriaSantander.setTitulo("DIO");
        mentoriaSantander.setDescricao("Digital innovation one");
        mentoriaSantander.setData(LocalDate.now());

        //Adicionando valores a classe BootCamp
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Santander Java");
        bootCamp.setDescricao("Java Developer");
        bootCamp.getConteudos().add(santander);
        bootCamp.getConteudos().add(collections);
        bootCamp.getConteudos().add(mentoriaSantander);

        //Criando os Dev e utilizando os seus metodos
        Dev ricardoDev = new Dev();
        ricardoDev.setNome("Ricardo");
        ricardoDev.inscreverBootcamp(bootCamp);
        System.out.println("==Conteudos inscritos==");
        System.out.println("Desenvolvedor (a): " + ricardoDev.getNome());
        System.out.println("Conteudos inscritos: " + ricardoDev.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos, aluno: " + ricardoDev.getNome());
        ricardoDev.progredir();
        ricardoDev.progredir();
        System.out.println(ricardoDev.getConteudosConcluidos());
        System.out.println("XP: " + ricardoDev.calcularTotalXp());
        System.out.println();


        Dev camilaDev = new Dev();
        camilaDev.setNome("Camila");
        camilaDev.inscreverBootcamp(bootCamp);
        System.out.println("==Conteudos inscritos==");
        System.out.println("Desenvolvedor (a): " + camilaDev.getNome());
        System.out.println(camilaDev.getConteudosInscritos());
        System.out.println();
        System.out.println("Conteudos concluidos, aluna: " + camilaDev.getNome());
        camilaDev.progredir();
        System.out.println(camilaDev.getConteudosConcluidos());
        System.out.println("XP: " + camilaDev.calcularTotalXp());
        System.out.println();


        sc.close();
    }
}
