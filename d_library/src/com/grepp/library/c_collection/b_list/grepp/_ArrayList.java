package com.grepp.library.c_collection.b_list.grepp;


import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class _ArrayList <E> implements _List<E>{

    private Object[] elementData;
    private static final int DEFAULT_CAPACITY = 10;
    private int pointer;
    private int arraySize;

    public _ArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
        arraySize = 10;
    }

    public boolean add(E e){

        if(pointer < arraySize){
            elementData[pointer] = e;
            pointer++;
            return true;
        }

        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }

        temp[pointer] = e;
        elementData = temp;
        pointer++;
        return true;
    }
    public E get(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        return (E) elementData[index];
    }

    public int size(){
        return pointer;
    }

    //////////////////////////////////////////////
    public E remove(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");

        E delete = (E) elementData[index];

        Object[] temp = new Object[arraySize];

        int j = 0;
        for (int i = 0; i < pointer - 1; i++) {
            if(j == index) j++;
            temp[i] = elementData[j];
            j++;
        }
        pointer--;
        elementData = temp;

        return delete;
    }

    public void add(int index, E e){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        if(pointer >= arraySize){
            arraySize *= 2;
            Object[] thing = new Object[arraySize];
            for (int i = 0; i < pointer; i++) {
                thing[i] = elementData[i];

            }
            elementData = thing;
        }

        Object[] temp = new Object[pointer];

        for (int i = 0; i < pointer - index; i++) {
            temp[i] = elementData[index + i];
        }
        elementData[index] = e;
        for (int i = 0; i < pointer - index; i++) {
            elementData[index + 1 + i] = temp[i];
        }
        pointer++;

    }

    public E set(int index, E d){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        elementData[index] = d;
        return (E)elementData;
    }


    //////////////////////////////////////////////////////
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int pointer;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            public E next() {
                if(pointer >= size()) throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }
}
