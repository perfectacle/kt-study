package ch01;

import java.util.ArrayList;

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

        final ArrayList<Object> objects = new ArrayList<>();
        objects.add(null);
        objects.add(null);
        objects.add(null);
        objects.add(null);
        objects.add(null);

        System.out.println();
    }
}
