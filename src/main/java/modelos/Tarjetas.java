package modelos;

import Intefaces.Controlador;
import conexion.Conexion;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;

/**
 *
 * @author luisz
 */
public class Tarjetas implements Controlador{
    private String codTarjeta;
    private double saldo;
    private String dni;
    private String fechaCreacion;
    private String fechaCaducidad;
    private String estado;

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'tarjetas'
    // Constructor, getters, setters, etc.

    public String getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(String codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Tarjetas(){}
    
    public Tarjetas(String codTarjeta, double saldo, String dni, String fechaCreacion, String fechaCaducidad, String estado) {
        this.codTarjeta = codTarjeta;
        this.saldo = saldo;
        this.dni = dni;
        this.fechaCreacion = fechaCreacion;
        this.fechaCaducidad = fechaCaducidad;
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
    Tarjetas nuevaTarjeta = (Tarjetas) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    objConexion.ejecutarSentenciaSQL("insert into tarjetas values ('"
            + nuevaTarjeta.getCodTarjeta() + "','"
            + nuevaTarjeta.getSaldo() + "','"
            + nuevaTarjeta.getDni() + "','"
            + nuevaTarjeta.getFechaCreacion() + "','"
            + nuevaTarjeta.getFechaCaducidad() + "','"
            + nuevaTarjeta.getEstado() + "')"
    );
    objConexion.cierraConsultas();
    JOptionPane.showMessageDialog(null, "Tarjeta Grabada con Exito!!!", "Grabando", JOptionPane.INFORMATION_MESSAGE);
    ExtractorArchivos.tmpTarjetas.agregar(nuevaTarjeta);
    return 0;
}

    @Override
    public int actualizar(Object obj, String CodTarjeta) {
    Tarjetas editada = (Tarjetas) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    ExtractorArchivos.tmpTarjetas.reemplazar(editada, CodTarjeta);
    objConexion.ejecutarSentenciaSQL("UPDATE tarjetas SET "
        + "Saldo='" + editada.getSaldo() + "', "
        + "Dni='" + editada.getDni() + "', "
        + "FechaCreacion='" + editada.getFechaCreacion() + "', "
        + "FechaCaducidad='" + editada.getFechaCaducidad() + "', "
        + "estado='" + editada.getEstado() + "' "
        + "WHERE CodTarjeta='" + CodTarjeta + "'");
    JOptionPane.showMessageDialog(null, "Tarjeta Editada con Exito!!!", "Editando", JOptionPane.INFORMATION_MESSAGE);
    objConexion.cierraConsultas();
    return 0;
}
    @Override
    public int eliminar(Object obj) {
    Tarjetas eliminado = (Tarjetas) obj;
    Conexion objconexion = new Conexion();
    objconexion.crearConexion();
    ExtractorArchivos.tmpTarjetas.eliminar(eliminado.getCodTarjeta());
    objconexion.ejecutarSentenciaSQL("DELETE FROM tarjetas WHERE CodTarjeta='" + eliminado.getCodTarjeta() + "'");
    JOptionPane.showMessageDialog(null, "Tarjeta Eliminada con Éxito!!!", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    objconexion.cierraConsultas();
    return 0;
}
    
}
