public class Sqrt {
    public static int mySqrt(int x) {
        // return (int)Math.pow(x,0.5);
        int sqrt = 0;
        for (int i = 0; i < x / 2; i++) {
            if (i * i == x)
                sqrt = i;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(65));
    }
}
