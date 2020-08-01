package tentivafinal.biblio.Service;

import org.springframework.stereotype.Service;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Repository.ContatoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {
    private ContatoRepository contatoRepository;

    public ContatoService(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;

    }

    public Contato insert(Contato contato){

        return contatoRepository.save(contato);
    }
    public Contato update(Contato contato){

        return contatoRepository.save(contato);
    }

    public void delete(Contato contato){

        contatoRepository.delete(contato);
    }

    public  Contato getOne(Long id){

        return contatoRepository.findById(id).orElse(null);

    }

    public Contato saveAndFlush(Contato contato){

        return contatoRepository.saveAndFlush(contato);
    }

    public Optional<Contato> findById(Long id){

        return contatoRepository.findById(id);
    }

    public List<Contato> getAll(){

        return contatoRepository.findAll();

    }
}
