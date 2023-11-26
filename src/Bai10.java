import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        float wage = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập số ngày lương:  ");
        int days=Integer.parseInt(sc.nextLine());
        float oneMoneyDay=(float) wage/26;
        System.out.println("Lương 1 ngày: "+oneMoneyDay);
        float money;
        if(days>26)
        {
            int soNgayDu=days-26;
            float bonus=(float)(soNgayDu* (oneMoneyDay*1.5));
            System.out.println("Số thiền thưởng: "+bonus);
             money=wage*(days/26)+bonus;
        }
       else
        {
            money=wage*(days/26);
        }
        System.out.println(money);

    }
}
