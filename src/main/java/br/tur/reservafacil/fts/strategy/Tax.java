package br.tur.reservafacil.fts.strategy;

import java.math.BigDecimal;

import br.tur.reservafacil.fts.domain.FTS;

public interface Tax {

    public BigDecimal calculate (FTS fts);
}
