package com.br.zup.catalogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppCatalogo {

	public static void main(String[] args) {

		List<String> listaAtores = new ArrayList<String>();

		int verificador = 1;

		while (verificador == 1) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Digite 1 para adicionar um filme \n" + "Digite 2 para adicionar um livro \n"
					+ "Digite 3 para adicionar uma mucica \nDigite 4 para sair \n");

			int controle = scan.nextInt();

			if (controle == 1) {
				Scanner scanIffilme = new Scanner(System.in);

				System.out.println("Digite o nome do filme");
				String nome = scanIffilme.nextLine();

				System.out.println("Digite o genero do filme");
				String genero = scanIffilme.nextLine();

				System.out.println("Digite a categoria do filme");
				String categoria = scanIffilme.nextLine();

				System.out.println("Digite a duração do filme");
				int duracao = scanIffilme.nextInt();

				int controle2 = 1;

				while (controle2 == 1) {
					Scanner scanWhFilme = new Scanner(System.in);
					System.out.println("Digite o nome do ator");

					listaAtores.add(scanWhFilme.nextLine());

					System.out.println("\nDeseja incluir outro ator?\n" + "Digite 1 para sim ou 2 para não");

					controle2 = scanWhFilme.nextInt();

				}

				Filme filme = new Filme(nome, categoria, genero, duracao, listaAtores);

				System.out.println("\n-------Filme Cadastrado-----\n" + filme.toString());

				System.out.println("\n\nDeseja voltar para o menu principal?\n" + " 1 para sim ou 2 para não");
				verificador = scan.nextInt();

			} else if (controle == 2) {

				Scanner scanLivro = new Scanner(System.in);

				System.out.println("Digite o titulo do livro");
				String nome = scanLivro.nextLine();

				System.out.println("Digite a categoria do livro");
				String categoria = scanLivro.nextLine();

				System.out.println("Digite o autor do livro");
				String autor = scanLivro.nextLine();

				System.out.println("Digite a quantidade de paginas do livro");
				int paginas = scanLivro.nextInt();

				Livro livro = new Livro(nome, categoria, autor, paginas);

				System.out.println("------Livro Cadastrado-----\n " + livro.toString());

				System.out.println("\n\nDeseja voltar para o menu principal?\n" + " 1 para sim ou 2 para não");
				verificador = scan.nextInt();

			} else if (controle == 3) {
				Scanner scanMusica = new Scanner(System.in);

				System.out.println("Digite o nome da musica");
				String nome = scanMusica.nextLine();

				System.out.println("Digite o nome do cantor");
				String cantor = scanMusica.nextLine();

				System.out.println("Digite o nome da banda");
				String banda = scanMusica.nextLine();

				System.out.println("Digite o genero");
				String genero = scanMusica.nextLine();

				System.out.println("Digite a categoria");
				String categoria = scanMusica.nextLine();

				Mucica musica = new Mucica(nome, categoria, cantor, banda, genero);

				System.out.println("------Musica cadastrada------\n" + musica.toString());

				System.out.println("\n\nDeseja voltar para o menu principal?\n" + " 1 para sim ou 2 para não");
				verificador = scan.nextInt();

			} else if (controle == 4) {

				verificador = 2;
			}

		}

	}

}
