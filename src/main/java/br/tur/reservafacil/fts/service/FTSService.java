package br.tur.reservafacil.fts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.tur.reservafacil.fts.domain.FTS;
import br.tur.reservafacil.fts.factory.TaxFactory;
import br.tur.reservafacil.fts.repository.FTSRepository;

@Service
public class FTSService {

	private static final Logger log = LoggerFactory.getLogger(FTSService.class);

    @Autowired
    private FTSRepository ftsRepository;

    @Autowired
    private TaxFactory taxFactory;

    public List<FTS> getPersistentFTS() {
    	log.info("List all FTS service called");
        return ftsRepository.getPersistentFTS();
    }

    public void addPersistentFTS(FTS fts) {
    	log.info("Add FTS service called: " + fts);
        fts.setTax(taxFactory.createTaxObject(fts.getType()).calculate(fts));
        ftsRepository.add(fts);
    }
}
