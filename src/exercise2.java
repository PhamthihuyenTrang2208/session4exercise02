import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập kích tước mảng: ");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("nhập các phâgn tử cho mảng:");
        for (int i = 0; i <= size - 1; i++) {
            array[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= size - 1; i++) {
            sum = sum + array[i];
        }


        System.out.print("Tổng của mảng là: "+sum);
    }
}