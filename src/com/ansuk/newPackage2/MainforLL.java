package com.ansuk.newPackage2;

public class MainforLL
{
    public static void main(String[] args) {
        SingleLL ob = new SingleLL();
        ob.insertBeginning(10);
        ob.insertBeginning(20);
        ob.insertBeginning(30);
        ob.insertBeginning(40);
        ob.insertBeginning(50);
        ob.insertEnd(200);
        ob.insertEnd(201);
        ob.insertEnd(202);
        ob.insertEnd(203);
        ob.display();
        ob.insertAt(99,2);
        ob.display();
        System.out.println(ob.size);
    }
}
