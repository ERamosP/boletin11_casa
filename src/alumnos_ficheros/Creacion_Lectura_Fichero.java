package alumnos_ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Creacion_Lectura_Fichero {

        List<Alumno> listaAlumnos=new ArrayList<>();
    RandomAccessFile raf;

    {
        try {
            raf = new RandomAccessFile("alumnos.dat", "rw");






        } catch (FileNotFoundException e) {
            System.out.println(e+" Error");
        }
    }


}
