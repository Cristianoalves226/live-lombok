package expertostechdio.livelombok.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "pedidoItem")
@Data
public class PedidoItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;


    @ManyToOne(cascade = CascadeType.ALL)
    private ProdutoModel produto;

    private BigDecimal valor;


}
