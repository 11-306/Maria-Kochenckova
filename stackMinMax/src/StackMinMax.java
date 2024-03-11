import java.util.Deque;
import java.util.LinkedList;

public class StackMinMax {
    private int top;
    private Deque<Integer> data;
    private Deque<Integer> min;
    private Deque<Integer> max;


    StackMinMax(int size) {
        this.data = new LinkedList<Integer>();
        this.min = new LinkedList<>();
        this.max = new LinkedList<>();
    }



    public void push(int x){
        data.push(x);
        if (min.isEmpty() || min.peek() > x) {
            this.min.push(x);
        }

        if (max.isEmpty() || max.peek() < x) {
            this.max.push(x);
        }



    }

    public void pop(){
        if (data.isEmpty()) {
            int cur = this.data.pop();
            if (max.peek() == cur) {
                max.pop();
            }

            if (min.peek() == cur) {
                this.min.pop();
            }

        } else {
            throw new IllegalArgumentException("ошибка");
        }

    }

    int lastElem() {
        if (!data.isEmpty()) {
            return data.peek();
        } else {
            throw new IllegalArgumentException("ошибка");
        }
    }

    int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        } else {
            throw new IllegalArgumentException("ошибка");
        }
    }

    int getMax() {
        if (!max.isEmpty()) {
            return max.peek();
        } else {
            throw new IllegalArgumentException("ошибка");
        }
    }
}