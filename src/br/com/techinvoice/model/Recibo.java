package br.com.techinvoice.model;

public class Recibo implements IDocumento {
    @Override
    public void gerarPDF() {
        System.out.println("Gerando recibo simples de pagamento...");
    }
}
