package models;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Operation {
    private int id;
    private BigDecimal montant;
    private Date date;
    private int compteSource;

    protected Operation(BigDecimal montant, Date date, int compteSource) {
        this.montant = montant;
        this.date = date;
        this.compteSource = compteSource;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCompteSource() {
        return compteSource;
    }

    public void setCompteSource(int compteSource) {
        this.compteSource = compteSource;
    }
}
