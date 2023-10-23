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

   public class Rutas implements Controlador{
    private int idRuta;
    private String nombreRuta;
    private double montoRuta;
    private String estado;

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'rutas'
    // Constructor, getters, setters, etc.

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public double getMontoRuta() {
        return montoRuta;
    }

    public void setMontoRuta(double montoRuta) {
        this.montoRuta = montoRuta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Rutas(){};
    public Rutas(int idRuta, String nombreRuta, double montoRuta, String estado) {
        this.idRuta = idRuta;
        this.nombreRuta = nombreRuta;
        this.montoRuta = montoRuta;
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
    Rutas nuevaRuta = (Rutas) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    objConexion.ejecutarSentenciaSQL("INSERT INTO rutas VALUES ('"
            + String.valueOf(nuevaRuta.getIdRuta()) + "','"
            + nuevaRuta.getNombreRuta() + "','"
            + String.valueOf(nuevaRuta.getMontoRuta()) + "','"
            + nuevaRuta.getEstado() + "')"
    );
    objConexion.cierraConsultas();
    JOptionPane.showMessageDialog(null, "Ruta Grabada con Éxito!!!", "Grabando", JOptionPane.INFORMATION_MESSAGE);
    ExtractorArchivos.tmpRutas.agregar(nuevaRuta);
    return 0;
}
    @Override
    public int actualizar(Object obj, String IdRuta) {
    Rutas editado = (Rutas) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    ExtractorArchivos.tmpRutas.reemplazar(editado, IdRuta);
    objConexion.ejecutarSentenciaSQL("UPDATE rutas SET "
        + "NombreRuta='" + editado.getNombreRuta()+ "', "
        + "MontoRuta=" + editado.getMontoRuta()+ ", "
        + "estado='" + editado.getEstado()+ "' "
        + "WHERE IdRuta=" + Integer.parseInt(IdRuta));
    JOptionPane.showMessageDialog(null, "Ruta Editada con Éxito!!!",
        "Editando", JOptionPane.INFORMATION_MESSAGE);
    objConexion.cierraConsultas();
    return 0;
}


    @Override
   public int eliminar(Object obj) {
    Rutas eliminado = (Rutas) obj;
    conexion.Conexion objconexion = new Conexion();
    objconexion.crearConexion();
    ExtractorArchivos.tmpRutas.eliminar(String.valueOf(eliminado.getIdRuta()));
    objconexion.ejecutarSentenciaSQL("DELETE FROM rutas WHERE IdRuta=" + eliminado.getIdRuta());
    JOptionPane.showMessageDialog(null, "Ruta Eliminada con Éxito!!!", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    objconexion.cierraConsultas();
    return 0;
}
    
}



