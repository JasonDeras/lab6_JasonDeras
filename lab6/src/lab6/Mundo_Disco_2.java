package lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mundo_Disco_2 {

    private ArrayList<Criaturas> cria = new ArrayList();
    private ArrayList<Mundo_Disco> m = new ArrayList();
    private File archivo = null;

    public Mundo_Disco_2(String path) {
        archivo = new File(path);
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

    public ArrayList<Mundo_Disco> getM() {
        return m;
    }

    public void setM(ArrayList<Mundo_Disco> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "Mundo_Disco_2{" + "archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Mundo_Disco mu : m) {
                bw.write(mu.getNombre_t() + ";");
                for (int i = 0; i < mu.getCria().size(); i++) {
                    bw.write(mu.getCria().get(i).getNombre_c() + ",");
                    bw.write(mu.getCria().get(i).getEnergia_v() + ",");
                    bw.write(mu.getCria().get(i).getAños() + ",");
                    bw.write(mu.getCria().get(i).getNombre_r() + ",");
                    bw.write(mu.getCria().get(i).getCant_p() + ",");
                    bw.write(mu.getCria().get(i).getObjectos_m() + ",");
                }
                bw.write(";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner s = null;
        Scanner s2 = null;
        m = new ArrayList();
        cria = new ArrayList();
        if (archivo.exists()) {
            try {
                s = new Scanner(archivo);
                s2 = new Scanner(archivo);
                s2.useDelimiter(",");
                s.useDelimiter(";");
                while (s.hasNext()) {
                    while (s2.hasNext()) {
                        cria.add(new Criaturas(s2.next(), s2.nextDouble(), s2.nextInt(), s2.next(), s2.nextInt()));
                        m.add(new Mundo_Disco(s.next()));
                        m.get(m.size() - 1).setCria(cria);
                    }
                }
            } catch (Exception e) {
            }
            s.close();
            s2.close();
        }
    }
}
