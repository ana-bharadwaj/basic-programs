public class ReverseInt {
    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        System.out.println("The reverse of 1234 is: " + reverseInt.reverse(1234));
        System.out.println("The reverse of 1234 is: " + reverseInt.reverse(9877));
    }

    public int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int remain = num % 10;
            num = num / 10;
            rev = ((rev * 10) + remain);
        }
        return rev;
    }
}
