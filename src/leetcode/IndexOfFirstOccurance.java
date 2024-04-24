package leetcode;

public class IndexOfFirstOccurance {
    public static void main(String args[]) {
        String str1 = "spadhigsad";
        String str2 = "sad";
        System.out.print(findIndex(str1, str2));
    }

    static int findIndex(String haystack, String needle) {
        int needleLength = needle.length();
        for(int i=0; i<=haystack.length()-needle.length(); i++) {
            if(haystack.substring(i, needleLength+i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
