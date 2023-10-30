package lab3.ex2b;

import lab3.ex2a.C1;
import lab3.ex2a.*;
public class C2 extends C1 {
    public void m1() {
        System.out.print("4");
        m2();
        m3();
    }
    protected void m2() {
        System.out.print("5");
    }
    private void m3() {
        System.out.print("6");
    }
}