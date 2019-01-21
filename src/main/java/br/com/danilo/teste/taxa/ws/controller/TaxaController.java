package br.com.danilo.teste.taxa.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.teste.taxa.ws.entity.Taxa;
import br.com.danilo.teste.taxa.ws.repository.TaxaRepository;

@RestController
@RequestMapping("/taxas")
@CrossOrigin(origins = "http://localhost:3000")
public class TaxaController {
	
	@Autowired
	private TaxaRepository repository;
	
    @PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
	public Taxa saveTaxa(@RequestBody Taxa taxa) {
		return repository.save(taxa);
	}
    
    @GetMapping(value = "/cpf/{cpf}")
    public List<Taxa> findByCpf(@PathVariable("cpf") String cpf) {
    	return repository.findByCpf(cpf);
    }

}
