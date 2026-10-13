package br.com.techinvoice.main;

import br.com.techinvoice.model.DocumentoFactory;
import br.com.techinvoice.model.GerenciadorConfiguracao;
import br.com.techinvoice.model.IDocumento;

public class Main {
    static void main(String[] args) {
        GerenciadorConfiguracao gen1 = GerenciadorConfiguracao.getInstance();
        System.out.println(gen1.getApiKey());
        GerenciadorConfiguracao gen2 = GerenciadorConfiguracao.getInstance();
        System.out.println(gen1 == gen2);

        IDocumento i = DocumentoFactory.criarDocumento("NF");
        i.gerarPDF();

        try {
            DocumentoFactory.criarDocumento("BOLETO");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
