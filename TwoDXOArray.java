package ArrayDemo;


public class TwoDXOArray {
    public static void matrixMethod(char [][] matrixForm) {
        for (char i = 0; i < matrixForm.length; i++) {
            for (char j = 0; j < matrixForm[i].length; j++) {
                System.out.print(matrixForm[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] matrixForm ={{'X','O','X'},{'X','O','X'},{'X','O','X'}};
        System.out.println(matrixForm.length);
        matrixMethod(matrixForm);
    }
}

