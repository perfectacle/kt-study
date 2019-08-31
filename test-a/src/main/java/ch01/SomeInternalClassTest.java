package ch01;

public class SomeInternalClassTest {
    private int a = 1;
    private int b = 1;

    class Internal {
        private int a = 1;

        void c() {
            System.out.println(a);
            System.out.println(this.a);

            System.out.println(SomeInternalClassTest.this.a);

            System.out.println(b);
        }
    }
}
