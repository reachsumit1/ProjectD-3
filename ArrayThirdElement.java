package ArrayDemo;

public class ArrayThirdElement {
    public static void main(String[] args) {

                int[] number = new int[5];
                number[0] = 1;
                number[1] = 2;
                number[2] = 3;
                number[3] = 4;
                number[4] = 5;

                /*for (int i=0;i<5;i++){
                    System.out.println(number[i]);
                }*/
                int thirdElement = number[3];
                System.out.println("Third index value is : "+thirdElement);

                System.out.println("The array length is : "+ number.length);
            }
        }