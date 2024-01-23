import javax.swing.text.Utilities;
import java.util.Arrays;

public class Aspiradora extends Electrodomesticos{

    private int [] limpiezahoras;

    public Aspiradora(){
        super();
        limpiezahoras = new int[7];

        for (int i = 0; i < limpiezahoras.length; i++) {
            limpiezahoras[i] = (int)(Math.random()*4+2);

        }
    }

    public Aspiradora(int[] limpiezahoras, double peso){
        this.peso = peso;
        this.limpiezahoras = limpiezahoras;
    }

    public int[] getLimpiezahoras() {
        return limpiezahoras;
    }

    public void setLimpiezahoras(int[] limpiezahoras) {
        this.limpiezahoras = limpiezahoras;
    }

    @Override
    public String toString() {
        return "Esta aspiradora tiene un peso de " + peso + ", y limpia estas horas a la semana " + Arrays.toString(limpiezahoras);
    }


}
