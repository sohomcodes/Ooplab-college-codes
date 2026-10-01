class A{
    public int i;
}
class B extends B{
    public int i;

}
class C extends B{
    public int i;
    C(int x){
        super.super.i=x;
        super.i=x+10;
        i=x;

    }
    void show{
        System.out.println( super.super.i +""+ super.i+""+i);
    }
}