package stacks;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if(output.isEmpty()) {
            while(!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.empty();
    }

    public void print() {
        if(!output.empty()) {
            System.out.println(output);
        }
        if(!input.empty()) System.out.println(input);
    }

    static void main() {
        MyQueue mq = new MyQueue();
        mq.push(2);
        mq.push(3);
        mq.push(4);
        System.out.println(mq.pop());
        mq.push(5);
        mq.print();
        System.out.println(mq.peek());
    }
}
