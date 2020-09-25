package LEETCODE.linkedlist;

public class ReverseLinkedList {

    public static void main (String arg[]){
        ReverseLinkedList reverseLinkedList= new ReverseLinkedList();
        ListNode a= new ListNode(1);
        ListNode b= new ListNode(2);
        ListNode c= new ListNode(3);
        ListNode d= new ListNode(4); ListNode e= new ListNode(5);
        a.next=b;b.next=c;c.next=d;d.next=e;e.next=null;
        reverseLinkedList.print( reverseLinkedList.reverseList(a));
    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode curr=head; ListNode prev=null;
        while(curr != null){
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return  prev;
    }
    public void print(ListNode head){
        while (head != null){

            System.out.println(head.val+"->");
            head= head.next;
        }
    }
}
