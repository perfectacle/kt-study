package ch01;

class Super {
    int a = 1;


    Super(int a) {
        this.a = a;
    }
}

class Sub extends Super {
    private Sub() {
        super(2);
    }

    public static void main(String[] args) {
        System.out.println(new Sub().a);
    }
}
