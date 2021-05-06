package mx.edu.itlapiedad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Productos;

public class ProductosRM implements RowMapper<Productos>{

	@Override
	public Productos mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Productos productos = new Productos();
		productos.setId(rs.getInt("id"));
		productos.setDescripcion(rs.getString("descripcion"));
		productos.setPrecio(rs.getFloat("precio"));
		productos.setCodigo_barras(rs.getString("codigo_barras"));
		productos.setExistencia(rs.getInt("existencia"));
		return productos;
	}
	
}
