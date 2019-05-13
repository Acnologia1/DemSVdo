package Lession2;
import java.util.Scanner;

public class demSV {
    public static void main(String[] args)
    {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        //Chỉ cho phép nhập 30 SV
        do{
            System.out.println("Nhập kích cỡ mảng");
            size = scanner.nextInt();
            if(size >30)
                System.out.println("Nhập lại giá trị <30");
        }while(size  >30);
        //Nhập giá trị cho mảng
        array = new int[size];
        int i = 0;
        while (i <array.length)
        {
            System.out.println("Nhập sinh viên thứ "+ (i+1)+ " :");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra danh sách vừa nhập và đếm số lượng sv đỗ
        int count = 0;
        System.out.println("Danh sách sinh viên");
        for(i = 0;i<size;i++)
        {
            System.out.println(array[i]+"\t");
            if(array[i] >=5 && array[i] <=10)
                count++;
        }
        System.out.println("Số lượng sinh viên đỗ :"+ count);
    }
}
