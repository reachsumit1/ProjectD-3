package ArrayDemo;

public class OddPosition {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Elements of given array present on odd position: ");
        for (int i = 0; i < arr.length;i++) {
            if(arr[i]%2!=0)
            System.out.println(arr[i]);
        }
    }
}
