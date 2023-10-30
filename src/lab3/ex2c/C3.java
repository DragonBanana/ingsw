package lab3.ex2c;

import lab3.ex2a.C1;
import lab3.ex2b.C2;

public class C3 {
    public static void main(String[] s) {
        C1 c1; C2 c2; Object o;
        c1 = new C1();		/* 1*/
        c1.m1();			/* 2*/
        c2 = new C2();		/* 3*/
//        c2.m2();			/* 4*/
        c1 = c2; 			/* 5*/
        c1.m1(); 			/* 6*/
//        c2 = new C1(); 		/* 7*/
        o = new C1(); 		/* 8*/
//        c2 = (C2) o; 			/* 9*/
        o = new C2(); 		/*10*/
        // var o
        // Tipo statico object
        // Tipo dinamico C2
        c1 = (C1) o; 			/*11*/
        // var c1
        // Tipo statico C1
        // Tipo dinamico C2
        c1.m1(); 			/*12*/
    }
}


