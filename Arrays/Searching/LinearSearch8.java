class LinearSearch8 {
    public static void main(String[] args) {
        int[] arr = {15, 25, 35, 45};
        int key = 15;

        boolean exists = false;

        for (int num : arr) {
            if (num == key) {
                exists = true;
                System.out.println("Index is:"+num);
                break;
            }
        }

        if (exists)
            System.out.println("Element Exists");
        else
            System.out.println("Element Does Not Exist");
    }
}