public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtil.clamp(5, 1, 10));
        System.out.println(MathUtil.clamp(-3, 0, 8));
        System.out.println(MathUtil.clamp(12, 0, 10));
        System.out.println(MathUtil.clamp(7, 7, 7));
    }
}
