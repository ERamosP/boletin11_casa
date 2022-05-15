package alumnos_ficheros;

import java.io.Serializable;

public class Alumno implements Serializable, Comparable {
    /**
     * Creamos la clase alumno, con los atributos especificados en el enunciado del ejercicio
     */
    private int matricula;
    private String nombre;
    private String apellido;
    private int[] notas= new int[4];

    /**
     *
     * Creamos dos metodos constructores, uno sin paramentros y el otro con todos los paramentros
     */

    public Alumno(int matricula, String nombre, String apellido, int[] notas) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    /**
     * Creamos los metodos Getters y Setter de todos los atributos
     * @return
     */
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    /**
     * Creamos la clase toString
     * @return
     */
    public String toString(){
        return "El alumno cuya matricula es "+ this.matricula+ " se llama: " +this.nombre + ""+ this.apellido+
                " y sus notas son "+ this.notas;

    }

    /**
     * creamos el metodo compareTo por si lo llegaramos a necesitar
     * @param o the object to be compared.
     * @return
     */
    public int compareTo(Object o){

        int salida=-1;

        if (o instanceof Alumno){
            Alumno alumno=(Alumno) o;
           salida = this.matricula-(alumno.matricula);
        }
            return salida;

    }
}
