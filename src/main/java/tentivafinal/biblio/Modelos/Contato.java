package tentivafinal.biblio.Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contato {
    @Id
    Long id;

    String email;



    @OneToOne
    @MapsId
    @JoinColumn(name = "usuario_id")
    Usuario usuario;







}
