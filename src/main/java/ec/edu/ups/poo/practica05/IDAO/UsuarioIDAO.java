package ec.edu.ups.poo.practica05.IDAO;

import ec.edu.ups.poo.practica05.Modelo.Usuario;
import java.util.List;

public interface UsuarioIDAO {
	
	 List<Usuario> list();
	 Usuario read(String identificacion);
	 void create(Usuario usuario);
	 boolean update(String identificacion, Usuario usuario);
	 boolean delete(String identificacion);

}
