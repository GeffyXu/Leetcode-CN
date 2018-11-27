import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> list = new ArrayList<Integer>();
        if (l1 == null) return l2;
        if (l2 == null) return l2;
        while (l1.next != null) {
            list.add(l1.val);
            l1 = l1.next;
        }
        list.add(l1.val);
        while (l2.next != null) {
            list.add(l2.val);
            l2 = l2.next;
        }
        list.add(l2.val);
        Collections.sort(list);
        ListNode resNode = new ListNode(list.get(0));
        ListNode point = resNode;
        for (int i = 1; i < list.size(); i++) {
            point.next = new ListNode(list.get(i));
            point = point.next;
        }
        return resNode;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l2;
        ListNode resNode = new ListNode(0);
        ListNode point = resNode;
        while (l1 != null && l2!=null) {
            if(l1.val<=l2.val){
                point.next = new ListNode(l1.val);
                l1 = l1.next;
            }else{
                point.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            point = point.next;
        }
        while(l1!=null){
            point.next = new ListNode(l1.val);
            l1 = l1.next;
            point = point.next;
        }
        while(l2!=null){
            point.next = new ListNode(l2.val);
            l2 = l2.next;
            point = point.next;
        }
        return resNode.next;
    }

    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l2;
        ListNode resNode = null;
        if(l1.val<=l2.val){
            resNode = l1;
            resNode.next = mergeTwoLists3(l1.next,l2);
        }else{
            resNode = l2;
            resNode.next = mergeTwoLists2(l1,l2.next);
        }
        return resNode;
    }
}
