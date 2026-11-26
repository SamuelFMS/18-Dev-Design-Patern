package models;

import java.math.BigDecimal;

public class Compte {
    private int id;
    private String numeroCompte;
    private BigDecimal solder;
    private int clientId;

    public Compte(String numeroCompte, BigDecimal solder, int clientId) {
        this.numeroCompte = numeroCompte;
        this.solder = solder;
        this.clientId = clientId;
    }

    public int getId() {
        return id;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public BigDecimal getSolder() {
        return solder;
    }

    public void setSolder(BigDecimal solder) {
        this.solder = solder;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
