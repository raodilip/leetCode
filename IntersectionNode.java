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
public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visitedSet = new HashSet<>();
        
        while(headA != null){
            visitedSet.add(headA);
            headA = headA.next;
        }
        
        while(headB !=null){
            if(visitedSet.contains(headB))
                return headB;
            
            headB = headB.next;
        }
        
        return null;
    }
}
