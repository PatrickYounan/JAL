package jal.sort;

/**
 * @author Patrick
 */
public final class BeadSort {

    private BeadSort() { }

    public static void sort(int[] array) {
        int max = array[0];
        int length = array.length;

        for (int index = 1; index < length; index++) {
            if (array[index] > max) max = array[index];
        }

        byte[] beads = new byte[max * length];
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < array[row]; col++) {
                beads[row * max + col] = 1;
            }
        }
        for (int col = 0; col < max; col++) {
            int sum = 0;
            for (int row = 0; row < length; row++) {
                int index = row * max + col;
                sum += beads[index];
                beads[index] = 0;
            }
            for (int row = length - sum; row < length; row++) {
                beads[row * max + col] = 1;
            }
        }
        for (int index = 0; index < length; index++) {
            int row;
            for ( row = 0; row < max && beads[index * max + row] == 1; row++);
            array[index] = row;
        }
    }

}
