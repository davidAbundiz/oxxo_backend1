package mx.edu.itlapiedad.dao;

import java.util.List;

import mx.edu.itlapiedad.models.Cajeros;

public interface CajerosDAO {
	public List<Cajeros>consultar();
	public void insertar(Cajeros cajeros);
	public Cajeros buscar (int id);
	public void eliminar(int id);
	public void actualizar(Cajeros cajeros);
}
