public class HashSet<T> {


    private int capacity;
    private Object[] elements;
    private int size;
    public HashSet(int capacity){
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }
    public boolean add(T element){
        int index = getElementIndex(element);
        if(elements[index] != null){
            return false;
        }else{
            elements[index] = element;
            size++;
            return true;

        }
    }

    public boolean remove(T element){
        int index = getElementIndex(element);
            if(elements[index] != null && elements[index].equals(element)){
                elements[index] = null;
                size--;
                return true;
            }else{
                return false;
            }
        }



    public boolean contains(T element){
        int index = getElementIndex(element);
        return elements[index] != null && elements[index].equals(element);


    }

    private int getElementIndex(T element){
        int hash = element.hashCode() % capacity;
        return (hash < 0 ? hash + capacity : hash);

    }




}
