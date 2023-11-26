import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số điện đầu tháng: ");
        int number1=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số điện cuối tháng: ");
        int number2=Integer.parseInt(sc.nextLine());
        int tongSo=number2-number1;
        int giaDien;
        int tongTien;
        if(0<tongSo && tongSo<50)
        {
            giaDien=10000;
            System.out.println("Giá điện là 10.000");
            tongTien=tongSo*giaDien;
            System.out.println("Tổng tiền : "+tongTien);
        } else if (50<=tongSo && tongSo<100) {
            giaDien=15000;
            System.out.println("Giá điện là 15.000");
            tongTien=tongSo*giaDien;
            System.out.println("Tổng tiền : "+tongTien);
        }
        else if (100<=tongSo && tongSo<150) {
            giaDien=20000;
            System.out.println("Giá điện là 20.000");
            tongTien=tongSo*giaDien;
            System.out.println("Tổng tiền : "+tongTien);
        }
        else if (150<=tongSo && tongSo<200) {
            giaDien=25000;
            System.out.println("Giá điện là 25.000");
            tongTien=tongSo*giaDien;
            System.out.println("Tổng tiền : "+tongTien);
        }
        else {
            giaDien=30000;
            System.out.println("Giá điện là 30.000");
            tongTien=tongSo*giaDien;
            System.out.println("Tổng tiền : "+tongTien);
        }
    }
}
