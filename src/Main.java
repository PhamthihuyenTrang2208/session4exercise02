import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập kích tước mảng: ");
        int size = scan.nextInt();
        int array[]=new int[size];
        System.out.println("nhập các phâgn tử cho mảng:");
        for(int i =0;i<=size-1;i++){
            array[i]=scan.nextInt();}
        for(int i =0;i<=size-1;i++){
            int maxIndex= i;
            for(int j=i;j<size;j++){
                if(array[j]>array[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=array[i];
            array[i]=array[maxIndex];
            array[maxIndex]=temp;
        }

            System.out.print("Mảng sau khi sắp xếp theo thứ tự giảm dần: [ ");
        for(int i=0;i<size;i++){ System.out.print(array[i]);
        if(i!=size-1)System.out.print(",");};System.out.println("]");
            System.out.printf("Phần tử lớn nhất trong mảng là: %d",array[0]);

    }
}