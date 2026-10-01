class SingleTone {

    private static SingleTone stn;
    private int val;

    private SingleTone(int v) {
        val = v;
        System.out.println("SingleTone obj is created " + val);
    }

    public static SingleTone getInstance(int x) {
        if (stn == null) {
            stn = new SingleTone(x);
        }
        return stn;
    }
}

class Testing {
    public static void main(String[] args) {

        SingleTone obj1 = SingleTone.getInstance(55);
        SingleTone obj2 = SingleTone.getInstance(66);
        SingleTone obj3 = SingleTone.getInstance(77);

        System.out.println(obj1 == obj2);
    }
}