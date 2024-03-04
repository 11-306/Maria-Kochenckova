package FIFO;

public interface Collection {
    void add(int el); //добавление в очередь

    Integer peek();
    //возвращает элемент из головы очереди.
    // Элемент не удаляется.

    Integer pool();
    //возвращает элемент из головы очереди и удаляет его.

    void remove();

    boolean isEmpty();

    void print();
}
