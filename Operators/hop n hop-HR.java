import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 =3,y1=4;
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int diff1=(x2-x1)*(x2-x1);
        int diff2=(y2-y1)*(y2-y1);
        int dis =diff1+diff2;
        System.out.println((int)Math.sqrt(dis));
        
        
        
        
    }
}
