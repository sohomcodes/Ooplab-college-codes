class Student {

    private String Name;
    private int Roll;

    public Student(String s, int r) {
        Name = s;
        Roll = r;
        System.out.println("Const.call");
    }

    void Show() {
        System.out.println(Name + " " + Roll);
    }
}

class Test {
    public static void main(String[] args) {

        Student[] std = new Student[3];

        std[0] = new Student("AAA", 10);
        std[1] = new Student("BBB", 11);
        std[2] = new Student("CCC", 12);

        std[0].Show();
        std[1].Show();
        std[2].Show();
    }
}