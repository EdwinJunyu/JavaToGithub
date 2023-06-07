package JavaSE.数据结构;

public class 顺序表<E> {
    private int size = 0;
    private  int capacity = 10;

    private Object[] array = new Object[capacity];

    public void add(E element, int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法地插入为：0～ " + size);
        if (size >= capacity){
            int newCapacity = capacity * 2;
            Object[] newArray = new  Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            capacity = newCapacity;
        }
        for(int i = size; i> index; i--)
            array[i] = array[i - 1];
        array[index] = element;
        size++;
        }

    @SuppressWarnings("unchecked")
    public E remove(int index){
        if(index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ " +(size - 1));
        E e = (E) array[index];
        for (int i = index; i < size; i++)
            array[i] = array[i + 1];
        size--;
        return e;
    }


    public static void main(String[] args) {
        
    }

}
