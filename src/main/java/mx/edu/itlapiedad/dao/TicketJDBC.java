package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Tickets;
@Repository
public class TicketJDBC implements TicketDAO{
	@Autowired
	JdbcTemplate oxxo_db;
	
	String sql;
	
	
	public List<Tickets> consultar() {
		// TODO Auto-generated method stub
	
				sql = "SELECT * FROM tickets";
				return oxxo_db.query(sql, new TicketRM());
		
	}

	@Override
	public void insertar(Tickets tickets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tickets buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Tickets tickets) {
		// TODO Auto-generated method stub
		
	}

}
