package br.com.solid.design.services;

import br.com.solid.design.impl.RegraDeCalculoImpl;
import br.com.solid.design.model.Funcionario;

public class QuinzeOuVinteCincoPorcentoService implements RegraDeCalculoImpl{
	
	@Override
	public double calcula(Funcionario funcionario) {
		 if(funcionario.getSalarioBase() > 2000.0) {
	            return funcionario.getSalarioBase() * 0.75;
	        }
	        else {
	            return funcionario.getSalarioBase() * 0.85;
	        }
	}
	
}
