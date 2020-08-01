package tentivafinal.biblio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tentivafinal.biblio.Modelos.Contato;

public interface ContatoRepository extends JpaRepository<Contato,Long> {
}
