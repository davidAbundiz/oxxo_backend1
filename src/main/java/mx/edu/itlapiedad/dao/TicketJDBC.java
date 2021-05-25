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
	
	@Override
	public List<Tickets> consultar() {
		// Consulta Tickets de Oxxo
		sql = "SELECT * FROM tickets";
		return oxxo_db.query(sql, new TicketRM());
		
	}
	
	@Override
	public void insertar(Tickets tickets) {
		// Insertar Tickets
		sql = "INSERT INTO tickets (fecha_hora, total, CAJERO_id)" 
		+ "VALUES (?, ?, ?)";
		oxxo_db.update(sql, tickets.getFecha_hora(), tickets.getTotal(), tickets.getCAJERO_id());
	}

	@Override
	public Tickets buscar(int id) {
//	 	Buscar Tickets de Oxxo
			sql = "SELECT * FROM tickets WHERE id = ?";
			return oxxo_db.queryForObject(sql, new TicketRM(), id);
	}

	@Override
	public void eliminar(int id) {
		// Eliminar Tickets
		sql = "DELETE FROM tickets WHERE id = ?";
		oxxo_db.update(sql, id);
		
	}

	@Override
	public void actualizar(Tickets tickets) {
		// TODO Auto-generated method stub
		String sql_update = "UPDATE tickets SET fecha_hora = ?, total = ?, CAJERO_id = ?" + "WHERE id = ?";
		oxxo_db.update(sql_update, 
		        tickets.getFecha_hora(), 
		        tickets.getTotal(), 
		        tickets.getCAJERO_id(), 
		        tickets.getId());
	}

}
