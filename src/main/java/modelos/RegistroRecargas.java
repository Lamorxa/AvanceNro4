/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import Intefaces.Controlador;
import conexion.Conexion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;

/**
 *
 * @author LamorxaXD
 */
public class RegistroRecargas implements Controlador{
    private int codRecarga;
    private double montoRecarga;
    private String codTarjeta;
    private String fechaRecarga;
    private String estado;
 public RegistroRecargas(int codRecarga, double montoRecarga, String codTarjeta, String fechaRecarga, String estado) {
        this.codRecarga = codRecarga;
        this.montoRecarga = montoRecarga;
        this.codTarjeta = codTarjeta;
        this.fechaRecarga = fechaRecarga;
        this.estado = estado;
    }

    public RegistroRecargas() {
    }
 
    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'registrorecargas'
    // Constructor, getters, setters, etc.

    public int getCodRecarga() {
        return codRecarga;
    }

    public void setCodRecarga(int codRecarga) {
        this.codRecarga = codRecarga;
    }

    public double getMontoRecarga() {
        return montoRecarga;
    }

    public void setMontoRecarga(double montoRecarga) {
        this.montoRecarga = montoRecarga;
    }

    public String getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(String codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public String getFechaRecarga() {
        return fechaRecarga;
    }

    public void setFechaRecarga(String fechaRecarga) {
        this.fechaRecarga = fechaRecarga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public int insertar(Object obj) {
    RegistroRecargas nuevoRecarga= (RegistroRecargas) obj;
    Conexion objConexion= new Conexion();
    objConexion.crearConexion();
    // Definir el formato deseado
    DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    // Obtener la fecha y hora actual
    LocalDateTime fechaHoraActual = LocalDateTime.now();
    // Formatear la fecha y hora según tu preferencia
    String fechaHoraFormateada = fechaHoraActual.format(formatoPersonalizado);

    objConexion.ejecutarSentenciaSQL("insert into registrorecargas values ('"
            + nuevoRecarga.getCodRecarga()+ "','"
            + nuevoRecarga.getMontoRecarga()+ "','"
            + nuevoRecarga.getCodTarjeta()+ "','"
            + fechaHoraFormateada+ "','"
            +nuevoRecarga.getEstado()+ "')"
            );
    objConexion.ejecutarSentenciaSQL("UPDATE tarjetas set Saldo = Saldo +"+nuevoRecarga.getMontoRecarga() +" where CodTarjeta='" + nuevoRecarga.getCodTarjeta()+"'");
    objConexion.cierraConsultas();
    JOptionPane.showMessageDialog(null, "Recarga grabada con Éxito!!!",
            "Grabando", JOptionPane.INFORMATION_MESSAGE);
    ExtractorArchivos.tmpRegistroRecargas.agregar(nuevoRecarga);
    return 0;
}
 @Override
public int actualizar(Object obj, String CodRecarga) {
    RegistroRecargas editado = (RegistroRecargas) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    
    ExtractorArchivos.tmpRegistroRecargas.reemplazar(editado, CodRecarga);
     
    objConexion.ejecutarSentenciaSQL(
            "UPDATE registrorecargas SET "
            + "MontoRecarga=" + editado.getMontoRecarga() + ", "
            + "CodTarjeta='" + editado.getCodTarjeta() + "', "
            + "FechaRecarga='" + editado.getFechaRecarga() + "', "
            + "estado='" + editado.getEstado() + "' "
            + "WHERE CodRecarga=" + CodRecarga);
    JOptionPane.showMessageDialog(null, "Recarga Editada con Éxito!!!",
            "Editando", JOptionPane.INFORMATION_MESSAGE);
    objConexion.cierraConsultas();
    return 0;
}
@Override
public int eliminar(Object obj) {
    RegistroRecargas eliminado = (RegistroRecargas) obj;
    Conexion objconexion = new Conexion();
    objconexion.crearConexion();
    ExtractorArchivos.tmpRegistroRecargas.eliminar(String.valueOf(eliminado.getCodRecarga()));
    objconexion.ejecutarSentenciaSQL("DELETE FROM registrorecargas WHERE CodRecarga='" + eliminado.getCodRecarga() + "'");
    JOptionPane.showMessageDialog(null, "Recarga Eliminada con Éxito!!!",
            "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    objconexion.cierraConsultas();
    return 0;
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

}
