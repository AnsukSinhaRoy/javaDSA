package com.ansuk.newPackage2;

public class SingleLL {

    public SingleLL(){
        this.size =0;
    }
    Node head;
    Node tail;

    int size;

    public class Node
    {
        private int val;
        private Node next;

        Node(int val){
            this.val = val;
        }
        Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }

    }
    public void insertBeginning(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) tail = head;

        size++;
    }

    public void display()
    {
        Node temp = head;
        while (temp!= null)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }

    public void insertEnd(int val)
    {
        Node newNode = new Node(val);
        tail.next= newNode;
        tail=newNode;
        size++;
    }

    public void insertAt(int val, int index){
        index--;

        Node temp=head;
        while(index>0){
            temp = head.next;
            index--;
        }
        Node newNode = new Node(val,temp.next );
        temp.next = newNode;
        size++;
    }

}
