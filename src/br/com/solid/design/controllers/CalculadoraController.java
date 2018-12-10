package br.com.solid.design.controllers;

import static br.com.solid.design.enums.CargoEnum.DBA;
import static br.com.solid.design.enums.CargoEnum.DESENVOLVEDOR;
import static br.com.solid.design.enums.CargoEnum.TESTER;

import br.com.solid.design.model.Funcionario;
import br.com.solid.design.services.DezOuVintePorcentoService;
import br.com.solid.design.services.QuinzeOuVinteCincoPorcentoService;

public class CalculadoraController{

	
	    public double calcula(Funcionario funcionario) {
	    	return funcionario.getCalculaSalario();
	    }	

	}

