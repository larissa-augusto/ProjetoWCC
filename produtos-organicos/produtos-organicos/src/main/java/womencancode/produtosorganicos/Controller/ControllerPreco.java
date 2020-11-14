package womencancode.produtosorganicos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import womencancode.produtosorganicos.Entity.Precos;
import womencancode.produtosorganicos.Repository.PrecosRepository;


@RestController
@RequestMapping(value = "/wcc")
public class ControllerPreco {

	@Autowired
	PrecosRepository precosRepository;
	
	@GetMapping("/precos")
	@ApiOperation(value = "Retorna uma lista com todos os preços")
	public List<Precos> listaprodutos(){
		return precosRepository.findAll();
	}
	@GetMapping("/precos/{codigo}")
	@ApiOperation(value = "Retorna os preços de acordo com seu código")
	public Precos produto(@PathVariable(value = "codigo") long codigo ){
		return  precosRepository.findById(codigo);
		}
}
