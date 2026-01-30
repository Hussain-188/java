import java.util.HashSet;

// Definition of singly linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

        class Solution {
            // Function to find the intersection node of two linked lists
            public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
                // Create a hash set to store the nodes
                // Of the first list
                HashSet<ListNode> nodes_set = new HashSet<>();

                // Traverse the first linked list
                // And add all its nodes to the set
                while (headA != null) {
                    nodes_set.add(headA);
                    headA = headA.next;
                }

                // Traverse the second linked list
                // And check for intersection
                while (headB != null) {
                    // If a node from the second list is found in the set,
                    // It means there is an intersection
                    if (nodes_set.contains(headB)) {
                        return headB;
                    }
                    headB = headB.next;
                }

                // No intersection found, return null
                return null;
            }
        }

        // Utility function to insert a node at the end of the linked list
        void insertNode(ListNode head, int val) {
            // Create a new node with the given value
            ListNode newNode = new ListNode(val);

            // If the list is empty, set the new node as the head
            if (head == null) {
                head = newNode;
                return;
            }

            // Otherwise, traverse to the end of the list
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            // Insert the new node at the end of the list
            temp.next = newNode;
        }

        // Utility function to print the linked list
        void printList(ListNode head) {
            // Traverse the list
            while (head.next != null) {
                // Print the value of each node followed by an arrow
                System.out.print(head.val + "->");
                head = head.next;
            }
            // Print the value of the last node
            System.out.println(head.val);
        }

        public static void Find_the_intersection_point_of_Y_LL(String[] args) {
            // Creation of the first list
            ListNode head1 = new ListNode();
            insertNode(head1, 1);
            insertNode(head1, 3);
            insertNode(head1, 1);
            insertNode(head1, 2);
            insertNode(head1, 4);

            // Create an intersection
            ListNode intersection = head1.next.next.next;

            // Creation of the second list
            ListNode head2 = new ListNode();
            insertNode(head2, 3);
            head2.next = intersection;

            // Printing the lists
            System.out.print("List1: ");
            printList(head1);
            System.out.print("List2: ");
            printList(head2);

            // Checking if an intersection is present
            Solution sol = new Solution();
            ListNode answerNode = sol.getIntersectionNode(head1, head2);
            if (answerNode == null) {
                System.out.println("No intersection");
            } else {
                System.out.println("The intersection point is " + answerNode.val);
            }
        }
