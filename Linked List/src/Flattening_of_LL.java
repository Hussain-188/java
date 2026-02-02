/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        ListNode temp = head;
        List<Integer> ls = new ArrayList<>();

        while(temp!=null){
            ListNode t1 = temp;
            while(t1!=null){
                ls.add(t1.val);
                t1=t1.child;
            }
            temp=temp.next;
        }

        Collections.sort(ls);

        ListNode dummy = new ListNode(-1);
        temp=dummy;

        for(int x:ls){
            ListNode newNode = new ListNode(x);
            temp.child=newNode;
            temp=temp.child;
        }
        return dummy.child;

    }
}