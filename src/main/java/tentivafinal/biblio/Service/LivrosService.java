package tentivafinal.biblio.Service;

import org.springframework.stereotype.Service;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Livros;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Repository.ContatoRepository;
import tentivafinal.biblio.Repository.LivrosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    private LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public Livros insert(Livros livros){

        return livrosRepository.save(livros);
    }
    public Livros update(Livros livros){

        return livrosRepository.save(livros);
    }

    public void delete(Livros livros){

        livrosRepository.delete(livros);
    }

    public  Livros getOne(Long id){

        return livrosRepository.findById(id).orElse(null);
    }
    public Livros saveAndFlush(Livros livros){

        return livrosRepository.saveAndFlush(livros);
    }

    public Optional<Livros> findById(Long id){

        return livrosRepository.findById(id);
    }

    public List<Livros> getAll(){

        return livrosRepository.findAll();

    }
}
