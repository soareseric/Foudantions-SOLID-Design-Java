package br.com.solid.design.acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNota{
	
	@Override
    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}