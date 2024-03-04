package FIFO;

public class Main {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.add(10);
        q.add(12);
        q.add(24);
        q.add(53);
        q.add(546);
        q.add(241);
        q.add(-79);
        q.add(78);


        q.peek();

        q.remove();
        q.remove();
        q.print();

        System.out.println("top " + q.pool());

    }
}