import java.util.Random;

public class arrayordenar {
    public static void main(String[] args) {
        //Actualizando repositorio
        //leer array y ordenarlo
        Random random = new Random();
        int numeros[] = new int[10];
        int aux;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(0, 10);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < numeros.length- 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    flag = true;
                }
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "  ");
        }

    }

}

