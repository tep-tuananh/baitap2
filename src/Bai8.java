import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngày: ");
        int day= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tháng: ");
        int month=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập năm : ");
        int year=Integer.parseInt(sc.nextLine());
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
               if(year<0&& day<=31)
               {
                   System.out.println("Có 31 ngày chính xác");
               }
               else {
                   System.out.println("Sai ngày trong tháng");
               }
                break;
            case 2:
                if(year <0 &&year %4==0 && year %100!=0 && day<=29)
                {
                    System.out.println("Năm nhuận : 29 ngày chính xác");
                }
                else if(day<=28)
                {
                    System.out.println("Có 28 ngày chính xác");
                }
                else {
                    System.out.println("nhập ngày saiii");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(year<0&& day<=30) {
                    System.out.println("Có 30 ngày");
                }
                else {
                    System.out.println("Ngày nhập hiện tại saiii");
                }
                break;
            default:
                System.out.println("Nhập tháng saii");
        }
    }
}
