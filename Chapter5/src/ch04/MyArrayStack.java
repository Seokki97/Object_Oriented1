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
        if(top>=arrayStack.ARRAY_SIZE){
            System.out.println("error");
        }
        arrayStack.insertElement(top,data);
        top++;

    }


    public int pop(){
        if(arrayStack.isEmpty()){
            System.out.println("error");

        }
        arrayStack.removeElement(top);
        top--;
        return top;
    }

    public int peek(){

        return top;
    }

    public int getSize(){
    return arrayStack.getSize();
    }

    public boolean isFull(){
        System.out.println("isFull Error");
    return true;
    }

    public boolean isEmpty(){
        if(arrayStack.ARRAY_SIZE ==0 || top==0) {
            System.out.println("isEmpty error");
        }
     return true;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
