package com.example.demo.Test;

public class Distinct {
    public static void main(String[] args) {
        String str = "aaabbbaaabbbbcccbdddd";
        System.out.println(disRepeat(str));
    }

    public static StringBuffer disRepeat(String str) {
        StringBuffer flag = new StringBuffer("");
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                flag.append(str.charAt(i));
            }
        }
        flag.append(str.charAt(str.length()-1));
        return flag;
    }
}
