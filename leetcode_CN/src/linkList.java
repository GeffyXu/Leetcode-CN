public class linkList {
    public static Node initial() {
        Node linkList = new Node(-1);
        return linkList;
    }

    public static void add(Node link, int x) {
        Node head = link;
        while (link.next != null) {
            link = link.next;
        }
        Node node = new Node(x);
        link.next = node;
        link = head;
    }

    public static void insert(Node link, int x, int index) {
        Node head = link;
        int i = 1;
        while (link.next != null) {
            Node temp = link.next;
            if (i == index) {
                Node Innode = new Node(x);
                Innode.next = temp;
                link.next = Innode;
                break;
            } else {
                link = link.next;
            }
            i++;
        }
        link = head;
    }

    public static void delete(Node link, int index) {
        Node head = link;

        int i = 1;
        while (link != null) {
            Node temp = link.next;
            if (i == index) {
                link.next = temp.next;
                break;
            } else {
                link.next = link;
            }
        }
        link = head;

    }


    public static int length(Node link) {
        Node head = link;
        int i = 1;
        while (link.next != null) {
            link = link.next;
            i += 1;
        }
        link = head;
        return i;
    }
//


    public static void print(Node link) {
        Node head = link;
        while (link != null) {
            System.out.print(link.val);
            if (link.next != null) {
                System.out.print("-->");
            }
            link = link.next;
        }
        System.out.print("\n");
        link = head;
    }


    public static void main(String[] args) {

        Node linklist = initial();
        add(linklist, 1);
        add(linklist, 2);
        add(linklist, 3);
        add(linklist, 4);
        insert(linklist, 5, 2);
        delete(linklist, 1);
        print(linklist);
        System.out.println();
        System.out.println(length(linklist));

    }
}
