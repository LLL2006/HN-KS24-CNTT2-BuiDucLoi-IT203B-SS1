package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCheckedException ex = new MyCheckedException("Gà");
        MyUncheckedException un = new MyUncheckedException("Thức khuya, Lọ muộn");
        Exception e = new Exception();

        int in = inputInteger();
        System.out.println(in);
    }

    public static int inputInteger() {
        Scanner sc = new Scanner(System.in);

        // ha nhập đến khi nào thỏa mãn là 1 số nguyên duương thì trả ve
        while (true) {
            try{
                // khối code sinh ra ngoại lệ
                System.out.println("Nhập 1 số nguyên");
                int a = sc.nextInt();

                if (a <= 0) {
                    System.out.println("Ko nhạp 0 hoặc số aam");
                    continue;
                }
                return a;
            } catch (NumberFormatException ex){ // tên ngoại lệ muốn bắt
                // logic xử lý ngoại lệ
//                System.out.println("Bạn phải nhập 1 số nguyên");
                ex.printStackTrace();
            } finally {
                // luôn chạy sau khi xử lsy
                System.out.println("Kết thúc xử lý");
//                sc.close();
            }
        }

    }
}
