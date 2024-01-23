public class Lavadora extends Electrodomesticos {
    private int modos;
    private double capacidad;

    public Lavadora() {
        super();
        this.modos = (int)(Math.random()*7);
        this.capacidad = (Math.random()*20);
    }

    public Lavadora(double capacidad, double peso, int modos) {
        super();
        this.peso = peso;
        this.capacidad = capacidad;
        this.modos = modos;
    }

    public void setModos(int modos) {
        this.modos = modos;
    }

    public int getModos() {
        return modos;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "La lavadora pesa " + peso + ", " + " tiene " + modos + " modos, y cuenta con una capacidad de " + capacidad + " kg";
    }
}
