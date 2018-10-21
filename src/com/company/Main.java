package com.company;
//Task 1
class Main {
    public static int n=0;
    public static void main(String[] args) {
        fclass3 f3=new fclass3();
        fclass2 f2=new fclass2();
        f2.method1();
        f3.method2();
    }
}
class fclass2 extends fclass3{
    public void method1(){
        m=5;
        System.out.println(m);
    }
}
class fclass3 extends Main{
    public static int m;
    public void method2(){
        n=20;
        System.out.println(n);
    }
}
//////////////////////////////////
//Task2
/*class Main {
    protected int x=5;
    public static void main(String[] args) {
        fclass2 f=new fclass2();
        System.out.print(f.method());
    }
    }
    class fclass2 extends Main{
    public int method(){
        int y;
        int z=2;
        y=x+z;
        return y;
    }
    }*/
/////////////////////
//OR TASK 2
///////////////////
/*class Main {
    private int variable=5;
    public void setVariable(int vub)
    {
        this.variable = vub;
    }
    public int getVariable()
    {
        return this.variable;
    }
    public static void main(String[] args) {
        fclass2 f=new fclass2();
        System.out.print(f.method());
    }
}
class fclass2 extends Main{
    public int method(){
        Main m=new Main();
        int x=m.getVariable();
        return x;
    }
}*/