package lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Mundo_Disco {

    private String nombre_t;
    private ArrayList<Criaturas> cria = new ArrayList();
    private File archivo = null;

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

    public void setCriatura(Criaturas c) {
        this.cria.add(c);
    }

    @Override
    public String toString() {
        return "Mundo_Disco{" + "nombre_t=" + nombre_t + ", cria=" + cria + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Criaturas c : cria) {
                bw.write(c.getNombre_c() + ";");
                bw.write(c.getEnergia_v() + ";");
                bw.write(c.getAños() + ";");
                bw.write(c.getNombre_r() + ";");
                bw.write(c.getCant_p() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner s = null;
        cria = new ArrayList();
        if (archivo.exists()) {
            try {
                s = new Scanner(archivo);
                s.useDelimiter(";");
                while (s.hasNext()) {
                    cria.add(new Criaturas(s.next(), s.nextDouble(), s.nextInt(), s.next(), s.nextInt()));
                }
            } catch (Exception e) {
            }
            s.close();
        }
    }
}
