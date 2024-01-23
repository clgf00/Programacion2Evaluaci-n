// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Aspiradora aspiradora = new Aspiradora();

        Lavadora lavadora = new Lavadora();
        System.out.println(lavadora);
        System.out.println("Esta lavadora pesa " + lavadora.getPeso() + ", " + " tiene " + lavadora.getModos() + " modos, y cuenta con una capacidad de " + lavadora.getCapacidad() + "kg");
        System.out.println(aspiradora);
    }

}