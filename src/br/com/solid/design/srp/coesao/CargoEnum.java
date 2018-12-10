package br.com.solid.design.srp.coesao;

public enum CargoEnum {
	DESENVOLVEDOR(new DezOuVintePorcentoService()), DBA(new QuinzeOuVinteCincoPorcentoService()),
	TESTER(new QuinzeOuVinteCincoPorcentoService());

	private RegraDeCalculoImpl regra;

	CargoEnum(RegraDeCalculoImpl regra) {
		this.regra = regra;
	}

	public RegraDeCalculoImpl getRegra() {
		return regra;
	}
}
