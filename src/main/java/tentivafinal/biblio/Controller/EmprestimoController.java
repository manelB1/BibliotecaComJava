package tentivafinal.biblio.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Emprestimo;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Service.ContatoService;
import tentivafinal.biblio.Service.EmprestimoService;

import java.util.List;

@RestController
@RequestMapping("/emprestimo")
@CrossOrigin(origins = "http://localhost:3000", exposedHeaders = "X-Total-Count")
public class EmprestimoController {
    private EmprestimoService emprestimoService;


    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @GetMapping
    public List<Emprestimo> listALL() {
        return emprestimoService.getAll();
    }

    @GetMapping(path = { "/{id}" })
    public ResponseEntity<Emprestimo> getOne(@PathVariable Long id) {
        return emprestimoService.findById(id).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

   /* @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario usuario) {
        usuarioService.insert(usuario);
        return ResponseEntity.status(201).body(usuario);
    }*/

    @PostMapping
    public Emprestimo insert(@RequestBody Emprestimo emprestimo) {

        return emprestimoService.insert(emprestimo);
    }

    @PutMapping(path = { "/{id}" })
    public ResponseEntity<Emprestimo> update(@PathVariable Long id,
                                          @RequestBody Emprestimo emprestimo) {
        return emprestimoService.findById(id).map(record -> {
            emprestimoService.saveAndFlush(emprestimo);
            return ResponseEntity.ok().body(emprestimo);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        return emprestimoService.findById(id).map(record -> {
            emprestimoService.delete(record);
            return ResponseEntity.ok().build();
        }).orElse(ResponseEntity.notFound().build());
    }
}
