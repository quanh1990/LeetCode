package Offer;

public class OFFER_004_ReplaceBlanks {

    public static void main(String[] args) {

        String str = "Hello  My name is Alex! ";
        System.out.println(ReplaceBlanks(str));
    }

    public static String ReplaceBlanks(String str) {

        // 字符串中的空格全部用 %20 替换

        if(str == null || str.length() == 0) return "";

        String res = "";

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' ') {
                res += "%20";
            } else {
                res += str.charAt(i);
            }
        }

        return res;
    }
}
