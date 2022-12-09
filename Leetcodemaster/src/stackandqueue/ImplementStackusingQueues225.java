package stackandqueue;

public class ImplementStackusingQueues225 {

}

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        // 思路这里是每次在你添加一个数字的时候都把他作为queue的第一个添加即可
        // 这里需要用一个queue2来做缓冲
        queue2.offer(x);
        // 把queue1 中内容重新添加到queue2中 这样刚刚添加的x就会在队列最前端
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        // 清空buffer queue2
        Queue<Integer> temp;
        temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    public int pop() {
        return queue1.poll();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}