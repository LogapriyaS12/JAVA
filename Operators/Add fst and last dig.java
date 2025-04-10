import java.io.*;
import java.util.*;
public class Solution {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b,sum;
        a = n %10;
        b= n/1000;
        sum = a+b;
        System.out.println(sum +" ");   
    }
}
