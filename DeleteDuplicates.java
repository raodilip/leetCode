class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        Set listSet = new HashSet<Integer>();
        ListNode dummy = new ListNode(-1);
        ListNode head2 = dummy ;
        while(head!=null){
            if(!listSet.contains(head.val)){
                listSet.add(head.val);
                head2.next = new ListNode(head.val);   
                head2 = head2.next;
                
            }
            head=head.next;
        }
        
        return dummy.next;
    }
}
