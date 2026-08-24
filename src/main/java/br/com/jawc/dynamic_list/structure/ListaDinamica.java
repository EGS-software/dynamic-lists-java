/**
 * @author jawc
 */
package main.java.br.com.jawc.dynamic_list.structure;

import main.java.br.com.jawc.dynamic_list.model.Informacao;
import main.java.br.com.jawc.dynamic_list.model.No;

public class ListaDinamica {
    private No inicio;
    private No fim;


    public ListaDinamica() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }

    //TODO: FINALIZAR ESSES METóDOS

    public void inserirOrdenado(Informacao info) {
    }

    public Informacao removerInicio() {
        return null;
    }

    public Informacao removerFim() {
        return null;
    }

    public boolean remover(Informacao info) {
        return false;
    }

    public No buscar(Informacao info) {
        return null;
    }

    public void exibir() {
    }

    public void exibirInverso() {
    }
}
