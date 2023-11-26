import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sô a: ");
        int number1= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập sso b: ");
        int number2=Integer.parseInt(sc.nextLine());
        System.out.println("Chọn phép toán số học: ");
        String luaChon=sc.nextLine();
        switch(luaChon){
            case "cong":
                int tong=number1+number2;
                System.out.println("Tổng 2 số: "+tong);
                break;
            case "tru":
                int hieu=number1-number2;
                System.out.println("Hiệu 2 số: "+hieu);
                break;
            case "nhan":
                int tich=number1*number2;
                System.out.println("Tích 2 số: "+tich);
                break;
            case "chia":
                int thuong;
                int number3=0;
                if(number2==0){
                    System.out.println("Số bị chia ==0 nhập lại: ");
                     number3=Integer.parseInt(sc.nextLine());
                }
                thuong=number1/number3;
                System.out.println("Thương: "+thuong);
                break;
        }
    }
}
