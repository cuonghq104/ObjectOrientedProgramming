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
public class StackOfChars {
    private char[] elements;
    
    private int size;
    
    
    public StackOfChars() {
        elements = new char[16];
        size = 0;
    }
    
    public StackOfChars( int capacity) {
        elements = new char[capacity];
        size = 0;
    }
    
    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(size == elements.length) {
            return true;
        }
        return false;
    }
    
    public char peak() {
        return elements[size - 1];
    }
    
    public void push( char ch) {
        elements[size] = ch;
        size++;
    }
    
    public char pop() {
        char tmp = elements[size - 1];
        size--;
        return tmp;
    }

    public int getSize() {
        return size;
    }
}
