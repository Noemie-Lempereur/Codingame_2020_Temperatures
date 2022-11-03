import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.Math;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int tmin=0;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if(i==0){
                tmin=t;
            }
            else{
                if(Math.abs(tmin)==Math.abs(t)){
                    if(tmin!=t){
                        tmin=Math.abs(t);
                    }
                }
                if(Math.abs(tmin)>Math.abs(t)){
                    tmin=t;
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(tmin);
    }
}
