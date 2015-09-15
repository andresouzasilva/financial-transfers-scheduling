package br.tur.reservafacil.fts.strategy;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import br.tur.reservafacil.fts.domain.FTS;


public class TaxC implements Tax {

    @Override
    public BigDecimal calculate(FTS fts) {

        long intervalInDays = TimeUnit.MILLISECONDS.toDays(fts.getSchedulingDate().getTime()) - TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        return fts.getValue().multiply(getTaxPercent(intervalInDays));
    }

    public BigDecimal getTaxPercent(long intervalInDays) {

        if(intervalInDays <= 5) {
            return new BigDecimal(".083");
        }
        if(intervalInDays <= 10) {
            return new BigDecimal(".074");
        }
        if(intervalInDays <= 15) {
            return new BigDecimal(".067");
        }
        if(intervalInDays <= 20) {
            return new BigDecimal(".054");
        }
        if(intervalInDays <= 25) {
            return new BigDecimal(".043");
        }
        if(intervalInDays <= 30) {
            return new BigDecimal(".021");
        }

        return new BigDecimal(".012");
    }

}
