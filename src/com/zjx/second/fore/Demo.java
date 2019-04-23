package com.zjx.second.fore;

public class Demo {

    public static void main(String[] args) {
        Test t = new Test2();
        t.toAAA();
        t.test();
    }

}

abstract class Test{

    public abstract void test();

    public void toAAA(){
        System.out.println("aaa");
    }

}

class Test2 extends Test{

    @Override
    public void test() {
        System.out.println("test");
    }
}
