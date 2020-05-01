package org.lamemind.comunijson.bean;

/**
 * @author lamemind
 */
public class CityRegioneBean {

    private String codice;
    private String nome;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "CityRegioneBean{" + "codice=" + codice + ", nome=" + nome + '}';
    }
    
}
