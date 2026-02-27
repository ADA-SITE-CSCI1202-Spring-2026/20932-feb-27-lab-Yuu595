public class exercise7 {

    public static void main(String[] args) {
        MathDemo math = new MathDemo();

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Min: " + math.min(5, 3));
        System.out.println("Max: " + math.max(5, 3));
        System.out.println("Sum: " + math.sum(numbers));
        System.out.println("Mean: " + math.mean(numbers));
        System.out.println("Factorial: " + math.factorial(5));
    }
}

class MathDemo {

    public int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public float mean(int[] args) {
        return (float) sum(args) / args.length;
    }

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}