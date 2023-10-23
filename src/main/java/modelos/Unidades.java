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
public class Unidades implements Controlador{
    private String codUnidad;
    private String dni;
    private int idRuta;
    private int codSoat;
    private String estado;

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'unidades'
    // Constructor, getters, setters, etc.
public Unidades(){}
    public Unidades(String codUnidad, String dni, int idRuta, int codSoat, String estado) {
        this.codUnidad = codUnidad;
        this.dni = dni;
        this.idRuta = idRuta;
        this.codSoat = codSoat;
        this.estado = estado;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getCodSoat() {
        return codSoat;
    }

    public void setCodSoat(int codSoat) {
        this.codSoat = codSoat;
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
    Unidades nuevaUnidad = (Unidades) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    objConexion.ejecutarSentenciaSQL("insert into unidades values ('"
            + nuevaUnidad.getCodUnidad() + "','"
            + nuevaUnidad.getDni() + "','"
            + nuevaUnidad.getIdRuta() + "','"
            + nuevaUnidad.getCodSoat() + "','"
            + nuevaUnidad.getEstado() + "')"
    );
    objConexion.cierraConsultas();
    JOptionPane.showMessageDialog(null, "Unidad Grabada con Éxito!!!",
            "Grabando", JOptionPane.INFORMATION_MESSAGE);
    ExtractorArchivos.tmpUnidades.agregar(nuevaUnidad);
    return 0;
}

@Override
public int actualizar(Object obj, String CodUnidad) {
    Unidades editado = (Unidades) obj;
    Conexion objConexion = new Conexion();
    objConexion.crearConexion();
    ExtractorArchivos.tmpUnidades.reemplazar(editado, CodUnidad);
    objConexion.ejecutarSentenciaSQL(
            "UPDATE unidades SET "
                    + "Dni='" + editado.getDni() + "', "
                    + "IdRuta='" + editado.getIdRuta() + "', "
                    + "CodSoat='" + editado.getCodSoat() + "', "
                    + "estado='" + editado.getEstado() + "' "
                    + "WHERE CodUnidad='" + CodUnidad + "'");
    JOptionPane.showMessageDialog(null, "Unidad Editada con Éxito!!!",
            "Editando", JOptionPane.INFORMATION_MESSAGE);
    objConexion.cierraConsultas();
    return 0;
}

@Override
public int eliminar(Object obj) {
    Unidades eliminado = (Unidades) obj;
    Conexion objconexion = new Conexion();
    objconexion.crearConexion();
    ExtractorArchivos.tmpUnidades.eliminar(String.valueOf(eliminado.getCodUnidad()));
    objconexion.ejecutarSentenciaSQL("DELETE FROM unidades WHERE CodUnidad='" + eliminado.getCodUnidad() + "'");
    JOptionPane.showMessageDialog(null, "Unidad Eliminada con Éxito!!!",
            "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    objconexion.cierraConsultas();
    return 0;
}  
}
