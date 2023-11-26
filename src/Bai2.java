import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 điểm: ");
        float html=Float.parseFloat(sc.nextLine());
        float css=Float.parseFloat(sc.nextLine());
        float javascrip=Float.parseFloat(sc.nextLine());
        float avgMark=(html+css+javascrip)/3;
        if(0<=avgMark && avgMark<5){
            System.out.println("Xếp Loại Yếu");
        }
        else if (5<=avgMark && avgMark<7)
        {
            System.out.println("Xếp loại Trung Bình");
        } else if (7<=avgMark && avgMark<8) {
            System.out.println("Xếp loại Khá");
        } else if (8<=avgMark && avgMark<9) {
            System.out.println("Xếp loại giỏi");
        }
        else {
            System.out.println("Xếp loại xuất sắc");
        }
    }

}
