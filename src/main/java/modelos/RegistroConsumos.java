/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import Intefaces.Controlador;
import conexion.Conexion;
import java.util.Date;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;

/**
 *
 * @author LamorxaXD
 */
public class RegistroConsumos implements Controlador{
    private int codConsumo;
    private double montoConsumo;
    private String codTarjeta;
    private String codUnidad;
    private String fechaConsumo;
    private String estado;

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'registroconsumos'
    // Constructor, getters, setters, etc.
    public RegistroConsumos(){};
    public RegistroConsumos(int codConsumo, double montoConsumo, String codTarjeta, String codUnidad, String fechaConsumo, String estado) {
        this.codConsumo = codConsumo;
        this.montoConsumo = montoConsumo;
        this.codTarjeta = codTarjeta;
        this.codUnidad = codUnidad;
        this.fechaConsumo = fechaConsumo;
        this.estado = estado;
    }

    public int getCodConsumo() {
        return codConsumo;
    }

    public void setCodConsumo(int codConsumo) {
        this.codConsumo = codConsumo;
    }

    public double getMontoConsumo() {
        return montoConsumo;
    }

    public void setMontoConsumo(double montoConsumo) {
        this.montoConsumo = montoConsumo;
    }

    public String getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(String codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public String getFechaConsumo() {
        return fechaConsumo;
    }

    public void setFechaConsumo(String fechaConsumo) {
        this.fechaConsumo = fechaConsumo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
        RegistroConsumos nuevoconsumo= (RegistroConsumos) obj;
        Conexion objConexion= new Conexion();
        objConexion.crearConexion();
         // Definir el formato deseado
        DateTimeFormatter formatoPersonalizado = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        // Formatear la fecha y hora según tu preferencia
        String fechaHoraFormateada = fechaHoraActual.format(formatoPersonalizado);

        objConexion.ejecutarSentenciaSQL("insert into registroconsumos values ('"
                + nuevoconsumo.getCodConsumo()+ "','"
                + nuevoconsumo.getMontoConsumo()+ "','"
                + nuevoconsumo.getCodTarjeta()+ "','"
                + nuevoconsumo.getCodUnidad()+ "','"
                + fechaHoraFormateada+ "','"
                +nuevoconsumo.getEstado()+ "')"
                );
        objConexion.ejecutarSentenciaSQL("UPDATE tarjetas set Saldo = Saldo -"+nuevoconsumo.getMontoConsumo() +" where CodTarjeta='" + nuevoconsumo.getCodTarjeta()+"'");
         objConexion.cierraConsultas();
        JOptionPane.showMessageDialog(null, "Empresa Grabado con Exito!!!",
                "Grabando", JOptionPane.INFORMATION_MESSAGE);
        ExtractorArchivos.tmpRegistroConsumos.agregar(nuevoconsumo);
        return 0;    }

    @Override
    public int actualizar(Object obj, String CodConsumo) {
        RegistroConsumos editado = (RegistroConsumos) obj;
         Conexion objConexion = new Conexion();
         objConexion.crearConexion();
         ExtractorArchivos.tmpRegistroConsumos.reemplazar(editado, CodConsumo);
         objConexion.ejecutarSentenciaSQL(
                 "UPDATE registroconsumos SET "
        + "MontoConsumo=" + editado.getMontoConsumo() + ", "
        + "CodTarjeta='" + editado.getCodTarjeta() + "', "
        + "CodUnidad='" + editado.getCodUnidad() + "', "
        + "FechaConsumo='" + editado.getFechaConsumo() + "', "
        + "estado='" + editado.getEstado() + "' "
        + "WHERE CodConsumo=" + CodConsumo);
                JOptionPane.showMessageDialog(null, "Empresa Editado con Exito!!!",
                "Editando", JOptionPane.INFORMATION_MESSAGE);
                objConexion.cierraConsultas();
        return 0;
         
    }

    @Override
    public int eliminar(Object obj) {
        RegistroConsumos eliminado=(RegistroConsumos) obj;
       conexion.Conexion objconexion= new Conexion();
       objconexion.crearConexion();
       ExtractorArchivos.tmpRegistroConsumos.eliminar(String.valueOf(eliminado.getCodConsumo()));
       objconexion.ejecutarSentenciaSQL("DELETE FROM registroconsumos WHERE CodConsumo='" + eliminado.getCodConsumo()+ "'");
       JOptionPane.showMessageDialog(null, "Cliente Eliminado con Exito!!!",
                "Eliminado", JOptionPane.INFORMATION_MESSAGE);
       objconexion.cierraConsultas();
         return 0;    
    }
    
}


