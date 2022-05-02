package generation.org.blogPessoal.repository; // repository

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import generation.org.blogPessoal.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase( String descricao);
}


//nome por descricao
@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Tema>> getByName(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(nome));
	}

//put
@PutMapping
	public ResponseEntity<Tema> put (@RequestBody Tema tema){
		return ResponseEntity.ok(repository.save(tema));				
	}    

    import com.sun.istack.NotNull - model Tema - entity I

@Repository - TemaRepository - entity II

descricao no lugar de nome - entity II

@PutMapping - entity II
	public ResponseEntity<Tema> put (@RequestBody Tema tema){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));