package br.tur.reservafacil.fts.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.tur.reservafacil.fts.domain.FTS;

@Component
public class FTSRepository {

    private final List<FTS> persistentFTS = new ArrayList<>();

    public List<FTS> getPersistentFTS() {
        return persistentFTS;
    }

    public void add(FTS fts) {
        persistentFTS.add(fts);
    }
}