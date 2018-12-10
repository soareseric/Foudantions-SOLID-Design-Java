package br.com.solid.design.srp.coesao;

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
