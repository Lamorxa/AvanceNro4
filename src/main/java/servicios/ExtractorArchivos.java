/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import conexion.Conexion;
import java.sql.SQLException;
import modelos.EmpresaTransporte;
import modelos.Personas;
import modelos.RegistroConsumos;
import modelos.RegistroRecargas;
import modelos.Rutas;
import modelos.Tarjetas;
import modelos.Unidades;
import modelos.Usuarios;


public class ExtractorArchivos {
    public static SimpleDateFormat formatoHoraFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public static SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
    public static ContenedorData<Personas> tmpPersonas = new ContenedorData<Personas>();
    public static ContenedorData<Rutas> tmpRutas = new ContenedorData<Rutas>();
    public static ContenedorData<Tarjetas> tmpTarjetas= new ContenedorData<Tarjetas>();
    public static ContenedorData<Unidades> tmpUnidades= new ContenedorData<Unidades>();
    public static ContenedorData<Usuarios> tmpUsuarios= new ContenedorData<Usuarios>();
    public static ContenedorData<EmpresaTransporte> tmpEmpresaTransporte = new ContenedorData<EmpresaTransporte>();
    public static ContenedorData<RegistroConsumos> tmpRegistroConsumos= new ContenedorData<RegistroConsumos>();
    public static ContenedorData<RegistroRecargas> tmpRegistroRecargas= new ContenedorData<RegistroRecargas>();
    public static LinkedHashSet<String> hset = new LinkedHashSet<>();
    public static SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    static {

        Conexion objConexion = new Conexion();
        objConexion.crearConexion();
        String tablas[] = {"personas", "rutas", "tarjetas", "registroconsumos","registrorecargas", "unidades","usuarios","empresatransporte",};

        try {

            for (int i = 0; i < tablas.length; i++) {

                ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM " + tablas[i]);

                while (resultado.next()) {
                    switch (i) {
                        case 0:
                            tmpPersonas.agregar(new Personas(
                                    resultado.getString("Dni"),
                                    resultado.getString("Nombres"),
                                    resultado.getString("ApellidoPaterno"),
                                    resultado.getString("ApellidoMaterno"),
                                    resultado.getString("Telefono"),
                                    resultado.getString("Correoelectronico"),
                                    resultado.getInt("IdTipoPersona"),
                                    resultado.getString("RucEmpresa"),
                                    resultado.getString("estado")
                            ));

                            System.out.println("Persona agregada");
                            break;
                        case 1:

                            tmpRutas.agregar(new Rutas(
                                    resultado.getInt("IdRuta"),
                                    resultado.getString("NombreRuta"),
                                    resultado.getDouble("MontoRuta"),
                                    resultado.getString("estado")
                                    
                            ));
                            System.out.println("RutaAgregada agregado");
                            break;
                        case 2:
                            tmpTarjetas.agregar(new Tarjetas(
                                    resultado.getString("CodTarjeta"),
                                    resultado.getDouble("Saldo"),
                                    resultado.getString("Dni"),
                                    resultado.getString("FechaCreacion"),
                                    resultado.getString("FechaCaducidad"),
                                    resultado.getString("estado")
                                    
                            ));
                            System.out.println("tarjeta  agregado");
                            break;
                        case 3:
                            tmpRegistroConsumos.agregar(new RegistroConsumos(
                                    resultado.getInt("CodConsumo"),
                                    resultado.getDouble("MontoConsumo"),
                                    resultado.getString("CodTarjeta"),
                                    resultado.getString("CodUnidad"),
                                    resultado.getString("FechaConsumo"),
                                    resultado.getString("estado")
                                    
                            ));
                            System.out.println("consumo agregado");
                            break;
                        case 4:
                            tmpRegistroRecargas.agregar(new RegistroRecargas(
                                    resultado.getInt("CodRecarga"),
                                    resultado.getDouble("MontoRecarga"),
                                    resultado.getString("CodTarjeta"),
                                    resultado.getString("Fecharecarga"),
                                    resultado.getString("estado")
                            ));
                            System.out.println("recargas agregado");
                            break;
                        case 5:
                            tmpUnidades.agregar(new Unidades
                            (
                                    resultado.getString("CodUnidad"),
                                    resultado.getString("Dni"),
                                    resultado.getInt("IdRuta"),
                                    resultado.getInt("CodSoat"),
                                    resultado.getString("estado")
                            ));
                            System.out.println("Unidad de transporte agregado");

                            break;
                        case 6:
                            tmpUsuarios.agregar(new Usuarios(
                                    resultado.getInt("IdUsuario"),
                                    resultado.getString("Dni"),
                                    resultado.getString("User"),
                                    resultado.getString("Contraseña"),
                                    resultado.getString("estado")
                            ));

                            break;
                        case 7:
                            tmpEmpresaTransporte.agregar(new EmpresaTransporte(
                             resultado.getString("RucEmpresa"),
                                    resultado.getString("NombreEmpresa"),
                                    resultado.getString("Color"),
                                    resultado.getString("estado")
                            
                            
                            ));
                            
                            break;
                    }

                }

            }

            objConexion.cierraConsultas();
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos. Error:" + e);
        }

    }
}
