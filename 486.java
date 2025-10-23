
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long se = 0, so = 0;
        long n = sc.nextLong();
 
        if (n % 2 == 0) {
            se = (n / 2) * (n / 2 + 1);
            so = (n / 2) * (n / 2);
        } else {
            se = (n / 2) * (n / 2 + 1);
            so = ((n + 1) / 2) * ((n + 1) / 2);
        }
 
        System.out.println(se - so);
    }
}