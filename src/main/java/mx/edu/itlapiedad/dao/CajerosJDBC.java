package mx.edu.itlapiedad.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.models.Cajeros;

@Repository
public class CajerosJDBC implements CajerosDAO {
	@Autowired
	JdbcTemplate oxxo_db;
	
	String sql;
	@Override
	public List<Cajeros>consultar(){
		// Consulta Cajeros de Oxxo
			sql = "SELECT * FROM cajeros";
			return oxxo_db.query(sql, new CajerosRM());
	}
	@Override
	public void insertar(Cajeros cajeros) {
		// Insertar Cajeros de Oxxo
		sql = "INSERT INTO cajeros (nombre) VALUES (?)";
		oxxo_db.update(sql, cajeros.getNombre());
	}
	@Override
	public Cajeros buscar(int id) {
		// 	Buscar Cajeros de Oxxo
		sql = "SELECT * FROM cajeros WHERE id = ?";
		return oxxo_db.queryForObject(sql, new CajerosRM(), id);
	}
	@Override
	public void actualizar(Cajeros cajeros) {
		String sql= "UPDATE cajeros SET nombre = ? WHERE id = ?";
		oxxo_db.update(sql, cajeros.getId(), cajeros.getNombre());
	}
	@Override
	public void eliminar(int id) {
		// Eliminar Cajeros de Oxxo
		sql = "DELETE FROM cajeros WHERE id = ?";
		oxxo_db.update(sql, id);
	}
	
}
