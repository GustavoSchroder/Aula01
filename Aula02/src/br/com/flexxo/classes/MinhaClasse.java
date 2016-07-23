package br.com.flexxo.classes;

public class MinhaClasse extends SuperClasse implements MinhaInterface {
	
	private double atributo;
	
	public MinhaClasse() {
				
	}

	public MinhaClasse(double atributo) {
		
		this.atributo = atributo;
		
		System.out.println(ClasseInterna.atributoEstatico);
		
	}

	public double getAtributo() {
		return atributo;
	}

	public void setAtributo(double atributo) {
		this.atributo = atributo;
	}
	
	@Override
	public void escrever() {

		System.out.println("Escrevendo...");
		
	}

	private class ClasseInterna {
		
		int atributo = 1;
		final static int atributoEstatico = 2;

		public int getAtributo() {
			return atributo;
		}

		public void setAtributo(int atributo) {
			this.atributo = atributo;
		}
	}

}