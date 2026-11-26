package models;

import java.math.BigDecimal;
import java.util.Date;

public class Depot extends Operation {
    public Depot(BigDecimal montant,
                 Date date,
                 int compteSource) {
        super(montant, date, compteSource);
    }
}
