package ec.edu.ups.poo.practica05.DAO;

import ec.edu.ups.poo.practica05.Modelo.Usuario;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.practica05.IDAO.UsuarioIDAO;


public class UsuarioDAO implements UsuarioIDAO{
	
	private List<Usuario> listaUsuarios;

    public UsuarioDAO() {
        listaUsuarios = new ArrayList();
    }

    @Override
    public List<Usuario> list() {
        return listaUsuarios;
    }

    @Override
    public Usuario read(String identificacion) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    @Override
    public boolean update(String identificacion, Usuario usuario) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuarioEncontrado = listaUsuarios.get(i);
            if (usuarioEncontrado.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaUsuarios.set(i, usuario);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String identificacion) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            if (usuario.getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaUsuarios.remove(i);
                return true;
            }
        }
        return false;
    }
	

}
