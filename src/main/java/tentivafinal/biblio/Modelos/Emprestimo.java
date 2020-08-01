package tentivafinal.biblio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String dataEmprestimo;
    String dataDevolucao;


  /*  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    Usuario usuario;
*/

   @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "livro_emprestimo",
            joinColumns = @JoinColumn(name = "emprestimo_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id"))
    List<Livros> livros;


}
