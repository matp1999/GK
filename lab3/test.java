package lab3;

import java.awt.*;

public class test {
    public static void main (String[] args){
        for(int i=0;i<9;i++)
        {
            System.out.println((int)(100 * Math.cos((Math.PI/2 + 2*Math.PI*i) /9)));
                   System.out.println((int)(100 * Math.sin((Math.PI/2 + 2*Math.PI*i) /9)));
        }
    }
}
