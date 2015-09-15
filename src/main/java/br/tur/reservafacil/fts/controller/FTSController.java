package br.tur.reservafacil.fts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.tur.reservafacil.fts.controller.error.ExceptionHandler;
import br.tur.reservafacil.fts.domain.FTS;
import br.tur.reservafacil.fts.service.FTSService;


@RestController()
public class FTSController extends ExceptionHandler {

    @Autowired
    private FTSService ftsService;

    @RequestMapping(value="/fts", method=RequestMethod.GET)
    public List<FTS> getAll() {
        return ftsService.getPersistentFTS();
    }

    @RequestMapping(value="/fts", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public void add(@Valid @RequestBody FTS fts) {
        ftsService.addPersistentFTS(fts);
    }
}
