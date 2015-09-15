package br.tur.reservafacil.fts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tur.reservafacil.fts.domain.FTS;
import br.tur.reservafacil.fts.factory.TaxFactory;
import br.tur.reservafacil.fts.repository.FTSRepository;

@Service
public class FTSService {

    @Autowired
    private FTSRepository ftsRepository;

    @Autowired
    private TaxFactory taxFactory;

    public List<FTS> getPersistentFTS() {
        return ftsRepository.getPersistentFTS();
    }

    public void addPersistentFTS(FTS fts) {
        fts.setTax(taxFactory.createTaxObject(fts.getType()).calculate(fts));
        ftsRepository.add(fts);
    }
}
