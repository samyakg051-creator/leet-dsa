/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA ==null || headB == null){return null;}
        ListNode PtrA = headA;
        ListNode PtrB = headB;
        while(PtrA!=PtrB){
           PtrA= (PtrA == null )? headB : PtrA.next;
           PtrB= (PtrB == null )? headA : PtrB.next;
        }return PtrA;
        
    }
}