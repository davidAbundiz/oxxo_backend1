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
	sql = "SELECT * FROM tickets";
	return oxxo_db.query(sql, new TicketRM());
		
	}

	@Override
	public void insertar(Tickets tickets) {
			sql = "INSERT INTO Tickets ( fecha_hora, total, cajeros_id) VALUES (?, ?, ?)";
			oxxo_db.update(sql, tickets.getId(), tickets.getFecha(),tickets.getTotal(),tickets.getCAJERO_id());
	}

	@Override
	public Tickets buscar(int id) {
		// 	Buscar Ticket_Renglones de Oxxo
		sql = "SELECT * FROM ticket WHERE id = ?";
		return oxxo_db.queryForObject(sql, new TicketRM());
	}
	@Override
	public void eliminar(int id) {
		sql = "DELETE FROM ticket_renglones WHERE id = ?";
		oxxo_db.update(sql, id);
	}

	@Override
	public void actualizar(Tickets tickets) {
		// TODO Auto-generated method stub
		
	}

}
