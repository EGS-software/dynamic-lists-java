# 📝 Trabalho de Estrutura de Dados: Lista Dinâmica

Este repositório contém a implementação da atividade avaliativa sobre **Alocação Dinâmica de Memória (Lista Duplamente Encadeada)**, solicitada na disciplina de Estruturas de Dados.

**Vídeo evidenciando funcionamento do código Java e HTML:** https://youtu.be/-BomrAFp_4M?si=RplJCsbCxnA6K74i



---

**Comparação entre Lista Dinâmica e Lista Matricial**

As duas implementações representam uma lista duplamente encadeada ordenada por nome, mas utilizam estratégias diferentes para armazenar os nós. A **Lista Dinâmica** cria cada objeto `No` com `new` quando ocorre uma inserção. Cada nó possui as referências `elop`, que aponta para o próximo nó, e `eloa`, que aponta para o nó anterior. A **Lista Matricial**, por sua vez, utiliza um vetor de capacidade fixa. Nesse vetor, as posições livres são controladas por uma **Pilha de Nós Disponíveis (PND)**.

### Alocação e liberação de memória

Na Lista Dinâmica, uma inserção solicita espaço para um novo objeto na memória. A remoção religa as referências dos nós vizinhos e o nó removido deixa de fazer parte da estrutura. Quando não existe mais nenhuma referência para esse objeto, ele fica elegível para ser identificado e liberado pelo **Garbage Collector** da JVM. Essa liberação não necessariamente ocorre no mesmo instante da remoção, pois é gerenciada automaticamente pela JVM.

Na Lista Matricial, não são criados novos nós a cada inserção. O vetor e seus nós são alocados previamente, e a PND fornece uma posição livre para ser ocupada. Ao remover um elemento, sua posição retorna para a PND e pode ser reutilizada em uma inserção posterior. Portanto, a memória reservada permanece limitada ao tamanho definido para o vetor.

### Capacidade e esgotamento

Na Lista Matricial, a capacidade é fixa. Quando o vetor está cheio e a PND não possui mais posições disponíveis, uma nova inserção não pode ser realizada, mesmo que o computador ainda tenha memória livre. A aplicação deve detectar essa situação e informar que a lista está cheia.

Na Lista Dinâmica, não existe um limite de quantidade de nós definido pela própria estrutura. Ela pode crescer enquanto a JVM conseguir alocar memória no heap. Se a memória disponível para a JVM se esgotar, a criação de um novo nó pode provocar uma falha de alocação, normalmente representada por `OutOfMemoryError`. Assim, a Lista Dinâmica é mais flexível, mas não é ilimitada: seu limite prático depende da memória disponível e da configuração da JVM.

### Complexidade das operações

Considerando `n` elementos e a busca sequencial necessária para localizar um nome:

| Operação | Lista Dinâmica | Lista Matricial |
| --- | --- | --- |
| Buscar por nome | `O(n)` | `O(n)` |
| Inserir ordenado | `O(n)` | `O(n)` |
| Remover por nome | `O(n)` | `O(n)` |
| Remover início/fim | `O(1)` | `O(1)` ou `O(n)`, conforme a necessidade de deslocar elementos |
| Religar ou reutilizar um nó já localizado | `O(1)` | `O(1)` para a PND, podendo haver deslocamentos no vetor |

Na Lista Dinâmica, depois que o nó é encontrado, a remoção no início, no fim ou no meio exige apenas a atualização de referências, sem deslocar os demais nós. Na Lista Matricial, a busca também pode ser linear; além disso, se a implementação mantiver os elementos fisicamente consecutivos no vetor, inserções e remoções podem exigir o deslocamento de várias posições. A PND reduz o custo de encontrar uma posição livre, mas não elimina esses deslocamentos quando eles são necessários para manter a ordenação física do vetor.

### Vantagens e desvantagens

**Lista Dinâmica**

* Vantagens: cresce conforme a necessidade, não exige reservar previamente uma capacidade máxima e insere ou remove nós sem deslocar os demais elementos. É adequada quando a quantidade de dados varia ou não é conhecida antecipadamente.
* Desvantagens: cada nó ocupa espaço adicional para armazenar referências; os nós podem ficar espalhados na memória, prejudicando a localidade de cache; e a criação de objetos e o trabalho do Garbage Collector podem gerar custo adicional. A estrutura também pode falhar se o heap da JVM ficar sem espaço.

**Lista Matricial**

* Vantagens: possui acesso organizado em um vetor, melhor localidade de memória e controle previsível do consumo máximo. A PND permite reutilizar posições liberadas sem depender do Garbage Collector.
* Desvantagens: possui capacidade fixa, desperdiça espaço quando muitas posições permanecem vazias e não consegue crescer além do tamanho do vetor. Inserções e remoções ordenadas podem exigir deslocamentos, aumentando o custo dessas operações.

Em resumo, a Lista Matricial é interessante quando o limite de elementos é conhecido e a previsibilidade do uso de memória é prioridade. A Lista Dinâmica é mais adequada quando a estrutura precisa crescer e diminuir com frequência, evidenciando o uso de nós alocados individualmente e a recuperação automática de memória pela JVM.


---

## 🚀 Como Executar

* **Lógica Principal (Java):** Abra o projeto na sua IDE de preferência, certifique-se de que a biblioteca/plugin do **Lombok** está instalada e ativa, e execute a classe `Main.java`.
* **Demonstração (Visual):** Dê um duplo clique no arquivo `index.html` na raiz do projeto para abri-lo em um navegador web e interaja através dos botões.