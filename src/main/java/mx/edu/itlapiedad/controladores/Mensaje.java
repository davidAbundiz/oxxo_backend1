package mx.edu.itlapiedad.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class Mensaje {
	@GetMapping("/hola")
	public String mostrarHola() {
		return "Hola DevOps";
	}
}
