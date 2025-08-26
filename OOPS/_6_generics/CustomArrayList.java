package OOPS._6_generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()) resize();

        data[size++]=num; 
    }

    private boolean isFull(){
         return size==data.length;
    }

    private void resize(){
        int[] temp=new int[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    public void remove(){
        size--;  
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        data[index] = element;
    }

    private boolean isEmpty() {
        return size == 0;
    }


    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(56);
        list.remove();
        list.add(56777);
        list.set(0, 30303993);
        list.add(6);
        list.add(12);
        list.size();
        list.isEmpty();
        System.out.println("List: " + java.util.Arrays.toString(java.util.Arrays.copyOf(list.data, list.size())));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty());
    }

    
}
