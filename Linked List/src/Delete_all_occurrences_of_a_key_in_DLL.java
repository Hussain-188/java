/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {

        ListNode temp = head;

        while(temp!=null){
            if(temp.val==target){
                if(temp==head){
                    head=head.next;
                }
                ListNode nextNode = temp.next;
                ListNode prevNode = temp.prev;

                if(nextNode!=null) nextNode.prev = prevNode;
                if(prevNode!=null) prevNode.next = nextNode;

                temp=temp.next;
            }

            else{
                temp=temp.next;
            }
        }
        return head;

    }
}
