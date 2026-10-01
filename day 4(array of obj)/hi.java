class A{
    public A() {
        System.out.println("const-A-1");
    }
    public A(int x) {
        System.out.println("const-A-2");
    }
    public A(int x,int y) {
        System.out.println("const-A-3");
    }
}
class B extends A{
     public B() {
        System.out.println("const-B-1");
    }
    public B(int x) {
        System.out.println("const-B-2");
    }
}