class FindAverage{
    public static void main(String[] args){
        int sum = 0;
        int[] arr = {10,20,30,40};
        for(int i = 0; i < arr.length; i++){
          sum += arr[i];
        
        }

        System.out.println(sum);
       double average = (double)sum / arr.length;
       System.out.print(average);
    }
}