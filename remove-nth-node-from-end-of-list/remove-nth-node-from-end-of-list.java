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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode currNode = head;
        //This is to calculatr the length of list
        while(currNode != null){
            currNode = currNode.next;
            length++;
        }
        if(length == n){
            return head.next;
        }
        //index of node before the node to be removed = length -n - 1
        int indexOfNodeBefore = length-n-1;
        currNode = head;
        for(int i = 0; i < indexOfNodeBefore; i++){
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
        
    return head;
    }
}