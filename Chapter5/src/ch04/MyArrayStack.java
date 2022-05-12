package ch04;

import ch02.MyArray;

public class MyArrayStack {

    int top;
    MyArray arrayStack;

    public MyArrayStack(){
    top = 0;
    this.arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        arrayStack = new MyArray(size);
    }

    public void push(int data){

    }

    public int pop(){

    }

    public int peek(){

    }

    public int getSize(){

    }

    public boolean isFull(){

    }

    public boolean isEmpty(){

    }

    public void printAll(){
        arrayStack.printAll();
    }
}
