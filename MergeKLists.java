/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(ListNode node : lists){
			while(node!=null){
				pq.add(node.val);
				node = node.next;
			}
		}

		ListNode result = new ListNode(0);
		ListNode head = result;
		while(!pq.isEmpty()){
			ListNode tempNode = new ListNode(pq.poll());
			result.next = tempNode;
			result = result.next;
		}
		return head.next;
	}
}
