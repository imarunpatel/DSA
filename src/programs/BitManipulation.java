package programs;

public class BitManipulation {

//    Write a Java program to count the number of bits set to 1 (set bits) of an integer
    static int countBits(int num) {
        int count = 0;
        while(num > 0) {
            num = num & num-1;
            count++;
        }
        return count;
    }

//    Write a program that takes 3 integers and uses the lowest number of flips to make the sum of the first two numbers equal to the third. The program will return the number of flips required.
private static int numberOfFlip(int a, int b, int c) {
    int ans = 0;
    for (int i = 0; i < 32; i++) {
        int bitC = ((c >> i) & 1);
        int bitA = ((a >> i) & 1);
        int bitB = ((b >> i) & 1);

        if ((bitA | bitB) != bitC) {
            ans += (bitC == 0) ? (bitA == 1 && bitB == 1) ? 2 : 1 : 1;
        }
    }
    return ans;
}

    //    Find the element in an array that is not repeated.
    private static int singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }


    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("zero");
        } else {
            System.out.println("one");
        }
    }
}
