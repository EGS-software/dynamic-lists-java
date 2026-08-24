/**
 * @author jawc-05
 */
package main.java.br.com.jawc.dynamic_list.principal;

import main.java.br.com.jawc.dynamic_list.model.Informacao;
import main.java.br.com.jawc.dynamic_list.structure.ListaDinamica;

public class Main {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaDinamica();

        System.out.println("--- TESTE DE INSERÇÃO ORDENADA ---");

        // 1. Inserindo o primeiro (Cenário: Lista Vazia)
        lista.inserirOrdenado(new Informacao("Carlos"));

        // 2. Inserindo antes do primeiro (Cenário: Início)
        lista.inserirOrdenado(new Informacao("Ana"));

        // 3. Inserindo depois de todos (Cenário: Fim)
        lista.inserirOrdenado(new Informacao("Zebra"));

        // 4. Inserindo no meio (Cenário: Meio)
        lista.inserirOrdenado(new Informacao("Beto"));

        // 5. Tentando inserir duplicado (Cenário: Duplicata)
        lista.inserirOrdenado(new Informacao("Ana"));

        System.out.println("\nExibindo na ordem normal (usando elop):");
        lista.exibir(); // Esperado: [Ana] [Beto] [Carlos] [Zebra]

        System.out.println("\nExibindo na ordem inversa (usando eloa):");
        lista.exibirInverso(); // Esperado: [Zebra] [Carlos] [Beto] [Ana]

    }
}