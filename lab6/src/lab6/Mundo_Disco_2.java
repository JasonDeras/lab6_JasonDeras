package lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Mundo_Disco_2 {

    private ArrayList<Criaturas> cria = new ArrayList();
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

    @Override
    public String toString() {
        return "Mundo_Disco_2{" + "archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Criaturas c : cria) {
                bw.write(c.getNombre_c() + "|");
                bw.write(c.getEnergia_v() + "|");
                bw.write(c.getAños() + "|");
                bw.write(c.getNombre_r() + "|");
                bw.write(c.getCant_p() + "|");
            }
            bw.write("|");
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
                s.useDelimiter("|");
                while (s.hasNext()) {
                    cria.add(new Criaturas(s.next(), s.nextDouble(), s.nextInt(), s.next(), s.nextInt()));
                }
            } catch (Exception e) {
            }
            s.close();
        }
        s.close();
    }
}
