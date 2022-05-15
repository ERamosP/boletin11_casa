package alumnos_ficheros;

public class Alumnos_NotaMedia extends Alumno{


    private float notaMedia;


    public Alumnos_NotaMedia(int matricula, String nombre, String apellido, int[] notas, float notaMedia) {
        super(matricula, nombre, apellido, notas);
        this.notaMedia=0;
    }

    public float getNotaMedia(int[] notas) {
        int media=0;
        for (int i = 0; i <notas.length ; i++) {
            media+=notas[i];
        }
        return media;
    }



    public String toString(){

        return super.toString()+ " su nota media es "+this.notaMedia;
    }


}
