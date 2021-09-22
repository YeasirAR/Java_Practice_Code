package AOOP.Lab9;

class MyArrayList<T> {
    int count = 0;
    T[] array;

    MyArrayList(int maxSize){
        array = (T[]) new Object[maxSize];
    }

    T get(int index){
        if(index >= 0 && index < count) return array[index];
        return null;
    }

    void addLast(T obj)throws ArrayIndexOutOfBoundsException{
        if(count < array.length) {
            array[count] = obj;
            count++;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }

    T removeLast(){
        if(count == 0) return null;
        else {
            T ret = array[count-1];
            count--;
            return  ret;
        }
    }
    void insertFirst(T obj) {
        if(count < array.length){
//            for(int i=count-1; i>=0; i--){
//                array[i+1] = array[i];
//            }
            if (count - 1 + 1 >= 0) {
                System.arraycopy(array, 0, array, 1, count - 1 + 1);
            }
        }
        count++;
        array[0] = obj;
    }
    T removeFirst(){
        T ret = array[0];
        if(count < array.length){
            if (count - 1 + 1 >= 0) {
                System.arraycopy(array, 1, array, 0, count - 1 + 1);
            }
        }
        count--;
        return ret;
    }
}

class Main2{
    public static void main(String[] args) {
        MyArrayList<Double> list = new MyArrayList<>(10);

        list.addLast(10.55);
        list.addLast(12.55);
        list.insertFirst(5.0);
        list.removeFirst();

//        list.removeLast();

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}

