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
        No novoNo = new No(info);

        //LISTA VAZIA CENARIO
        if (isEmpty()) {
            inicio = novoNo;
            fim = novoNo;
            return;
        }

        No atual = inicio;

        //PERCORRENDO A LISTA PARA ACHAR O PONTO DE INSERCAO
        while (atual != null){
            int comparacao = info.compararCom(atual.getInfo());

            //ELEMENTO DUPLICA(IGNORA E AVISA)
            if (comparacao == 0) {
                System.out.println("Aviso: '" + info.getNome() + "' já existe na lista. Inserção ignorada.");
                return;
            }

            //ENCONTROU A POSICAO e o NOVO ELEMENTO É ALFABETICAMNTE MENOR
            if (comparacao < 0) {
                novoNo.setElop(atual);//o PROXIMO DO NOVO NO é O NO ATUAL
                novoNo.setEloa(atual.getEloa());//O anterior do novo nó é o que vinha antes do atual

                if (atual.getEloa() != null) {
                    // Inserção no MEIO da lista: O nó anterior precisa apontar para o novo nó
                    atual.getEloa().setElop(novoNo);
                } else {
                // Inserção no INÍCIO da lista: Não tem ninguém antes, então ele vira o novo início
                inicio = novoNo;
            }
            // Por fim, o anterior do nó atual passa a ser o novo nó
            atual.setEloa(novoNo);
            return;
            }

            //AVANÇA PARA O pROXÍMO NÓ SE AINDA NAO ACHOU POSICAO
            atual = atual.getElop();
        }
        //INSERCAO NO FIM DA LSITA(percorreu tudo e novo elemento é "maior"
        fim.setElop(novoNo); // O antigo fim aponta para o novo nó
        novoNo.setEloa(fim); // O anterior do novo nó é o antigo fim
        fim = novoNo; // O fim da lista é atualizado para o novo nó

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
        if (isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }
        No atual = inicio;
        System.out.print("Lista (Início -> Fim): ");
        while (atual != null) {
            System.out.print("[" + atual.getInfo().getNome() + "] ");
            atual = atual.getElop();
        }
        System.out.println();
    }

    public void exibirInverso() {
    }
}
