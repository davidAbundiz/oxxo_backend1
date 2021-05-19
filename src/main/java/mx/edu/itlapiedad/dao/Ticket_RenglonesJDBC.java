package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import mx.edu.itlapiedad.models.Ticket_Renglones;

@Repository
public class Ticket_RenglonesJDBC implements Ticket_RenglonesDAO{
	@Autowired
	JdbcTemplate oxxo_db;
	
	String sql;
	
	public List<Ticket_Renglones>consultar(){
		// Consulta Ticket_Renglones de Oxxo
			sql = "SELECT * FROM ticket_renglones";
			return oxxo_db.query(sql, new Ticket_RenglonesRM());
	}
	@Override
	public void insertar(Ticket_Renglones ticket_renglones) {
		// Insertar Ticket_Renglones de Oxxo
		sql = "INSERT INTO ticket_renglones (cantidad, precio, importe) VALUES (?, ?, ?)";
		oxxo_db.update(sql, ticket_renglones.getCantidad(), ticket_renglones.getPrecio(), ticket_renglones.getImporte());
	}
	@Override
	public Ticket_Renglones buscar(int id) {
		// 	Buscar Ticket_Renglones de Oxxo
		sql = "SELECT * FROM ticket_renglones WHERE id = ?";
		return oxxo_db.queryForObject(sql, new Ticket_RenglonesRM(), id);
	}
	@Override
	public void actualizar(Ticket_Renglones ticket_renglones) {
		// Actualizar Ticket_Renglones de Oxxo
		sql = "UPDATE ticket_renglones SET TICKET_id = ?,"
				+" PRODUCTO_id = ?, cantida = ?, precio = ?, importe = ?"
				+" WHERE id=?";
		oxxo_db.update(sql, ticket_renglones.getTICKET_id(), 
				ticket_renglones.getPRODUCTO_id(), 
				ticket_renglones.getCantidad(), 
				ticket_renglones.getPrecio(), 
				ticket_renglones.getImporte());
	}
	@Override
	public void eliminar(int id) {
		// Eliminar Ticket_Renglones de Oxxo
		sql = "DELETE FROM ticket_renglones WHERE id = ?";
		oxxo_db.update(sql, id);
	}
<<<<<<< HEAD
=======
	@Override
	public void actualizar(Ticket_Renglones ticket_renglones) {
		// Actualizar Ticket_Renglones de Oxxo
		String sql = "UPDATE ticket_renglones SET TICKET_id = ?, PRODUCTO_id = ?,"
				+ " cantidad = ?, precio = ?, importe = ? WHERE id = ?";
		oxxo_db.update(sql,
				ticket_renglones.getId(), 
				ticket_renglones.getCantidad(), 
				ticket_renglones.getPrecio(),
				ticket_renglones.getImporte(),
				ticket_renglones.getTICKET_id(),
				ticket_renglones.getPRODUCTO_id());
	}
>>>>>>> 4119b469119e177534973039d646d74161d7ba46
}
