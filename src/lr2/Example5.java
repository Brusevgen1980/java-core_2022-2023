package lr2;
import java.awt.*;
import java.util.Scanner;

import static java.lang.System.*;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int x = a / 1000;
        out.println(x%10);
    }
}
