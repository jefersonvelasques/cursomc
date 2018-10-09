package edu.ifms.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ifms.cursomc.domain.Categoria;
import edu.ifms.cursomc.repositories.CategoriaRepository;
import edu.ifms.cursomc.services.exception.ObjectNotFoundException;


@Service
public class CategoriaService {
	@Autowired //instancia uma dependência
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id +
					", Tipo: " + Categoria.class.getName());
		}
		
		return obj;
	}

}
