public class Queue {
    public static Node initial(int x){
        Node queue = new Node(x);
        return queue;
    }

    public static void add(Node queue, int x){
        linkList link = new linkList();
        link.add(queue, x);
    }

    public static void pop(Node queue){
        linkList link = new linkList();
        link.delete(queue, 1);
//        delete(link);
    }

    public static void print(Node queue){
        linkList link = new linkList();
        link.print(queue);
    }

    public static void main(String[] args){
        Node queue = initial(-1);
        add(queue,3);
        print(queue);
        add(queue,5);
        print(queue);
        add(queue,7);
        print(queue);
        add(queue,7);
        print(queue);
        add(queue,10);
        print(queue);
        pop(queue);
        print(queue);
        pop(queue);
        print(queue);
        pop(queue);
        print(queue);
    }
}
