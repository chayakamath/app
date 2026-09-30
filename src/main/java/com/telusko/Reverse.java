package com.telusko;

public class Reverse {

    public String rev(String str){
        int i=0,j=str.length()-1;
        char[] a = str.toCharArray();
        while(i<j){
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        return new String(a);
    }
}
