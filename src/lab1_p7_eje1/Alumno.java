/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p7_eje1;

import java.util.HashSet;

/**
 *
 * @author Thomas
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet<Materia>Lista = new HashSet<Materia>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarMateria(Materia M){
        Lista.add(M);
   }
    public int cantidadMaterias(){;
    int aux=0;
        for (Materia it : Lista) {
             aux++;
        }
     return aux;
    }
}
