package mx.edu.itlapiedad.controladores;

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

import mx.edu.itlapiedad.dao.CajerosDAO;
import mx.edu.itlapiedad.dao.ProductosDAO;
import mx.edu.itlapiedad.dao.TicketDAO;
import mx.edu.itlapiedad.dao.Ticket_RenglonesDAO;
import mx.edu.itlapiedad.models.Cajeros;
import mx.edu.itlapiedad.models.Productos;
import mx.edu.itlapiedad.models.Ticket_Renglones;
import mx.edu.itlapiedad.models.Tickets;

@RestController
@RequestMapping("/devops")

public class Mensaje {
	@Autowired
	ProductosDAO repositorio;
	@Autowired
	CajerosDAO repo;
	@Autowired
	Ticket_RenglonesDAO repoTick;
	@Autowired
	TicketDAO RTicket; 

	
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
	
	@PutMapping("/productos")
	public void actualizar(@RequestBody Productos productos) {
		repositorio.actualizar(productos);
	}
	
	@DeleteMapping("/productos/{id}")
	public void eliminar(@PathVariable int id) {
		repositorio.eliminar(id);
	}
	
	
	
	
	@GetMapping("cajeros") 
	public List<Cajeros> consultarCaj(){
	return repo.consultar();
	}
	
	@PostMapping("cajeros")
	public void insertar(@RequestBody Cajeros cajeros) {
		repo.insertar(cajeros);
	}
	
	@GetMapping("cajeros/{id}")
	public Cajeros buscarCaj(@PathVariable int id) {
		return repo.buscar(id);
	}
	
	@PutMapping("cajeros")
	public void actualizarCaj(@RequestBody Cajeros cajeros) {
		repo.actualizar(cajeros);
	}
	
	@DeleteMapping("Cajeros/{id}")
	public void eliminarCaj(@PathVariable int id) {
		repo.eliminar(id);
	}
	
	
	
	
	@GetMapping("Ticket_Renglones") 
	public List<Ticket_Renglones> consultarTick(){
	return repoTick.consultar();
	}
	
	@PostMapping("Ticket_Renglones")
	public void insertar(@RequestBody Ticket_Renglones ticket_renglones) {
		repoTick.insertar(ticket_renglones);
	}
	
	@GetMapping("Ticket_Renglones/{id}")
	public Ticket_Renglones buscarTick(@PathVariable int id) {
		return repoTick.buscar(id);
	}
	
	@PutMapping("Ticket_Renglones")
	public void actualizarTick(@RequestBody Ticket_Renglones ticket_renglones) {
		repoTick.actualizar(ticket_renglones);
	}
	
	@DeleteMapping("Ticket_Renglones/{id}")
	public void eliminarTick(@PathVariable int id) {
		repoTick.eliminar(id);
	}
	
	@GetMapping("Tickets")
	public List<Tickets> consultarT(){
		 return RTicket.consultar();	
	}
	
	@PostMapping("Tickets")
	public void insertar(@RequestBody Tickets tickets) {
		RTicket.insertar(tickets);
	}
	
	@GetMapping("Tickets/{id}")
	public Tickets buscarTicket(@PathVariable int id) {
		return RTicket.buscar(id);
	}
	
	@PutMapping("Tickets")
	public void actualizarTicket(@RequestBody Tickets tickets) {
		RTicket.actualizar(tickets);
	}
	@DeleteMapping("Tickets/{id}")
	public void eliminarTicket(@PathVariable int id) {
		RTicket.eliminar(id);
	}
}
