import java.util.*;

public class Ifelse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            if(a == 1) {
                System.out.println("hello");
            }else if(a == 2) {
                System.out.println("namaste");
            }else if(a == 3) {
                System.out.println("vaddakam");
            }else if(a == 4) {
                System.out.println("sat Shriakaal");
            }else {
                System.out.println("invalid");
            }
        }
    }
    
}