package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
		Gato gato = new Gato(null, null, 0);
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}
}

class Livros {
	private String nome;
	private String npag;
}
