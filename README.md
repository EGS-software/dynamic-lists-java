# 📝 Trabalho de Estrutura de Dados: Lista Dinâmica

Este repositório contém a implementação da atividade avaliativa sobre **Alocação Dinâmica de Memória (Lista Duplamente Encadeada)**, solicitada na disciplina de Estruturas de Dados.

## ✅ O Que Já Foi Feito

**1. Implementação em Java (Backend do Trabalho)**
* Criação do esqueleto completo do projeto utilizando boas práticas de componentização e **Lombok** para reduzir a verbosidade.
* **Classes `No` e `Informacao`:** Estruturadas para trabalhar com alocação dinâmica pura (utilizando `new`), adotando as referências `elop` (elo próximo) e `eloa` (elo anterior).
* **Classe `ListaDinamica`:** Implementação da lógica de religação de ponteiros cobrindo todos os cenários exigidos:
    * `inserirOrdenado(Informacao)`: Inserção alfabética contínua com tratamento de lista vazia e bloqueio de nomes duplicados.
    * `removerInicio()`, `removerFim()` e `remover(Informacao)`.
    * `buscar(Informacao)`.
    * `exibir()` e `exibirInverso()` (essencial para validar a integridade do ponteiro reverso `eloa`).
* **Classe `Main`:** Casos de teste em console estruturados para validar o funcionamento de todas as operações supracitadas.

**2. Demonstração Visual (Frontend/Animação)**
* Criação do arquivo `index.html` com uma interface construída em HTML, CSS e Vanilla JS.
* O script reproduz a lógica de inserção ordenada, renderizando as quebras e ligações de ponteiros (representados visualmente por setas `⇄` e limites `null`) em tempo real no DOM.

---

## ⚠️ O Que Ainda É Necessário Fazer (To-Do)

Como a entrega é no início da próxima aula, o grupo deve focar nestes pontos finais para concluir a submissão no Google Classroom:

* [ ] **Tópico 2 - Comparação Teórica:** Rascunhar um texto documentando a diferença entre esta Lista Dinâmica (uso direto de memória gerenciada pelo Garbage Collector) e a Lista Matricial (vetor de capacidade fixa gerenciado por uma Pilha de Nós Disponíveis - PND).
    * *Ponto de atenção:* Não esquecer de citar vantagens/desvantagens e o comportamento de esgotamento de memória em ambas.
* [ ] **Evidências de Execução (Tópico 4):** Gravar a tela demonstrando o código Java executando no console e capturar a animação HTML em funcionamento.
* [ ] **Declaração de IA:** Redigir o documento final do grupo incluindo a declaração obrigatória sobre a utilização de Inteligência Artificial generativa, detalhando as etapas e testes realizados por nós.

---

## 🎨 Observação Sobre a Animação Visual

O arquivo `index.html` entregue serve como um **MVP (Produto Mínimo Viável)**. Ele cumpre integralmente o requisito de demonstrar o comportamento dos ponteiros de forma interativa. No entanto, **a fluidez desta etapa pode ser melhorada**.

Caso o grupo tenha disponibilidade de tempo antes da entrega, sugerimos aprimorar o código adicionando:
* Efeitos de transição e animações CSS (`transform`, `transition`) para que os nós deslizem para suas posições e não apenas "apareçam" de forma estática.
* Feedback visual temporário (como a mudança de cor da borda do nó) para evidenciar a varredura do laço de repetição durante os processos de busca e inserção ordenada.

---

## 🚀 Como Executar

* **Lógica Principal (Java):** Abra o projeto na sua IDE de preferência, certifique-se de que a biblioteca/plugin do **Lombok** está instalada e ativa, e execute a classe `Main.java`.
* **Demonstração (Visual):** Dê um duplo clique no arquivo `index.html` na raiz do projeto para abri-lo em um navegador web e interaja através dos botões.