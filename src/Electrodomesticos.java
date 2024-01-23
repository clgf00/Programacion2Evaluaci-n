public abstract class Electrodomesticos {
    protected double peso;

    public Electrodomesticos(){
        peso = Math.random()*100;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
