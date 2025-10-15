import java.util.*;


public class Conditions {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            switch(button) {
                case 1 : System.out.println("Hello");
                break;
                case 2 : System.out.println("namaste");
                break;
                case 3 : System.out.println("vaddakam");
                break;
                case 4 : System.out.println("pai lagu");
                break;
                default : System.out.println("invalid button");
            }
        }
        
    }
}



    

