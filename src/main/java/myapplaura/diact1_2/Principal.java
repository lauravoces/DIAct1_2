/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myapplaura.diact1_2;

import java.util.ArrayList;

/**
 *
 * @author lavogra
 */
public class Principal {
    public static ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
    public static void main(String[] args) {
        
        FormularioAlta formulario = new FormularioAlta();
        formulario.setVisible(true);
        Alumno alumno= new Alumno();
        
    }
    public static void agregarAlumno(Alumno alumno) {
      
            listaAlumno.add(alumno);
        
        System.out.println("Nuevo alumno agregado: " + alumno.getNombre() + " " + alumno.getApellidos());
    }

}
