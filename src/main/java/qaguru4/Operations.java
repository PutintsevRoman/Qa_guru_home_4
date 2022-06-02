package qaguru4;

import static java.lang.Boolean.TRUE;

public class Operations {

    public static void main(String[] args){

        //Types
        boolean b  = TRUE;
        byte    by = 127;
        short   sh = 50;
        int     i  = -100;
        long    l  = 200;
        float   f = 5.2f;
        Double  d = 2. ;
        char a ='g';

        //Examples
        System.out.println("Examples");
        System.out.println("Char g = " + ( a + 1 - 1));
        System.out.println("boolean = " + !b );
        System.out.println("byte by = " + ( by + 128));
        System.out.println("short sh = " + ( sh / 2 * 5 % 3 ));
        System.out.println("int i = " + ( i * 2 * 5 * (-1)));
        System.out.println("long l = " + ( l * l * l - 132));
        System.out.println("float f = " + (f + 5.f - 2.f *0.1f));
        System.out.println("Double f = " + (f * 5. - 1. * 7.));

        //Combo-wombo types
        System.out.println("Combo-wombo");
        System.out.println(f+by+sh-l/f);

        //Some if staff
        System.out.println("IF staff");
        if(b && by>1)
            System.out.println("&&");

        if(!b || i<-11)
            System.out.println("||");

        int Max = Integer.MAX_VALUE;
        int Min = Integer.MIN_VALUE;

        //owerflow
        if (Max + 1 == Min)
            System.out.println("THIS IS OWERFLOW MIRACLE");




    }
}
