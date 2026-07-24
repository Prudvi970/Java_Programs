public class MinMaxDiff {
    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 10, 5};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Difference = " + difference);
    }
}
