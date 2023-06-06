import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Cú pháp if... else
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào 1 số nguyên dương");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 2 == 0) {
            System.out.printf("\u001B[32mSố %d là số chẵn !", number);
        } else {
            System.out.printf("\u001B[32mSố %d là số lẻ !", number);
        }
        // if else lồng nhau
        // năm nhuận là năm chia hết cho 4
        if (number % 4 == 0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("là năm nhuận");
                } else {
                    System.out.println("không phải năm nhuận");
                }
            } else {
                System.out.println("là  năm nhuận");
            }
        } else {
            System.out.println("không phải năm nhuận");
        }

        // switch ... case
        switch (number) {
            case 0:
                System.out.println("Số Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số chín");
                break;
            default:
                System.out.println("No supported");

        }


            // viết 1 chương trình cho phép nhập vào 3 cạnh của 1 tam giac , kiểm tra xem tam giác đó thuộc loại nào : ko hợp lệ, tam giác vuông, tam giác cân, tam giác đều,
            // nếu là tam giác thì tính chu vi và diện tích của tam giác đó,  diện tích tính theo công thức heron
    }
}