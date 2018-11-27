public class Solution2 {
    public Node addTwoNumbers(Node l1, Node l2) {
        int flag =0;
        while(l1.next!= null && l2.next!=null){
            if(flag == 0) {
                if(l1.val + l2.val >=10){
                    flag = 1;
                }else{
                    flag =0 ;
                }
                l1.val = (l1.val + l2.val) % 10;
            }else {
                l1.val = (l1.val + l2.val) % 10 + 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if(flag == 0) {
            if(l1.val + l2.val >=10){
                flag = 1;
            }else{
                flag =0 ;
            }
            l1.val = (l1.val + l2.val) % 10;
        }else {
            l1.val = (l1.val + l2.val) % 10 + 1;
        }


        if(l1.next == null) {
            while (l2.next != null) {
                if (flag == 0) {
                   Node l = new Node(l2.val);
                   l1.next = l;
                } else {
                    Node l = new Node(l2.val + 1);
                    l1.next = l;
                    flag = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            Node newl = new Node(l2.val);
            l1.next = newl;
        }

        if(l2.next == null){
            if(flag == 1){
                l1.val = l1.val + 1;
            }
        }
        return l1;
    }

    public static void main(String [] args){
        Node l1 = new Node(2);
        Node node2= new Node(4);
        Node node3 = new Node(3);
        l1.next = node2;
        node2.next = node3;

        Node l2 = new Node(5);
        Node node4 = new Node(4);
        Node node5 = new Node(6);
        l2.next = node4;
        node4.next = node5;
        Solution2 solution2 = new Solution2();
        Node l = solution2.addTwoNumbers(l1 , l2);
        while(l!=null){
            System.out.println(l.val);
            l = l.next;
        }
    }
}
