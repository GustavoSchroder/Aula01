package br.com.flexxo.objetos;

import br.com.flexxo.classes.MinhaClasse;

public class Criador {
	
	public static void main(String args[]) {
		
		MinhaClasse objeto1 = new MinhaClasse();
		MinhaClasse objeto2 = new MinhaClasse(4);
		MinhaClasse objeto3 = new MinhaClasse(5);
		
		System.out.println(objeto1.getAtributo());
		System.out.println(objeto2.getAtributo());
		System.out.println(objeto3.getAtributo());
		
	}

}
