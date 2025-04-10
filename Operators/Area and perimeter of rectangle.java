import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int breadth = sc.nextInt();
        int area,perimeter;
        area = len*breadth;
        perimeter = 2 * (len+breadth);
        System.out.println("The required length is " + perimeter + " m");
        System.out.println("The required area of carpet is " + area + " sqm"); 
    }
}
