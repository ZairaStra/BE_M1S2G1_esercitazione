package ES1.entities;

import java.util.Random;

public class ArraySetting {
    private int[] array = new int[5];

    public ArraySetting() {
        Random rndm = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rndm.nextInt(10) + 1;
        }
    }

    public void reset(int index, int value) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("La posizione indicata non è valida");
        }
        array[index] = value;
    }

    public void stamp() {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
