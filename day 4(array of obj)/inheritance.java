class A {

    int i, j;

    void showA() {
        System.out.println("value " + i + " " + j);
    }
}

class B extends A {

    int k;

    void Add() {
        System.out.println("sum " + (i + j + k));
    }
}

class Test {

    public static void main(String[] args) {

        B obj1 = new B();

        obj1.i = 10;
        obj1.j = 20;
        obj1.k = 30;

        obj1.showA();
        obj1.Add();
    }
}