package expertostechdio.livelombok.controller;


import expertostechdio.livelombok.model.ClienteModel;
import expertostechdio.livelombok.model.ProdutoModel;
import expertostechdio.livelombok.repository.ProdutoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @GetMapping("/listarTodos")
    public ResponseEntity<List<ProdutoModel>> listarTodos(){
        return  ResponseEntity.ok(produtoRepository.findAll());
    }

    @PostMapping("/salvar")
    public ResponseEntity<ProdutoModel> salvar(@RequestBody ProdutoModel produto){
        return  ResponseEntity.ok(produtoRepository.save(produto));
    }


    
}
