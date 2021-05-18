package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Productos;


@Repository
public class ProductosJDBC implements ProductosDAO{
	@Autowired
	JdbcTemplate oxxo_db;
	
	String sql;

	@Override
	public List<Productos> consultar() {
		// Consulta Productos de Oxxo
		sql = "SELECT * FROM productos";
		return oxxo_db.query(sql, new ProductosRM());
	}

	@Override
	public void insertar(Productos productos) {
		// Inserta Productos Oxxo
		sql = "INSERT INTO productos (descripcion, precio, codigo_barras, existencia) VALUES (?, ?, ?, ?)";
		oxxo_db.update(sql, productos.getDescripcion(), productos.getPrecio(), productos.getCodigo_barras(), productos.getExistencia());
	}

	@Override
	public Productos buscar(int id) {
		// Consulta Productos por Id Oxxo
		sql = "SELECT * FROM productos WHERE id = ?";
		return oxxo_db.queryForObject(sql, new ProductosRM(), id);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
			sql = "DELETE FROM productos WHERE id = ?";
			oxxo_db.update(sql, id);
	}

	@Override
	public void actualizar(Productos productos) {
		// TODO Auto-generated method stub
		sql = "UPDATE productos SET descripcion = ?, precio = ?, codigo_barras = ?, existencia = ? WHERE id = ?";
		oxxo_db.update(sql, 
				productos.getDescripcion(),
				productos.getPrecio(),
				productos.getCodigo_barras(),
				productos.getExistencia());
	}

}
