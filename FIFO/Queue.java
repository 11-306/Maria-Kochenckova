package FIFO;

public  class  Queue implements Collection{
    private int top;
    private int capacity = 100;
    private int[] a;
    private int end;
    private int size;

    Queue() {
        this.a = new int[capacity];;
        this.size = 0;
        this.top = 0;
        this.end = 0;

    }

    public void toIncreaseCapacity(){
        capacity += 200;
        int[]  b = new int[capacity];
        System.arraycopy(a, 0, b, 0, size);
        a = b;
    }

//если нет свободных мест в очереди - капасити увеличиваеv

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

// проверить на заполненность очереди
    @Override
    public void add(int el) {
        if(size == capacity){
            toIncreaseCapacity();
        }
        a[end] = el;
        size++;
        end++;

    }

    @Override
    public Integer peek() {
    if (isEmpty()){
            return null;
        }
        return a[top];
    }

    @Override
    public Integer pool() {

        if(isEmpty()){
           return null;
        }

        int b = a[top];
        a[top] = 0;
        top++;
        size--;
        return b;
    }

    @Override
    public void remove(){
        if(isEmpty()){
            return;
        }
        a[top] = 0;
        size--;
        top++;
    }

    @Override
    public void print(){
        for(int i = 0; i < size;i++){
            System.out.println(a[i] + " ");
        }
    }


}