package womencancode.produtosorganicos.Controller;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import womencancode.produtosorganicos.Entity.Produtos;
import womencancode.produtosorganicos.Repository.ProdutosRepository;



@RestController
@RequestMapping(value = "/wcc")
public class ControllerProdutos {

	
	@Autowired
	ProdutosRepository produtosRepository;
	
	@GetMapping("/produtos")
	@ApiOperation(value = "Retorna uma lista com todos os produtos")
	public List<Produtos> listaprodutos(){
		return produtosRepository.findAll();
	}
	
	@GetMapping("/produtos/{codigo}")
	@ApiOperation(value = "Retorna um produto de acordo com seu código")
	public Produtos produto(@PathVariable(value = "codigo") long codigo ){
		return  produtosRepository.findById(codigo);
		}
	
	@GetMapping("/{categoria}")
	@ApiOperation(value = "Retorna uma lista de produtos de acordo com a categoria")
	public ResultSet FindByCategoria(@PathVariable(value = "categoria") String categoria) throws SQLException {
		
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/produtos?serverTimezone=UTC","root","Amelie0810@Frida1991");
		Statement s = conexao.createStatement();
		s.executeQuery("SELECT * FROM nomes_produtos WHERE categoria ='" + categoria + "'");
		ResultSet set= s.getResultSet();
		return  set;
	
	}
	
	
	@PostMapping("/produtos")
	@ApiOperation(value = "Salva um novo produto")
	public Produtos novoProduto(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
		
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value = "Deleta um produto ")
	public void deleteProduto(@RequestBody Produtos produto) {
		produtosRepository.delete(produto);
		
	}
	
	@PutMapping("/produto")
	@ApiOperation(value = "Atualiza um produto de acordo com seu código")
	public Produtos atualizaEstabelecimento(@RequestBody Produtos produto) {
		return produtosRepository.save(produto);
		
	}
	
	
}
