/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import conexion.Conexion;
import java.util.List;
import javax.swing.JOptionPane;
import servicios.ExtractorArchivos;

/**
 *
 * @author LamorxaXD
 */
public class EmpresaTransporte implements Intefaces.Controlador{
    private String rucEmpresa;
    private String nombreEmpresa;
    private String color;
    private String estado;

    public EmpresaTransporte() {
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstado() {
        return estado;
    }

    // Aquí irían los métodos para realizar operaciones CRUD en la tabla 'empresatransporte'
    // Constructor, getters, setters, etc.
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EmpresaTransporte(String rucEmpresa, String nombreEmpresa, String color, String estado) {
        this.rucEmpresa = rucEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.color = color;
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
        EmpresaTransporte nuevaempresa= (EmpresaTransporte) obj;
        Conexion objConexion= new Conexion();
        objConexion.crearConexion();
        objConexion.ejecutarSentenciaSQL("insert into empresatransporte values ('"
                +nuevaempresa.getRucEmpresa() + "','"
                + nuevaempresa.getNombreEmpresa()+ "','"
                + nuevaempresa.getColor()+ "','"
                +nuevaempresa.getEstado()+ "')"
                );
         objConexion.cierraConsultas();
        JOptionPane.showMessageDialog(null, "Empresa Grabado con Exito!!!",
                "Grabando", JOptionPane.INFORMATION_MESSAGE);
        ExtractorArchivos.tmpEmpresaTransporte.agregar(nuevaempresa);
        return 0;
    }

    @Override
    public int actualizar(Object obj, String Ruc) {
        EmpresaTransporte editado = (EmpresaTransporte) obj;
         Conexion objConexion = new Conexion();
         objConexion.crearConexion();
         ExtractorArchivos.tmpEmpresaTransporte.reemplazar(editado, Ruc);
         objConexion.ejecutarSentenciaSQL("UPDATE empresatransporte SET "
            + "RucEmpresa='" + editado.getRucEmpresa()+ "', "
            + "NombreEmpresa='" + editado.getNombreEmpresa()+ "', "
            + "Color='" + editado.getColor()+ "', "
            + "estado='" + editado.getEstado()+ "' "
            + "WHERE RucEmpresa='" + Ruc + "'");
      JOptionPane.showMessageDialog(null, "Empresa Editado con Exito!!!",
                "Editando", JOptionPane.INFORMATION_MESSAGE);
      objConexion.cierraConsultas();
        return 0;
    }

    @Override
    public int eliminar(Object obj) {
       EmpresaTransporte eliminado=(EmpresaTransporte) obj;
       conexion.Conexion objconexion= new Conexion();
       objconexion.crearConexion();
       ExtractorArchivos.tmpEmpresaTransporte.eliminar(eliminado.getRucEmpresa());
       objconexion.ejecutarSentenciaSQL("DELETE FROM empresatransporte WHERE RucEmpresa='" + eliminado.getRucEmpresa() + "'");
       JOptionPane.showMessageDialog(null, "Cliente Eliminado con Exito!!!",
                "Eliminado", JOptionPane.INFORMATION_MESSAGE);
       objconexion.cierraConsultas();
         return 0;
         }
}
