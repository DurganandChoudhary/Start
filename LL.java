

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; // No intersection
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;

            if (pA == pB) {
                return pA; // Intersection point found
            }

            if (pA == null) {
                pA = headB; // Move pA to headB
            }

            if (pB == null) {
                pB = headA; // Move pB to headA
            }
        }

        return pA; // Intersection point not found
    }

    public static void main(String[] args) {
        // Create the first linked list: 3 -> 6 -> 9 -> 15 -> 30
        ListNode headA = new ListNode(3);
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(15);
        ListNode node4 = new ListNode(30);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create the second linked list: 10 -> 15 -> 30
        ListNode headB = new ListNode(10);
        headB.next = node3;

        ListNode intersectionNode = getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection Point: " + intersectionNode.val);
        } else {
            System.out.println("No Intersection Point");
        }
    }
}
