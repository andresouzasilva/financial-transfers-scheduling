package br.tur.reservafacil.fts.factory;

import org.springframework.stereotype.Component;

import br.tur.reservafacil.fts.domain.FTS.Type;
import br.tur.reservafacil.fts.strategy.Tax;
import br.tur.reservafacil.fts.strategy.TaxA;
import br.tur.reservafacil.fts.strategy.TaxB;
import br.tur.reservafacil.fts.strategy.TaxC;
import br.tur.reservafacil.fts.strategy.TaxD;

@Component
public class TaxFactory {

    public Tax createTaxObject(Type type) {
        switch (type) {
            case A:
                return new TaxA();
            case B:
                return new TaxB();
            case C:
                return new TaxC();
            case D:
                return new TaxD();
            default:
                throw new RuntimeException("Unsupported field \"type\" ");
        }
    }

}
