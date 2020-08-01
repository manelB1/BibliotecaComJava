package tentivafinal.biblio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Service.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class UsuarioController{
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listALL() {
        return usuarioService.getAll();
    }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Usuario> getOne(@PathVariable Long id) {
        return usuarioService.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

   /* @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        usuarioService.insert(usuario);
        return ResponseEntity.status(201).body(usuario);
    }*/

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {

        return usuarioService.insert(usuario);
    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Usuario> update(@PathVariable Long id,
                                          @RequestBody Usuario usuario) {
        return usuarioService.findById(id).map(record -> {
            usuarioService.saveAndFlush(usuario);
            return ResponseEntity.ok().body(usuario);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return usuarioService.findById(id).map(record -> {
            usuarioService.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }







}
