package tentivafinal.biblio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import tentivafinal.biblio.Modelos.Contato;
import tentivafinal.biblio.Modelos.Emprestimo;
import tentivafinal.biblio.Modelos.Livros;
import tentivafinal.biblio.Modelos.Usuario;
import tentivafinal.biblio.Repository.ContatoRepository;
import tentivafinal.biblio.Repository.EmprestimoRepository;
import tentivafinal.biblio.Repository.LivrosRepository;
import tentivafinal.biblio.Repository.UsuarioRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class RunMyCode implements ApplicationRunner {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    LivrosRepository livrosRepository;
    @Autowired
    ContatoRepository contatoRepository;
    @Autowired
    EmprestimoRepository emprestimoRepository;


    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
/*
        Usuario u1 = new Usuario();
        Contato c1 = new Contato();

        u1.setNome("Joao");
        c1.setEmail("gmail.com");

        u1.setContato(c1);
        c1.setUsuario(u1);

        usuarioRepository.save(u1);
*/








        /*

        Emprestimo e1 = new Emprestimo();
        e1.setDataEmprestimo("05/06/2020");
        e1.setDataDevolucao("20/06/2020");

        Livros l1 = new Livros();
        l1.setNomeLivro("Java é uma merda");
        l1.setEditora("Vai da certo essa pomba");

        List<Livros> livros = new ArrayList<>();
        livros.add(l1);
        l1.setEmprestimos(e1);
        e1.setLivros(livros);

        Usuario u1 = new Usuario();
        u1.setNome("Joao");
        List<Usuario> usuarioList = new ArrayList<>();
        usuarioList.add(u1);
        */


























        





    }
}
