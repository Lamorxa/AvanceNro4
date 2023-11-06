/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelos;

import modelos.Unidades;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UnidadesDAO {
    
    Conexion cn = new Conexion() ;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean registrarUnidad(Unidades unidades) {
    String sql = "INSERT INTO unidades (CodUnidad, Dni, IdRuta, CodSoat, Estado) VALUES (?, ?, ?, ?, ?)";
    Conexion cn = new Conexion();

    try {
        Connection con = cn.crearConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, unidades.getCodUnidad());
        ps.setString(2, unidades.getDni());
        ps.setInt(3, unidades.getIdRuta());
        ps.setInt(4, unidades.getCodSoat());
        ps.setString(5, unidades.getEstado());
        ps.execute();
        cn.cierraConsultas();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al registrar unidad: " + e.toString());
        return false;
    }
}

public List<Unidades> listarUnidades() {
    List<Unidades> unidadesLista = new ArrayList<>();
    Conexion cn = new Conexion();
    ResultSet rs = null;
    String sql = "SELECT * FROM unidades";

    try {
        Connection con = cn.crearConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Unidades unidades = new Unidades();
            unidades.setCodUnidad(rs.getString("CodUnidad"));
            unidades.setDni(rs.getString("Dni"));
            unidades.setIdRuta(rs.getInt("IdRuta"));
            unidades.setCodSoat(rs.getInt("CodSoat"));
            unidades.setEstado(rs.getString("Estado"));
            unidadesLista.add(unidades);
        }
        cn.cierraConsultas();
    } catch (SQLException e) {
        System.out.println("Error al listar unidades: " + e.toString());
    }
    return unidadesLista;
}

public boolean modificarUnidad(Unidades unidades) {
    String sql = "UPDATE unidades SET Dni=?, IdRuta=?, CodSoat=?, Estado=? WHERE CodUnidad=?";
    Conexion cn = new Conexion();

    try {
        Connection con = cn.crearConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, unidades.getDni());
        ps.setInt(2, unidades.getIdRuta());
        ps.setInt(3, unidades.getCodSoat());
        ps.setString(4, unidades.getEstado());
        ps.setString(5, unidades.getCodUnidad());
        ps.execute();
        cn.cierraConsultas();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al modificar unidad: " + e.toString());
        return false;
    }
}

public boolean eliminarUnidad(Unidades unidades) {
    String sql = "DELETE FROM unidades WHERE CodUnidad = ?";
    Conexion cn = new Conexion();

    try {
        Connection con = cn.crearConexion();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, unidades.getCodUnidad());
        ps.execute();
        cn.cierraConsultas();
        return true;
    } catch (SQLException e) {
        System.out.println("Error al eliminar unidad: " + e.toString());
        return false;
    }
}
    
}
    