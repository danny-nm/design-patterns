package br.com.alura.CriacaoDeObjetosEOBuilder;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		NotaFiscal nf = new NotaFiscalBuilder().paraEmpresa("Caelum")
		.comCnpj("12.345.678/0001-12")
		.com(new ItemDaNota("Item 1", 200.0))
		.com(new ItemDaNota("Item 2", 300.0))
		.com(new ItemDaNota("Item 3", 400.0))
		.comCnpj("observacoes")
		.naData(null)
		.controi();
		
		System.out.println(nf.getValorBruto());
	}

}
