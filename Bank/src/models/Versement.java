package models;

import java.math.BigDecimal;
import java.util.Date;

public class Versement extends Operation {
    private int compteDestination;

    public Versement(BigDecimal montant, Date date, int compteSource, int compteDestination) {
        super(montant, date, compteSource);
        this.compteDestination = compteDestination;
    }

    public int getCompteDestination() {
        return compteDestination;
    }

    public void setCompteDestination(int compteDestination) {
        this.compteDestination = compteDestination;
    }
}
