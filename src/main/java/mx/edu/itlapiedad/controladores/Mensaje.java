package mx.edu.itlapiedad.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.ProductosDAO;
import mx.edu.itlapiedad.models.Productos;

@RestController
@RequestMapping("/devops")

public class Mensaje {
	@Autowired
	ProductosDAO repositorio;

	
	@GetMapping("/hola")
	public String mostrarHola() {
		return "Hola DevOps";
	}
	
	@GetMapping("productos") 
		public List<Productos> consultarProd(){
		return repositorio.consultar();
	}
	
	@PostMapping("producto")
	public void insertar(@RequestBody Productos productos) {
		repositorio.insertar(productos);
	}
	
	@GetMapping("producto/{id}")
	public Productos buscar(@PathVariable int id) {
		return repositorio.buscar(id);
	}
}
