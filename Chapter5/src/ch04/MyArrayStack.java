package ch04;

import ch02.MyArray;

public class MyArrayStack {

    int top;
    MyArray arrayStack;

    public MyArrayStack(){
    top = 0;
    arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if(isFull()){
            System.out.println("error");
            return;
        }
        arrayStack.addElement(data);
        top++;

    }


    public int pop(){
        if(arrayStack.isEmpty()){
            System.out.println("error");

        }
        arrayStack.removeElement(--top);

        return top;
    }

    public int peek(){

        return top;
    }

    public int getSize(){
    return top;
    }

    public boolean isFull(){
        if(top == arrayStack.ARRAY_SIZE) {

            return true;
        }
        else return false;
    }

    public boolean isEmpty(){
        if(top==0) {
            return true;
        }
     return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
