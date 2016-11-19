/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Cuong
 */
public class StackOfIntegers {
    private int[] elements;
    
    private int size;
    
    private int capacity;
    
    public StackOfIntegers() {
        capacity = 16;
        elements = new int[16];
        size = 0;
    }
    
    public StackOfIntegers( int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        size = 0;
    }
    
    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(size == capacity) {
            return true;
        }
        return false;
    }
    
    public int peak() {
        return elements[size - 1];
    }
    
    public void push( int value) {
        elements[size] = value;
        size++;
    }
    
    public int pop() {
        int tmp = elements[size - 1];
        size--;
        return tmp;
    }

    public int getSize() {
        return size;
    }
    
    
}
