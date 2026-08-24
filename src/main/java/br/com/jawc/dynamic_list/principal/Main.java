/**
 * @author jawc-05
 */
package main.java.br.com.jawc.dynamic_list.principal;

import main.java.br.com.jawc.dynamic_list.model.Informacao;
import main.java.br.com.jawc.dynamic_list.model.No;
import main.java.br.com.jawc.dynamic_list.structure.ListaDinamica;

public class Main {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();

        System.out.println("--- 1. INSERÇÃO E EXIBIÇÃO ---");
        lista.inserirOrdenado(new Informacao("Carlos"));
        lista.inserirOrdenado(new Informacao("Ana"));
        lista.inserirOrdenado(new Informacao("Zebra"));
        lista.inserirOrdenado(new Informacao("Beto"));
        lista.exibir(); // [Ana] [Beto] [Carlos] [Zebra]

        System.out.println("\n--- 2. TESTE DE BUSCA ---");
        No busca1 = lista.buscar(new Informacao("Carlos"));
        System.out.println("Buscou 'Carlos': " + (busca1 != null ? "Encontrado!" : "Não encontrado."));

        No busca2 = lista.buscar(new Informacao("Pedro"));
        System.out.println("Buscou 'Pedro': " + (busca2 != null ? "Encontrado!" : "Não encontrado."));

        System.out.println("\n--- 3. TESTE DE REMOÇÃO ---");
        System.out.println("Removendo do meio (Carlos)...");
        lista.remover(new Informacao("Carlos"));
        lista.exibir(); // [Ana] [Beto] [Zebra]

        System.out.println("\nRemovendo do início (removerInicio)...");
        lista.removerInicio();
        lista.exibir(); // [Beto] [Zebra]

        System.out.println("\nRemovendo do fim (removerFim)...");
        lista.removerFim();
        lista.exibir(); // [Beto]

        System.out.println("\nEsvaziando a lista (removerFim)...");
        lista.removerFim();
        lista.exibir(); // A lista está vazia.

        System.out.println("\nTentando remover de lista vazia...");
        lista.removerInicio(); // Deve exibir aviso de lista vazia
    }
}