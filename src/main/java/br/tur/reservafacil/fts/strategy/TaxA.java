package br.tur.reservafacil.fts.strategy;

import java.math.BigDecimal;

import br.tur.reservafacil.fts.domain.FTS;


public class TaxA implements Tax {

    @Override
    public BigDecimal calculate(FTS fts) {
        BigDecimal taxPercent = new BigDecimal(".03");
        return new BigDecimal(2).add(fts.getValue().multiply(taxPercent));
    }

}
