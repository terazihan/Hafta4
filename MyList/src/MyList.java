import java.util.Arrays;

public class MyList<T> {
    private int size;
    private int capacity;
    private T[] array;

    // Boş constructor
    public MyList() {
        this.capacity = 10; // varsayılan kapasite
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    // Kapasite belirtilen constructor
    public MyList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    // Dizideki eleman sayısını verir
    public int size() {
        return size;
    }

    // Dizinin kapasite değerini verir
    public int getCapacity() {
        return capacity;
    }

    // Sınıfa ait diziye eleman eklemek için kullanılmalıdır
    public void add(T data) {
        if (size == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
        array[size++] = data;
    }

    // Verilen indisteki değeri döndürür
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indis: " + index);
        }
        return array[index];
    }

    // Verilen indisteki veriyi silmeli ve silinen indis sonrasında ki verileri sol doğru kaydırmalı
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indis: " + index);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    // Verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indis: " + index);
        }
        array[index] = data;
    }

    // Sınıfa ait dizideki elemanları listeleyen bir metot
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
