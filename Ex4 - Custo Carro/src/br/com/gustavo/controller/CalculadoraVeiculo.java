package br.com.gustavo.controller;

public class CalculadoraVeiculo {
	public Double calcularCustoFabricacao(Double custoTotal){
		Double custoRevenda = custoTotal*0.10;
		Double custoImpostos = custoTotal *0.20;
		return custoTotal - custoRevenda - custoImpostos;
	}
}
