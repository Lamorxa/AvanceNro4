/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Intefaces;

import java.util.List;

/**
 *
 * @author Lamorxa
 */
public interface Controlador <T> 


{

    public abstract List<T> consultarTodos();

    public abstract T consultarPorID(int id);

    public abstract List<T> consultarPorNombres(String nombre);

    public abstract int insertar(T obj);

    public abstract int actualizar(T obj, String Doc);

    public abstract int eliminar(T obj);


    
}
