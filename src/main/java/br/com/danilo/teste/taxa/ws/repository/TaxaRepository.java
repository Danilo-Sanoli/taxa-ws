package br.com.danilo.teste.taxa.ws.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.danilo.teste.taxa.ws.entity.Taxa;

public interface TaxaRepository extends CrudRepository<Taxa, Long>{

	Taxa findByCpf(String cpf);
	
}
