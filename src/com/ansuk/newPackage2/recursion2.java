package com.ansuk.newPackage2;

public class recursion2 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,10,25,29};
        System.out.println(sorted(arr,0));
        System.out.println(search(arr, 1, 0));;
    }
    public static boolean sorted(int[] a, int idx){
        if(idx == a.length-1)return true;
        else return a[idx]<=a[idx+1] && sorted(a,++idx);
    }

    public static boolean search(int[] a, int key, int idx){
        if(idx == a.length-1)return false;
        else return a[idx]== key || search(a,key,++idx);
    }
}
