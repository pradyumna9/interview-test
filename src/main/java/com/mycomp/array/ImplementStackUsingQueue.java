package com.mycomp.array;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueue {

    Queue<Integer> queue;

    public ImplementStackUsingQueue() {
        queue = new ArrayDeque<>();
    }

    public void push(int x) {
       queue.offer(x);
       for(int i=0;i< queue.size()-1;i++)
           queue.offer(queue.poll());
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

class ImplementStackUsingQueueTest {
    public static void main(String[] args) {
        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
        obj.push(10);
        obj.push(20);
        obj.push(900);
        obj.push(89);
         int param_3 = obj.top();
        int param_2 = obj.pop();
        int param_5 = obj.top();
        boolean param_4 = obj.empty();

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

