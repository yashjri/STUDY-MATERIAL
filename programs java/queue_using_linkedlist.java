import java.util.LinkedList;
public class queue_using_linkedlist<T> 
{
    private LinkedList<T> list= new LinkedList<>();
    public void enqueue(T item)
    {
        list.addLast(item);
    }
    public T dequeue()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }
    public int size()
    {
        return list.size();
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public T peek()
    {
        if(isEmpty())
        {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }
    public void clear()
    {
        list.clear();
    }

    public static void main(String[] args)
    {
        queue_using_linkedlist<Integer> queue = new queue_using_linkedlist<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("queue size:" + queue.size());
        while(!queue.isEmpty())
        {
            System.out.println("dequeue:" + queue.dequeue());
        }
        System.out.println("queue size after dequeue:"+queue.size());
    }
}
