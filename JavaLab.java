class A{
    private int a;
    private int b;
    protected int c;
    protected int d;
    public int e;
    public int f;
    A(){
        System.out.println("Inside DEFAULT Constructor A");
    }
    A(int n){
        this.a=n;
        System.out.println("Inside PARAMETRISED constructor A");
        System.out.println("a="+a);
    }
    public void show(){
        System.out.println("Inside class A");
    }
    
}

class B extends A{
    B(){
        System.out.println("Inside DEFAULT Constructor B");
    }
    public void show(){
        System.out.println("Inside class B");
    }
    B(int m){
        super.d = m;
        System.out.println("d="+d);
    }
}

class C extends B{
    C(){
        System.out.println("Inside DEFAULT Constructor C");
    }
    public void show(){
        System.out.println("Inside class C");
    }
}

class D extends B{
    D(){
        System.out.println("Inside DEFAULT Constructor D");
    }
    public void show(){
        System.out.println("Inside class D");
    }
}

public class JavaLab{
    public static void main(String[] args){
    //ORIGINAL CODE
    //   A obja1 = new A();
    //  A obja2 = new A(5);
    //   B objb1 = new B();
    //  B objb2 = new B(7);
      //  C objc1 = new C();
      //  D objd1 = new D();
      //  obja1.show();
      //  obja2.show();
      //  objb1.show();
      //  objc1.show();
      //  objd1.show()

    //MODIFICATION
      showmethods();
    }
   
    public static void showmethods(){
        A obja1 = new A();
        A obja2 = new A(5);
        B objb2 = new B(7);
        System.out.println("Super keyword used!");
        obja1.show();
        objb2.show();
        System.out.println("Method overriding done!");

    }
    
}











