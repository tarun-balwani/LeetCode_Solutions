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
    public ListNode oddEvenList(ListNode head) {
//          ListNode newList = new ListNode(head.val);
//     ListNode newListPointer = newList;
//        ListNode pOdd = head;
//        ListNode pEven = head.next;
        
//         while(pOdd.next != null && pOdd.next.next != null){
//             newListPointer = pOdd.next.next;
//             newList.next  = newListPointer;
//             pOdd = pOdd.next.next;
//         }
        
//         while(pEven.next != null && pEven.next.next != null){
//             newList.next = pEven.next.next;
//             newList = newList.next;
//             pEven = newList;
//         }
        
//     return newList;
         if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}