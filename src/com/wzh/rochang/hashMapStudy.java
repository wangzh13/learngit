package com.wzh.rochang;


public class hashMapStudy {

    public static void main(String[] args) {
       String wareId = "11_1";
        String str1=wareId.substring(0, wareId.indexOf("_"));
        String str2=wareId.substring(str1.length()+1, wareId.length());
        System.out.println(str1);
        System.out.println(str2);
    }
}
