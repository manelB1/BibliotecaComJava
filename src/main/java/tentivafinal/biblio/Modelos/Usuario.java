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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;
    String nome;

    //@OneToOne(mappedBy = "usuario",orphanRemoval = true,cascade = {CascadeType.ALL})
  //  Contato contato;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
            orphanRemoval = true)
        List<Emprestimo> emprestimos;



}
