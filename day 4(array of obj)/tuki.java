class A {

    protected int ax;

    public A(int x) {
        ax = x;
        System.out.println("const-A");
    }

    public static void main(String[] args) {
        System.out.println("const-A-2");
    }
}

class B extends A {

    protected int bx;

    public B(int x) {
        super(x);
        bx = x;
        System.out.println("const-B");
    }
}

class Test {

    public static void main(String[] args) {

        B obj = new B(5);
    }
}