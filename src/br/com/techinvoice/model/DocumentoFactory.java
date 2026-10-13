package br.com.techinvoice.model;

public class DocumentoFactory {
    public static IDocumento criarDocumento(String tipo) {
        if (tipo.equalsIgnoreCase("NF")) return new NotaFiscal();
        if (tipo.equalsIgnoreCase("RECIBO")) return new Recibo();

        throw new IllegalArgumentException("Documento inválido.");
    }
}
