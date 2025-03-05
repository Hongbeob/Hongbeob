package JavaInput;

import java.util.Scanner;

public class ScannerWithGuide2 {
    public void printWithScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요.");
        System.out.print("첫 번째 숫자: ");
        System.out.println("첫 번째 숫자: "+ sc.nextLine());
        System.out.print("두 번째 숫자: ");
        System.out.println("두 번째 숫자: " + sc.nextLine());
    }
}
