public class Queue_Main {
    public static void main(String[] args) {
        QueueArray queueArray=new QueueArray(10);
        queueArray.enQueue(6);
        queueArray.enQueue(23);
        queueArray.enQueue(1);
        queueArray.enQueue(7);
        queueArray.enQueue(78);
        queueArray.enQueue(9);
        queueArray.enQueue(0);
        System.out.println(queueArray.beginningOfQueue);
        System.out.println(queueArray.topOfQueue);
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.deQueue());
        System.out.println(queueArray.isEmpty());
        System.out.println(queueArray.peek());
        queueArray.deleteQueue();
    }
}
