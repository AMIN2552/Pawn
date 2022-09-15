import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt(); // 5
        int y1 = sc.nextInt(); // 5
        int x2 = sc.nextInt(); // 2
        int y2 = sc.nextInt(); // 4


        if (x1 == x2 && (y1 == 2 && y2 - y1 <= 2 || y1 > 2 && y2 - y1 == 1))
        {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}