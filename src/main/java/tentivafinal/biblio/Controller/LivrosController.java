package tentivafinal.biblio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Livros;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Service.ContatoService;
import tentivafinal.biblio.Service.LivrosService;

import java.util.List;

@RestController
@RequestMapping("/livros")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class LivrosController {
    private LivrosService livrosService;


    public LivrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }


    @GetMapping
    public List<Livros> listALL() {
        return livrosService.getAll();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Livros> getOne(@PathVariable Long id) {
        return livrosService.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

   /* @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        usuarioService.insert(usuario);
        return ResponseEntity.status(201).body(usuario);
    }*/

    @PostMapping
    public Livros insert(@RequestBody Livros livros) {

        return livrosService.insert(livros);
    }

    @PutMapping(path = {"/{id}"})
    public ResponseEntity<Livros> update(@PathVariable Long id,
                                         @RequestBody Livros livros) {
        return livrosService.findById(id).map(record -> {
            livrosService.saveAndFlush(livros);
            return ResponseEntity.ok().body(livros);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return livrosService.findById(id).map(record -> {
            livrosService.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}