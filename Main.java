import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap vao ho va ten cua ban: ");
        String hoTen = scanner.nextLine();
        
        System.out.println("Xin chao: " + hoTen);
        
        scanner.close();
    }
}