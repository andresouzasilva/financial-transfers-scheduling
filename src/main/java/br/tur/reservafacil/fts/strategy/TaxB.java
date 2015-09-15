package br.tur.reservafacil.fts.strategy;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import br.tur.reservafacil.fts.domain.FTS;


public class TaxB implements Tax {

    @Override
    public BigDecimal calculate(FTS fts) {
        long intervalInDays = TimeUnit.MILLISECONDS.toDays(fts.getSchedulingDate().getTime()) - TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        if(intervalInDays < 31) {
            return new BigDecimal(10);
        }
        return new BigDecimal(8);
    }

}
