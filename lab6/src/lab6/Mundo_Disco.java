package lab6;

import java.util.ArrayList;

public class Mundo_Disco {

    private String nombre_t;
    private ArrayList<Criaturas> cria = new ArrayList();

    public Mundo_Disco(String nombre_t) {
        this.nombre_t = nombre_t;
    }

    public String getNombre_t() {
        return nombre_t;
    }

    public void setNombre_t(String nombre_t) {
        this.nombre_t = nombre_t;
    }

    public ArrayList<Criaturas> getCria() {
        return cria;
    }

    public void setCria(ArrayList<Criaturas> cria) {
        this.cria = cria;
    }

    @Override
    public String toString() {
        return "Mundo_Disco{" + "nombre_t=" + nombre_t + ", cria=" + cria + '}';
    }

}
