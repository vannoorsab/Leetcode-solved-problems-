/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode newtemp=dummy;
        HashSet<Integer>map=new HashSet<>();
        while(temp!=null){
            if(!map.contains(temp.val)){
                map.add(temp.val);
            newtemp.next=new ListNode(temp.val);
            newtemp=newtemp.next;
            }
                        temp=temp.next;

        }
        return dummy.next;
    }
}