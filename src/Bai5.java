import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        float number1=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh b: ");
        float number2=Integer.parseInt(sc.nextLine());
        System.out.println("Nhập cạnh c: ");
        float number3=Integer.parseInt(sc.nextLine());
        if(number1==number2 && number1==number3 && number2==number3)
        {
            System.out.println("Là tam giác đều"); 
        }
      else   if(number1==number2)
        {
            System.out.println("Là tam giác cân");
        } else if (Math.pow(number1,2)+Math.pow(number2,2)==Math.pow(number3,2)) {
            System.out.println("Là tam giác vuông");
        } else {
            System.out.println("là tam giác thường");
        }
    }
}
