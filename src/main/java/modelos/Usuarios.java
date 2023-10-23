/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import Intefaces.Controlador;
import conexion.Conexion;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;
/**
 *
 * @author LamorxaXD
 */
public class Usuarios implements Controlador{
    private int idUsuario;
    private String dni;
    private String user;
    private String contrasena;
    private String estado;

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'usuarios'
    // Constructor, getters, setters, etc.

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Usuarios(){};
    public Usuarios(int idUsuario, String dni, String user, String contrasena, String estado) {
        this.idUsuario = idUsuario;
        this.dni = dni;
        this.user = user;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    @Override
    public List consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object consultarPorID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List consultarPorNombres(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
   public int insertar(Object obj) {
    Usuarios nuevoUsuario= (Usuarios) obj;
    Conexion objConexion= new Conexion();
    objConexion.crearConexion();
    objConexion.ejecutarSentenciaSQL("insert into usuarios values ('"
            +nuevoUsuario.getIdUsuario()+ "','"
            + nuevoUsuario.getUser()+ "','"
            + nuevoUsuario.getContrasena()+ "','"
            + nuevoUsuario.getEstado()+ "')"
            );
    objConexion.cierraConsultas();
    JOptionPane.showMessageDialog(null, "Usuario Grabado con Éxito!!!",
            "Grabando", JOptionPane.INFORMATION_MESSAGE);
    ExtractorArchivos.tmpUsuarios.agregar(nuevoUsuario);
    return 0;   
}
@Override
public int actualizar(Object obj, String IdUsuario) {
    Usuarios editado = (Usuarios) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    ExtractorArchivos.tmpUsuarios.reemplazar(editado, IdUsuario);
    objConexion.ejecutarSentenciaSQL(
            "UPDATE usuarios SET "
            + "Dni='" + editado.getDni()+ "', "        
            + "User='" + editado.getUser()+ "', "
            + "Contraseña='" + editado.getContrasena()+ "', "
            + "estado='" + editado.getEstado() + "' "
            + "WHERE IdUsuario='" + IdUsuario + "'");
    JOptionPane.showMessageDialog(null, "Usuario Editado con Éxito!!!",
            "Editando", JOptionPane.INFORMATION_MESSAGE);
    objConexion.cierraConsultas();
    return 0;  
}
@Override
public int eliminar(Object obj) {
    Usuarios eliminado = (Usuarios) obj;
    Conexion objconexion = new Conexion();
    objconexion.crearConexion();
    ExtractorArchivos.tmpUsuarios.eliminar(String.valueOf(eliminado.getIdUsuario()));
    objconexion.ejecutarSentenciaSQL("DELETE FROM usuarios WHERE IdUsuario='" + eliminado.getIdUsuario() + "'");
    JOptionPane.showMessageDialog(null, "Usuario Eliminado con Éxito!!!",
            "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    objconexion.cierraConsultas();
    return 0;    
}
}