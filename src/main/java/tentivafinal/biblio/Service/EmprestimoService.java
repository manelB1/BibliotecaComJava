package tentivafinal.biblio.Service;

import org.springframework.stereotype.Service;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Emprestimo;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Repository.EmprestimoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

   private EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public Emprestimo insert(Emprestimo emprestimo){

        return emprestimoRepository.save(emprestimo);
    }
    public Emprestimo update(Emprestimo emprestimo){

        return emprestimoRepository.save(emprestimo);
    }

    public void delete(Emprestimo emprestimo){

        emprestimoRepository.delete(emprestimo);
    }

    public  Emprestimo getOne(Long id){

        return emprestimoRepository.findById(id).orElse(null);
    }
    public Emprestimo saveAndFlush(Emprestimo emprestimo){

        return emprestimoRepository.saveAndFlush(emprestimo);
    }

    public Optional<Emprestimo> findById(Long id){

        return emprestimoRepository.findById(id);
    }

    public List<Emprestimo> getAll(){

        return emprestimoRepository.findAll();

    }
}
