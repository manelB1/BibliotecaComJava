package tentivafinal.biblio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tentivafinal.biblio.Modelos.Contato;


import tentivafinal.biblio.Service.ContatoService;

import java.util.List;

@RestController
@RequestMapping("/contato")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class ContatoController{

    private ContatoService contatoService;

    public ContatoController(ContatoService contatoService) {
        this.contatoService = contatoService;
    }

    @GetMapping
    public List<Contato> listALL() {
        return contatoService.getAll();
    }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Contato> getOne(@PathVariable Long id) {
        return contatoService.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

   /* @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        usuarioService.insert(usuario);
        return ResponseEntity.status(201).body(usuario);
    }*/

    @PostMapping
    public Contato insert(@RequestBody Contato contato) {

        return contatoService.insert(contato);
    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Contato> update(@PathVariable Long id,
                                          @RequestBody Contato contato) {
        return contatoService.findById(id).map(record -> {
            contatoService.saveAndFlush(contato);
            return ResponseEntity.ok().body(contato);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return contatoService.findById(id).map(record -> {
            contatoService.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }


}
