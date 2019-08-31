package ch01;

public class SomeJavaClass2 {
    public static void main(String[] args) {
        new SomeDefaultClass();

        System.out.println(new SomeProtectedClass().protectedHi);
    }
}
