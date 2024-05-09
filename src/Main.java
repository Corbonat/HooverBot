public class Main {
    public static void main(String[] args) {
        System.out.println(WashedRectangle.get(10, 1, 1, 1, 1));
        double sum = 700000;
        double x = 158023.3327;
        for (int i = 0; i < 5; i++) {
            sum *= 1.19;
            System.out.println(sum);
            sum -= x;
            System.out.println(sum);
        }
        for (int i = 0; i < 5; i++) {
            sum *= 1.16;
            System.out.println(sum);
            sum -= x;
            System.out.println(sum);
        }
        System.out.println((158023.33274817516 - x));
    }
}