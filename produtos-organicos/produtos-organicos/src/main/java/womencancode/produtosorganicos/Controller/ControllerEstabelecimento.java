package womencancode.produtosorganicos.Controller;

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
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import womencancode.produtosorganicos.Entity.Estabelecimento;
import womencancode.produtosorganicos.Repository.EstabelecimentoRepository;

import java.util.List;



@RestController
@RequestMapping(value = "/wcc")
public class ControllerEstabelecimento {

	@GetMapping(path = "/status")
	@ApiOperation(value = "Mostra o status da conexão com a aplicação")
	public String  check() {
		return "online";
	}
	
	@Autowired
	EstabelecimentoRepository estabelecimentoRepository;
	
	
	@ApiOperation(value = "Retorna uma lista com todos os estabelecimentos")
	@GetMapping("/estabelecimentos")
	public List<Estabelecimento> listaestabelecimentos(){
		return estabelecimentoRepository.findAll();
	}
	
	@GetMapping("/estabelecimentos/{codigo}")
	@ApiOperation(value = "Retorna um estabelecimento de acordo com seu código")
	@ApiResponses(value={
            @ApiResponse(code=200,message="Retorna um estabelecimento pelo codigo"),
            @ApiResponse(code=404,message="Estabelecimento não encontrado")
    })
	public Estabelecimento estabelecimento(@PathVariable(value = "codigo") long codigo ){
		return  estabelecimentoRepository.findById(codigo);
		}
	
	@PostMapping("/estabelecimento")
	@ApiOperation(value = "Salva um novo estabelecimento")
	public Estabelecimento novoEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
		return estabelecimentoRepository.save(estabelecimento);
		
	}
	
	@DeleteMapping("/estabelecimento")
	@ApiOperation(value = "Deleta um estabelecimento")
	public void deleteEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
		estabelecimentoRepository.delete(estabelecimento);
		
	}
	
	@PutMapping("/estabelecimento")
	@ApiOperation(value = "Atualiza um estabelecimento de acordo com seu código")
	public Estabelecimento atualizaEstabelecimento(@RequestBody Estabelecimento estabelecimento) {
		return estabelecimentoRepository.save(estabelecimento);
		
	}
}
	
	

