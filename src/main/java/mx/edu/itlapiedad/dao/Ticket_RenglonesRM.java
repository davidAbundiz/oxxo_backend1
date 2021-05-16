package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Ticket_Renglones;

public class Ticket_RenglonesRM implements RowMapper<Ticket_Renglones> {
	
	@Override
	public Ticket_Renglones mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Ticket_Renglones ticket_renglones = new Ticket_Renglones();
		ticket_renglones.setId(rs.getInt("id"));
		ticket_renglones.setTICKET_id(rs.getInt("TICKET_id"));
		ticket_renglones.setPRODUCTO_id(rs.getInt("PRODUCTO_id"));
		ticket_renglones.setCantidad(rs.getInt("cantidad"));
		ticket_renglones.setPrecio(rs.getFloat("precio"));
		ticket_renglones.setImporte(rs.getFloat("importe"));
		return ticket_renglones;
	}
}
