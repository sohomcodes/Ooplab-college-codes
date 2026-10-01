class SingleTone {

    private static SingleTone stn;

    private SingleTone() {
        System.out.println("SingleTone obj is created");
    }

    public static SingleTone getInstance() {
        if (stn == null) {
            stn = new SingleTone();
        }
        return stn;
    }
}

class Testing {
    public static void main(String[] args) {

        SingleTone obj1 = SingleTone.getInstance();
        SingleTone obj2 = SingleTone.getInstance();
        SingleTone obj3 = SingleTone.getInstance();
        System.out.println(obj1==obj2);
    }
}