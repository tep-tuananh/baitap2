import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm hiện tại: ");
        int year=Integer.parseInt(sc.nextLine());
        System.out.println("nhập thaáng: ");
        int month=Integer.parseInt(sc.nextLine());
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                if(year %4==0 && year %100!=0)
                {
                    System.out.println("Năm nhuận : 29 ngày");
                }
                else
                {
                    System.out.println("Có 30 ngày");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;
        }

    }
}
