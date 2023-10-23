package modelos;

import Intefaces.Controlador;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;

/**
 *
 * @author luisz
 */
public class Personas implements Controlador{
    
    String Dni;
    String Nombres;
    String ApellidoPaterno;
    String ApellidoMaterno;
    String Telefono;
    String CorreoElectronico;
    int IdTipoPersona;
    String RucEmpresa;
    String Estado;

    public Personas() {

    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public int getIdTipoPersona() {
        return IdTipoPersona;
    }

    public void setIdTipoPersona(int IdTipoPersona) {
        this.IdTipoPersona = IdTipoPersona;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRucEmpresa() {
        return RucEmpresa;
    }

    public void setRucEmpresa(String RucEmpresa) {
        this.RucEmpresa = RucEmpresa;
    }

    public Personas(String Dni, String Nombres, String ApellidoPaterno, String ApellidoMaterno, String Telefono, String CorreoElectronico, int IdTipoPersona, String RucEmpresa, String Estado) {
        this.Dni = Dni;
        this.Nombres = Nombres;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Telefono = Telefono;
        this.CorreoElectronico = CorreoElectronico;
        this.IdTipoPersona = IdTipoPersona;
        this.RucEmpresa = RucEmpresa;
        this.Estado = Estado;
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
    Personas nuevaPersona= (Personas) obj;
        Conexion objConexion= new Conexion();
        objConexion.crearConexion();
        objConexion.ejecutarSentenciaSQL("insert into Personas values ('"
                +nuevaPersona.getDni()+ "','"
                + nuevaPersona.getNombres()+ "','"
                + nuevaPersona.getApellidoPaterno()+ "','"
                + nuevaPersona.getApellidoMaterno()+ "','"
                + nuevaPersona.getTelefono()+ "','"
                + nuevaPersona.getCorreoElectronico()+ "','"
                + nuevaPersona.getIdTipoPersona()+ "','"
                + nuevaPersona.getRucEmpresa()+ "','"
                + nuevaPersona.getEstado()+ "')"
                );
         objConexion.cierraConsultas();
        JOptionPane.showMessageDialog(null, "Empresa Grabado con Exito!!!",
                "Grabando", JOptionPane.INFORMATION_MESSAGE);
        ExtractorArchivos.tmpPersonas.agregar(nuevaPersona);
        return 0;   
    }

    @Override
    public int actualizar(Object obj, String Dni) {
       Personas editado = (Personas) obj;
         Conexion objConexion = new Conexion();
         objConexion.crearConexion();
         ExtractorArchivos.tmpPersonas.reemplazar(editado, Dni);
         objConexion.ejecutarSentenciaSQL("UPDATE personas SET "
        + "Nombres='" + editado.getNombres()+ "', "
        + "ApellidoPaterno='" + editado.getApellidoPaterno()+ "', "
        + "ApellidoMaterno='" + editado.getApellidoMaterno()+ "', "
        + "Telefono='" + editado.getTelefono()+ "', "
        + "CorreoElectronico='" + editado.getCorreoElectronico()+ "', "
        + "IdTipoPersona=" + editado.getIdTipoPersona()+ ", "
        + "RucEmpresa='" + editado.getRucEmpresa()+ "', "
        + "estado='" + editado.getEstado()+ "' "
        + "WHERE Dni='" + Dni + "'");
      JOptionPane.showMessageDialog(null, "Empresa Editado con Exito!!!",
                "Editando", JOptionPane.INFORMATION_MESSAGE);
      objConexion.cierraConsultas();
        return 0;  }

    @Override
    public int eliminar(Object obj) {
        Personas eliminado=(Personas) obj;
       conexion.Conexion objconexion= new Conexion();
       objconexion.crearConexion();
       ExtractorArchivos.tmpPersonas.eliminar(eliminado.getDni());
       objconexion.ejecutarSentenciaSQL("DELETE FROM personas WHERE Dni='" + eliminado.getDni()+ "'");
       JOptionPane.showMessageDialog(null, "Cliente Eliminado con Exito!!!",
                "Eliminado", JOptionPane.INFORMATION_MESSAGE);
       objconexion.cierraConsultas();
         return 0;    }

   public boolean verificarCredenciales(String username, String password) {
        Conexion conexion = new Conexion();
        conexion.crearConexion();
        String query = "SELECT * FROM usuarios WHERE User='" + username + "' AND Contraseña='" + password + "'";

        try {
            ResultSet resultado = conexion.consultarRegistros(query);
            if (resultado.next()) {
                System.out.println("Usuario autenticado con éxito");
                conexion.cierraConsultas();
                return true;
            } else {
                System.out.println("Credenciales inválidas");
                conexion.cierraConsultas();
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar credenciales: " + e.getMessage());
            return false;
        }
    }
    
    
}
