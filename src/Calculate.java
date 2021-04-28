class Calculate {
    public static void main(String[] args) {
        // Instantiate a new object
        Calculate calculate = new Calculate();
        // We add 2 nums
        int sum = calculate.add(1, 2);
        System.out.println("Sum = "+ sum);

        // diff 2 nums
        int diff = calculate.subtract(3, 1);
        System.out.println("Sum = "+ diff);

        // multiply 2 nums
        int prod = calculate.multiply(3, 2);
        System.out.println("Sum = "+ prod);
    }

    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public int subtract(int a, int b) {
        int diff = a-b;
        return diff;
    }

    public int multiply(int a, int b){
        int prod = a*b;
        return prod;
    }
}