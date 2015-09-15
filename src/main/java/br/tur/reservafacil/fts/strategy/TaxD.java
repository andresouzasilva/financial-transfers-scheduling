package br.tur.reservafacil.fts.strategy;

import java.math.BigDecimal;

import br.tur.reservafacil.fts.domain.FTS;


public class TaxD implements Tax {

    @Override
    public BigDecimal calculate(FTS fts) {

        if(fts.getValue().compareTo(new BigDecimal(25000)) < 1){
            return new TaxA().calculate(fts);
        }

        if(fts.getValue().compareTo(new BigDecimal(120000)) < 1){
            return new TaxB().calculate(fts);
        }

        return new TaxC().calculate(fts);
    }
}
