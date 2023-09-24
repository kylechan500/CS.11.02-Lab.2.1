import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class Main {

    public static void main(String[] args) {
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        int x = add(a,b);
        int y = add(c,d);
        return x + y;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String nameTwo){
        return "下午好, " + nameTwo + "!";
    }
    // 5. triple
    public static String triple(String word){
        return word + word + word;
    }
    // 6. half
    public static double half(double a){
        return a/2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) Math.round(a);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double b){
        return -1*(int) Math.round(b*-1);
    }

}
