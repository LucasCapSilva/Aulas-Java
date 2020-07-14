package com.generation.ecommerce.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Categoria;
import com.generation.ecommerce.repository.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	} 
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Categoria>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> Post(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> Put(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@PutMapping("{id}/foto")
    public byte[] addPhoto(@PathVariable Long id,
                           @RequestParam("foto") Part arquivo){
        Optional<Categoria> categoria = repository.findById(id);
        return categoria.map( c -> {
            try{
                InputStream is = arquivo.getInputStream();
                byte[] bytes = new byte[(int) arquivo.getSize()];
                IOUtils.readFully(is, bytes);
                c.setFoto(bytes);
                repository.save(c);
                is.close();
                return bytes;
            }catch (IOException e){
                return null;
            }
        }).orElse(null);
    }
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
