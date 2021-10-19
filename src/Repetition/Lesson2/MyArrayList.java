package Repetition.Lesson2;

public class MyArrayList<E> implements ArrayList<E> {
    private final int SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[SIZE];
    private int pointer = 0;

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public void add(E item) {
        if(pointer == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = item;
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public void remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        if (array.length > SIZE && pointer < array.length / CUT_RATE) {
            resize(array.length / 2);
        }
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void display() {
        System.out.println(this);
    }
}
