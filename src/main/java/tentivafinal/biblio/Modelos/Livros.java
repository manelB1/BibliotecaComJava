package tentivafinal.biblio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nomeLivro;
    String editora;

    //@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //@JoinColumn(name = "usuario_id")
    //Livros livros;


    // @ManyToOne
    //@JoinColumn(name = "setorial_id")
    //Setorial setorial;





   // @ManyToOne
   // @JoinColumn(name = "usuario_id")
   // Usuario usuario;



  /* @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "livros_emprestimo",
            joinColumns = @JoinColumn(name = "livros_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "emprestimo_id"))
    List<Emprestimo> emprestimos;
    */



}
