import java.util.*;

public class TwoDiffArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        int[] arrX = new int[size];
        int[] arrY = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arrX[i] = rand.nextInt(100);
            arrY[i] = rand.nextInt(100);
        }

        for (int i = 0; i < arrX.length; i++) {
            System.out.print(arrX[i]);
            if (i != arrX.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrY.length; i++) {
            System.out.print(arrY[i]);
            if (i != arrY.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        List<Integer> missingElements = findMissingElements(arrX, arrY);
        System.out.println("Missing Elements: " + " " + missingElements);

        List<Integer> commonElements = findCommonElements(arrX, arrY);

        System.out.println("Common Elements:" + " " + commonElements);

    }

    private static List<Integer> findMissingElements(int[] arrX, int[] arrY) {
        List<Integer> missingElements = new ArrayList<>();
        for (int i : arrX) {
            if (!contains(arrY, i)) {
                missingElements.add(i);
            }
        }
        return missingElements;
    }

    private static List<Integer> findCommonElements(int[] arrX, int[] arrY) {
        List<Integer> commonElements = new ArrayList<>();
        for (int i : arrX) {
            if (contains(arrY, i)) {
                commonElements.add(i);
            }
        }
        return commonElements;
    }

    private static boolean contains(int[] array, int elements) {
        for (int i : array) {
            if (i == elements) {
                return true;
            }
        }
        return false;
    }


}
