package mx.edu.itlapiedad.dao;

import java.util.List;
import mx.edu.itlapiedad.models.Productos;


public interface ProductosDAO {
	public List<Productos>consultar();
	public void insertar(Productos productos);
	public Productos buscar(int id);
}
