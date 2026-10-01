class A{
    int i;
}
class B extends A{
    int i;
    B(int x){
        i=x;
        super.i=x+10;
    }
    void Show(){
        System.out.println(super.i+""+i);
    }
}
class Test {
    public static void main(String[] args) {
        B obj = new B(5);
        obj.Show();
    }
}