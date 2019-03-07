package mislugares.perstudio.com.mislugares;

import java.util.ArrayList;
import java.util.List;

public class Lugares {

    protected static List<Lugar> vectorLugares = ejemploLugares();

    public Lugares(){
        vectorLugares = ejemploLugares();
    }
    static Lugar elementos(int id){
        return vectorLugares.get(id);
    }
    static void anyade(Lugar lugar){
        vectorLugares.add(lugar);
    }
    static int nuevo(){
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }
    static void borrar(int id){
        vectorLugares.remove(id);
    }
    public static int size(){
        return vectorLugares.size();
    }
    public static ArrayList<Lugar> ejemploLugares(){
        ArrayList<Lugar> lugares = new ArrayList<Lugar>();

        lugares.add(new Lugar("Instituto Tecnológico de Granada","Paseo de los tristes",
                29.097282,-110.996411,TipoLugar.EDUCACION,2606500,"https://www.itmasterd.es/centro/masterd-granada/4700","Excelente escuela",4));

        lugares.add(new Lugar("Idamar","Av. de Enlace, 16",29.061361,-109.236947,
                TipoLugar.COMPRAS,3430538,"https://www.grupo-idamar.com/","Excelente servicio",5));

        lugares.add(new Lugar("Nuevo Colombino","Perimetral norte y Solidaridad " +
                "col.Alvaro Obregon",29.061361,-109.236947, TipoLugar.DEPORTE,3430538,
                "http://www.recreativohuelva.com/","Excelente estadio de futbol",5));

        return lugares;
    }

}
