package tentivafinal.biblio.Service;

import org.springframework.stereotype.Service;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario insert(Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario){

        return usuarioRepository.save(usuario);
    }

    public void delete(Usuario usuario){

        usuarioRepository.delete(usuario);
    }

    public  Usuario getOne(Long id){

        return usuarioRepository.findById(id).orElse(null);
    }
    public Usuario saveAndFlush(Usuario usuario){

        return usuarioRepository.saveAndFlush(usuario);
    }

    public Optional<Usuario> findById(Long id){

        return usuarioRepository.findById(id);
    }

    public List<Usuario> getAll(){

        return usuarioRepository.findAll();

    }
}
