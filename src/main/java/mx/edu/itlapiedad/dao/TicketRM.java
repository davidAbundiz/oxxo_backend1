package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Tickets;
public class TicketRM implements RowMapper<Tickets> {

	@Override
	public Tickets mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Tickets tickets = new Tickets();
		tickets.setId(rs.getInt("id"));
		tickets.setFecha_hora(rs.getString("fecha_hora"));
		tickets.setTotal(rs.getFloat("total"));
		tickets.setCAJERO_id(rs.getInt("CAJERO_id"));

		return tickets;
		
	}

}
