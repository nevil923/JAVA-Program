public class KL {

    void sum(int a, int b) {
        System.out.println("Sum of two integer: " + (a + b));
    }

    void sum(double a, double b) {
        System.out.println("Sum of two double: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum of Three integer: " + (a + b + c));
    }

    public static void main(String[] args) {

        KL obj = new KL();

        obj.sum(10, 20);
        obj.sum(10.5, 20.5);
        obj.sum(10, 20, 30);
    }
}
