package ArrayDemo;
public class SmallestElementInAnArray {
    public static void main(String[] args) {

        int arr[] = {2, 1, 7, 5, 6};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <min)
                min = arr[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
