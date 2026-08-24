/**
 * @author jawc
 */
package main.java.br.com.jawc.dynamic_list.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Informacao {
    private String nome;

    public int compararCom(Informacao outra){
        return this.nome.compareToIgnoreCase(outra.getNome());
    }
}
