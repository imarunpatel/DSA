package programs;

public class BinaryToDecimal {
    public static void main(String[] args) {
        findDecimal("1001");
    }

    static void findDecimal(String number) {
        int numb = 0;

        for(int i=0; i<number.length(); i++) {
            char ch = number.charAt(number.length()-1-i);
            numb = numb + Character.getNumericValue(ch) * (2 ^ i);
            System.out.println(numb);
        }

        System.out.println(numb);
    }
}
