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
         ListNode tempA= headA;
         ListNode tempB= headB;
         int lengthA=0;
         while (tempA != null){
            lengthA++;
            tempA= tempA.next;
         }
         int lengthB=0;
         while (tempB != null){
            lengthB++;
            tempB= tempB.next;
         }
         tempB= headB;
        tempA= headA;

         if(lengthA > lengthB){
            int steps = lengthA- lengthB;
            for (int i=0; i<steps; i++){
                tempA = tempA.next;
            }
         }
         else{
            int steps = lengthB- lengthA;
            for (int i=0; i<steps; i++){
                tempB=tempB.next;
            }
         }
         while( tempA != tempB){
            tempA= tempA.next;
            tempB= tempB.next;
         }
         return tempB;
}
}