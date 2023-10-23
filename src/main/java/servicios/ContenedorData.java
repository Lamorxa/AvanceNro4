/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import static servicios.ExtractorArchivos.formato;
import static servicios.ExtractorArchivos.tmpPersonas;
import conexion.Conexion;
import modelos.*;
import modelos.Personas;
import modelos.RegistroConsumos;
import modelos.Tarjetas;
import modelos.Usuarios;

/**
 *
 * @author sebav
 */
public class ContenedorData<T> implements Iterable<T> {

    //ATRIBUTOS
    private List<T> lista = new ArrayList<T>();
    private int longitud;

    //METODOS GETTER & SETTER
    public int getLongitud() {

        return longitud;

    }

    public void setLongitud(int longitud) {

        this.longitud = longitud;

    }

    //METODOS IMPLEMENTADO DE LA INTERFAZ Iterable
    //RECORRER LOS OBJETOS DE LA COLECCION
    public Iterator<T> iterator() {
        return lista.iterator();

    }

    //METODOS PUBLICOS
    public void agregar(T objeto) {
        lista.add(objeto);

    }

 

    public T extraer(int indice) {
        if (indice < lista.size()) {
            return lista.get(indice);
        } else {
            return null;
        }

    }

    public int buscar(T objeto) {
        if (lista.contains(objeto)) {
            return lista.indexOf(objeto);
        } else {
            return -1;
        }

    }

    public T buscarPorCod(String cod) {
       
        return null;
    }

    public boolean reemplazar(T objetoBuscado, String cod) {
            
        for (T objeto : lista)
        { if(objeto instanceof EmpresaTransporte &&(((EmpresaTransporte)objeto).getRucEmpresa().equals(cod))){
        EmpresaTransporte editado=(EmpresaTransporte)objeto;
        int b = lista.indexOf(editado);
        lista.set(b, objetoBuscado);
        System.out.println("indice del programa a editar : " + b);
        return true;
        }
        
         if (objeto instanceof Personas && (((Personas) objeto).getDni().equals(cod))) {
                Personas editado = (Personas) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Rutas && (((Rutas) objeto).getIdRuta()==Integer.parseInt(cod))) {
                Rutas editado = (Rutas) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Tarjetas && (((Tarjetas) objeto).getCodTarjeta().equals(cod))) {
                Tarjetas editado = (Tarjetas) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof RegistroConsumos && (((RegistroConsumos) objeto).getCodConsumo()==(Integer.parseInt(cod)))) {
                RegistroConsumos editado = (RegistroConsumos) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof RegistroRecargas && (((RegistroRecargas) objeto).getCodRecarga()==(Integer.parseInt(cod)))) {
                RegistroRecargas editado = (RegistroRecargas) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Unidades && (((Unidades) objeto).getCodUnidad().equals(cod))) {
                Unidades editado = (Unidades) objeto;
                int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;
            }
            if (objeto instanceof Usuarios && (((Usuarios) objeto).getIdUsuario()==Integer.parseInt(cod))) {
                Usuarios editado = (Usuarios) objeto;
             int b = lista.indexOf(editado);
                lista.set(b,objetoBuscado );
                System.out.println("indice de la persona a eliminar : " + b);
                return true;
                }
            }
  return false;
    }


    public boolean eliminar(String cod) {
        for (T objeto : lista) {
            if (objeto instanceof EmpresaTransporte && (((EmpresaTransporte) objeto).getRucEmpresa().equals(cod))) {
                EmpresaTransporte eliminado = (EmpresaTransporte) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice del empresa a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Personas && (((Personas) objeto).getDni().equals(cod))) {
                Personas eliminado = (Personas) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la persona a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Rutas && (((Rutas) objeto).getIdRuta()==Integer.parseInt(cod))) {
                Rutas eliminado = (Rutas) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la rutas a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Tarjetas && (((Tarjetas) objeto).getCodTarjeta().equals(cod))) {
                Tarjetas eliminado = (Tarjetas) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la tarjeta a eliminar : " + b);
                return true;

            }
            if (objeto instanceof RegistroConsumos && (((RegistroConsumos) objeto).getCodConsumo()==(Integer.parseInt(cod)))) {
                RegistroConsumos eliminado = (RegistroConsumos) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la consumo a eliminar : " + b);
                return true;

            }
            if (objeto instanceof RegistroRecargas && (((RegistroRecargas) objeto).getCodRecarga()==(Integer.parseInt(cod)))) {
                RegistroRecargas eliminado = (RegistroRecargas) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la recarga a eliminar : " + b);
                return true;

            }
            if (objeto instanceof Unidades && (((Unidades) objeto).getCodUnidad().equals(cod))) {
                Unidades eliminado = (Unidades) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la recarga a eliminar : " + b);
                return true;
            }
            if (objeto instanceof Usuarios && (((Usuarios) objeto).getIdUsuario()==Integer.parseInt(cod))) {
                Usuarios eliminado = (Usuarios) objeto;
                int b = lista.indexOf(eliminado);
                lista.remove(b);
                System.out.println("indice de la recarga a eliminar : " + b);
                return true;
            }
            
        }
        return false;

    }

    public int tamaño() {
        return lista.size();
    }

//    public boolean eliminar(int indice) {
//        boolean result = false;
//
//        if (indice < lista.size()) {
//            lista.remove(indice);
//
//            result = true;
//
//        }
//
//        return result;
//
//    }
}
