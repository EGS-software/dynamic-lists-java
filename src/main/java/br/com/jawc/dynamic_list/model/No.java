/**
 * @author jawc
 */
package main.java.br.com.jawc.dynamic_list.model;

import lombok.Data;

@Data
public class No {
    private Informacao info;
    private No elop;//ELO PROXIMO, NEXT
    private No eloa;//ELO ANTERIOR, PREV

    public No(Informacao info) {
        this.info = info;
        this.elop = null;
        this.eloa = null;
    }
}
