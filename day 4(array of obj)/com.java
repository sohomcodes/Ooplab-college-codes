class A{
    void show(){
        System.out.println("AGEMC");
    }
}
class B extends A{
    void show(){
        System.out.println("CSE-AI");
    }
}
class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}