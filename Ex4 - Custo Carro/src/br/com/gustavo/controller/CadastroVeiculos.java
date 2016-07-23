package br.com.gustavo.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.gustavo.model.Carro;

public class CadastroVeiculos {
	private List<Carro> listaCarros;
	private CalculadoraVeiculo cv;
	private static Integer id;
	
	public CadastroVeiculos() {
		this.listaCarros = new ArrayList<>();
		this.cv = new CalculadoraVeiculo();
		CadastroVeiculos.id = 1;
	}
	
	public boolean adicionarCarro(String nome, String fabrica, Double custoConsumidor){
		Carro carro = new Carro(CadastroVeiculos.id++, nome, fabrica, custoConsumidor, cv.calcularCustoFabricacao(custoConsumidor));	
		listaCarros.add(carro);
		return true;
	}
	
	public void alterarCarro(Integer id, String nome, String fabrica, Double custoConsumidor){
		Carro carro = new Carro(id, nome, fabrica, custoConsumidor, cv.calcularCustoFabricacao(custoConsumidor));	
		int cont = 0;
		for(int i = 0; i < this.listaCarros.size(); i++){
			if(this.listaCarros.get(i).getId() == id){
				listaCarros.remove(i);
				listaCarros.add(i, carro);
				cont++;
			}
		}
		if(cont == 0){
			listaCarros.add(carro);
		}
	}
	
	public boolean removerCarro(Integer id){
		int cont = 0;
		for (int i = 0; i < listaCarros.size(); i++) {
			if(this.listaCarros.get(i).getId() == id){
				this.listaCarros.remove(i);
				cont++;
			}
		}
		if(cont == 0){
			return false;
		}else{
			return true;
		}
	}
	
	public List<Carro> listaCarros() throws IndexOutOfBoundsException{
		if(listaCarros.isEmpty()){
			throw new IndexOutOfBoundsException("Não existem carros armazenados.");
		}else{
			return this.listaCarros;
		}
	}
	
	public void carregarDados(){
		adicionarCarro("Fuscao Turbao", "VW", 5000.00);
		adicionarCarro("Polo do Rica", "VW", 45000.00);
		adicionarCarro("CG 1000cc", "Honda", 12000.00);		
	}
}
