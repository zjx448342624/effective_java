package com.zjx.second.six;

public class Demo {

    public static void main(String[] args) {
        sum();
    }

    public static void sum(){
//        Long sum = 0L;
        long sum = 0L;
        long begion = System.currentTimeMillis();
        for(int i = 0; i < Integer.MAX_VALUE;i++){
            sum += i;
        }
        System.out.println(System.currentTimeMillis()-begion);
        System.out.println(sum);
    }

}
