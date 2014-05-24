package maxdemo;
public class MaxDemo {
    public static void main(String[] args) {
        int i,max,min;
        int arr[] = {74,48,5,30,17,62,99};
        System.out.println("Array is Elements : ");
        max=min=arr[0];
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] > max)
                max = arr[j];
            if(arr[j] < min)
                min = arr[j];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}













