package ArrayDemo;

public class TwoDArray {
    public static void matrixMethod(int [][] matrixForm) {
        for (int i = 0; i < matrixForm.length; i++) {
            for (int j = 0; j < matrixForm[i].length; j++) {
                System.out.print(matrixForm[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrixForm ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrixForm.length);
        matrixMethod(matrixForm);
    }
}
