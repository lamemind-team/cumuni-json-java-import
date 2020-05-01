package org.lamemind.comunijson.bean;

import java.util.List;

/**
 * @author lamemind
 */
public class CityBean {

    private String nome;
    private String codice;
    private CityZoneBean zona;
    private CityRegioneBean regione;
    private CityProvinciaBean provincia;
    private String sigla;
    private String codiceCatastale;
    private List<String> cap;
    private int popolazione;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public CityZoneBean getZona() {
        return zona;
    }

    public void setZona(CityZoneBean zona) {
        this.zona = zona;
    }

    public CityRegioneBean getRegione() {
        return regione;
    }

    public void setRegione(CityRegioneBean regione) {
        this.regione = regione;
    }

    public CityProvinciaBean getProvincia() {
        return provincia;
    }

    public void setProvincia(CityProvinciaBean provincia) {
        this.provincia = provincia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodiceCatastale() {
        return codiceCatastale;
    }

    public void setCodiceCatastale(String codiceCatastale) {
        this.codiceCatastale = codiceCatastale;
    }

    public List<String> getCap() {
        return cap;
    }

    public void setCap(List<String> cap) {
        this.cap = cap;
    }

    public int getPopolazione() {
        return popolazione;
    }

    public void setPopolazione(int popolazione) {
        this.popolazione = popolazione;
    }

    @Override
    public String toString() {
        return "CityBean{" + "nome=" + nome + ", codice=" + codice + ", zona=" + zona + ", regione=" + regione + ", provincia=" + provincia + ", sigla=" + sigla + ", codiceCatastale=" + codiceCatastale + ", cap=" + cap + ", popolazione=" + popolazione + '}';
    }
}
