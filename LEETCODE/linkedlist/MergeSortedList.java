package LEETCODE.linkedlist;



public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1== null)
            return l2;
        else if(l2==null)
            return l1;
        ListNode dummyHead= new ListNode(0);
        ListNode curr = dummyHead;
        while (l1 != null && l2 != null){
            if(l1.val<=l2.val){
                curr.next=l1;
                curr=curr.next;
                l1= l1.next;
            }else if(l1.val>= l2.val){
                curr.next=l2;
                curr=curr.next;
                l2= l2.next;
            }
        }
        if(l1==null&& l2!= null)
            curr.next=l2;
        if(l2==null&& l1!= null)
            curr.next=l1;
        return dummyHead.next;
    }

    public static void main (String arg[]){
        MergeSortedList mergeSortedList= new MergeSortedList();
        ListNode a= new ListNode(1);
        ListNode b= new ListNode(2);
        ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;

        ListNode x= new ListNode(1);
        ListNode y= new ListNode(2);
        ListNode z= new ListNode(3); x.next=y; y.next=z; z.next= null;

        mergeSortedList.print( mergeSortedList.mergeTwoLists(a,x));
    }
    public void print(ListNode head){
        while (head != null){

            System.out.println(head.val+"->");
            head= head.next;
        }
    }
}
