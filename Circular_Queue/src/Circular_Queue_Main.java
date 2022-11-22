public class Circular_Queue_Main {
    public static void main(String[] args) {

        CircularQueue cq = new CircularQueue(10);
        cq.enQueue(45);
        cq.enQueue(8);
        cq.enQueue(4);
        cq.enQueue(5);
        cq.enQueue(67);

        cq.enQueue(0);
        cq.enQueue(-94);
        cq.enQueue(2);

        System.out.println(cq.beginningOfQueue);
        System.out.println(cq.deQueue());
        System.out.println(cq.deQueue());
        System.out.println(cq.beginningOfQueue);
        System.out.println(cq.peek());
        System.out.println(cq.isFull());
        System.out.println(cq.size);
        cq.deleteQueue();
        System.out.println(cq.isEmpty());

    }
}
