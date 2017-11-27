package LeetCode;

import java.util.List;

public class No021MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        l2.next.next.next = new ListNode(9);

        System.out.println(l1.getSize(l1));
        System.out.println(l2.getSize(l2));

        System.out.print("l1 : "); l1.printListNode(l1);
        System.out.print("l2 : "); l2.printListNode(l2);

        //System.out.print("merge :"); l1.printListNode(mergeTwoLists(l1, l2));
        System.out.print("merge best:"); l1.printListNode(mergeTwoListsBest(l1, l2));
    }

    public static ListNode mergeTwoListsBest(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val) {

            ListNode tmp = l2;
            tmp.next = mergeTwoListsBest(l1, l2.next);
            return tmp;

        } else {

            ListNode tmp = l1;
            tmp.next = mergeTwoListsBest(l1.next, l2);
            return tmp;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        /*
        * Merge two sorted linked lists and return it as a new list.
        * The new list should be made by splicing together the nodes of the first two lists.
        * */

        ListNode res = new ListNode(0);
        ListNode head = res;
        ListNode p = l1;
        ListNode q = l2;

        //System.out.print("p :"); p.printListNode(p);
        //System.out.print("q :"); q.printListNode(q);

        if(l1 == null && l2 != null) return l2;
        if(l1 != null && l2 == null) return l1;

        while(p != null && q != null) {   // 把比较小的那个放到结果链表中

            //System.out.println("curr p : " + p.val);
            //System.out.println("curr q : " + q.val);

            if(p.val <= q.val) {

                res.next = p;
                p = p.next;

            } else {

                res.next = q;
                q = q.next;
            }

            res = res.next;

        }

        if(p == null) {  // 剩余的直接全都接在后面即可

            res.next = q;
        }

        if(q == null) {

            res.next = p;
        }

        return head.next;
    }
}

class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public int getSize(ListNode l) {

        int size = 0;
        while(l != null) {

            l = l.next;
            size++;
        }

        return size;
    }

    public void printListNode(ListNode l) {

        if(l != null) {
            System.out.print(l.val);
            l = l.next;
        }

        while(l != null) {

            System.out.print( " -> " + l.val);
            l = l.next;
        }

        System.out.println();
    }
}