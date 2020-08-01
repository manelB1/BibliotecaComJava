package tentivafinal.biblio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tentivafinal.biblio.Modelos.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
