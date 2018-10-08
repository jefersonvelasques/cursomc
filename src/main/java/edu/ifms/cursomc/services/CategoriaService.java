package edu.ifms.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifms.cursomc.domain.Categoria;
import edu.ifms.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired //instancia uma dependência
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}

}
