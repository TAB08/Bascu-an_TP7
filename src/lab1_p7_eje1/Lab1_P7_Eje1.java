/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_p7_eje1;

/**
 *
 * @author Thomas
 */
public class Lab1_P7_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*a) Crear las materias: 
           i. Ingles I de primer año. 
           ii. Matemáticas de primer año. 
           iii. Laboratorio 1 de primer año 
        */
        Materia Ingles1= new Materia(1,"Ingles 1",2020);
        Materia Matematicas= new Materia(2,"Matematicas",2020);
        Materia Laboratorio1= new Materia(3,"Laboratorio 1",2020);
      
        /*b) Crear 2 alumnos. 
             a. López Martin con legajo 1001. 
             b. Martínez Brenda con legajo 1002. 
        */
        Alumno Lopez= new Alumno(1001,"Lopez","Martin");
        Alumno Martinez= new Alumno(1002,"Martinez","Brenda");
       // c) Inscribir a López en las 3 materias. 
        Lopez.agregarMateria(Ingles1);
        Lopez.agregarMateria(Matematicas);
        Lopez.agregarMateria(Laboratorio1);
        //d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1. 
        Martinez.agregarMateria(Ingles1);
        Martinez.agregarMateria(Matematicas);
        Martinez.agregarMateria(Laboratorio1);
        Martinez.agregarMateria(Laboratorio1);
      
    /*e) Visualizar la cantidad de materias a las que está inscripto cada alumno. 
         a. ¿Por qué  ambos tienen la misma cantidad si al último alumno lo inscribió en 4 materias? 
              Tiene 3 materia porque, la ultima ya esta en la lista y no se puede repetir.
         b. ¿Qué tipo de colección implementó para evitar materias repetidas y que otras cuestiones tuvo que modificar? 
               Implemente la Coleccion HastSet, porque tiene la propiedad de no tener valores duplicados en la coleccion.
    */  
    int cant=0;
    
      cant= Martinez.cantidadMaterias();
      System.out.println("Martinez tine "+ cant+" de materias");
      cant= Lopez.cantidadMaterias();
      System.out.println("Lopez tine "+ cant+" de materias");
 }    
    
}
