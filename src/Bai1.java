import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number=sc.nextInt();
        if(number %2 != 0)
        {
            System.out.println("là số lẻ ");
        }
        else {
            System.out.println("là số chẵn");
        }
    }
}
