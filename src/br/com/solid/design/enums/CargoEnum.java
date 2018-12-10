package br.com.solid.design.enums;

import br.com.solid.design.impl.RegraDeCalculoImpl;
import br.com.solid.design.services.DezOuVintePorcentoService;
import br.com.solid.design.services.QuinzeOuVinteCincoPorcentoService;

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
