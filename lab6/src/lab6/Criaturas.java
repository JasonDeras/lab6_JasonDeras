package lab6;

import java.util.ArrayList;

public class Criaturas {

    private String nombre_c;
    private double energia_v;
    private int años;
    private String nombre_r;
    private int cant_p;
    private ArrayList<String> objectos_m = new ArrayList();

    public Criaturas() {
    }

    public Criaturas(String nombre_c, double energia_v, int años, String nombre_r, int cant_p) {
        this.nombre_c = nombre_c;
        this.energia_v = energia_v;
        this.años = años;
        this.nombre_r = nombre_r;
        this.cant_p = cant_p;
    }

    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public double getEnergia_v() {
        return energia_v;
    }

    public void setEnergia_v(double energia_v) {
        this.energia_v = energia_v;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getNombre_r() {
        return nombre_r;
    }

    public void setNombre_r(String nombre_r) {
        this.nombre_r = nombre_r;
    }

    public int getCant_p() {
        return cant_p;
    }

    public void setCant_p(int cant_p) {
        this.cant_p = cant_p;
    }

    public ArrayList<String> getObjectos_m() {
        return objectos_m;
    }

    public void setObjectos_m(ArrayList<String> objectos_m) {
        this.objectos_m = objectos_m;
    }

    @Override
    public String toString() {
        return "Criaturas{" + "nombre_c=" + nombre_c + ", energia_v=" + energia_v + ", a\u00f1os=" + años + ", nombre_r=" + nombre_r + ", cant_p=" + cant_p + ", objectos_m=" + objectos_m + '}';
    }

}
