public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 3, 8};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}