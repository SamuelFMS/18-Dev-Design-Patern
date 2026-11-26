package models;

import java.math.BigDecimal;
import java.util.Date;

public class Retrait extends Operation{
    public Retrait(BigDecimal montant,
                 Date date,
                 int compteSource) {
        super(montant, date, compteSource);
    }
}
