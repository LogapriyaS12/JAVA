import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int sold,buy,profit;
        sold= a*b;
        buy= 100+(a*c);
        profit = sold-buy;
        System.out.print(""+profit);
        
    }
}
