class MergeSortedList {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp  = new ListNode();
        
    }
    
    public static void main(String[] args) {
     
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

       
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode merged = mergeTwoLists(l1, l2);
        
       
     
    }
}
