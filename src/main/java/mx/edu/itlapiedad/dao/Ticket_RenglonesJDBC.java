package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import mx.edu.itlapiedad.models.Ticket_Renglones;
import mx.edu.itlapiedad.models.Ticket_renglones_importe;

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
		sql = "INSERT INTO ticket_renglones (TICKET_id, PRODUCTO_id, cantidad, precio) "
				+ "VALUES (?, ?, ?, ?)";
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
		 sql = "UPDATE tickets_renglones SET  cantidad = ?, precio = ?, importe = ?,TICKET_id = ?, PRODUCTOS_id = ? Where id = ?";
		oxxo_db.update(sql,
				ticket_renglones.getId(),
				ticket_renglones.getCantidad(),
				ticket_renglones.getPrecio(),
				ticket_renglones.getImporte(),
				ticket_renglones.getTICKET_id(),
				ticket_renglones.getPRODUCTO_id());

	}
	@Override
	public void eliminar(int id) {
		// Eliminar Ticket_Renglones de Oxxo
		sql = "DELETE FROM ticket_renglones WHERE id = ?";
		oxxo_db.update(sql, id);
	}	
	
	
	@Override
	public List<Ticket_renglones_importe> buscar_importe_cajero(int id) {
		
		String sql_query = "SELECT  sum(importe) as importe FROM ticket_renglones  JOIN tickets ON ticket_renglones.TICKET_id = tickets.id JOIN cajeros  ON cajeros.id=tickets.CAJERO_id  WHERE  cajeros.id=?;";
		return oxxo_db.query(sql_query, new RowMapper<Ticket_renglones_importe>() {
			public Ticket_renglones_importe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket_renglones_importe ticket_renglones = new Ticket_renglones_importe();
				ticket_renglones.setImporte(rs.getFloat("importe"));

				return ticket_renglones;

			
			}

		}, id);
	}
	
	
	@Override
	public List<Ticket_renglones_importe> buscar_importe_cajero_fecha(int id,Timestamp fecha_hora) {
		
		String sql_query = "SELECT  sum(importe) as importe FROM ticket_renglones  JOIN tickets ON ticket_renglones.TICKET_id = tickets.id JOIN cajeros  ON cajeros.id=tickets.CAJERO_id  WHERE  cajeros.id=? and fecha_hora=?;";
		return oxxo_db.query(sql_query, new RowMapper<Ticket_renglones_importe>() {
			public Ticket_renglones_importe mapRow(ResultSet rs, int rowNum) throws SQLException {
				Ticket_renglones_importe ticket_renglones = new Ticket_renglones_importe();
				ticket_renglones.setImporte(rs.getFloat("importe"));

				return ticket_renglones;

			
			}

		}, id,fecha_hora);
	}
	

}
