public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tail = head;
        ListNode pre = head;
        tail = tail.next;
        while(tail!=null){
            if(pre.val == tail.val){
               pre.next = tail.next;
            }else{
                tail = tail.next;
                pre = pre.next;
            }
        }
        return head;
    }
}
