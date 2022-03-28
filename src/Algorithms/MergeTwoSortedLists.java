package Algorithms;
/**
 *
 * 21. Merge Two Sorted Lists
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 *
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import Algorithms.ListNode;
import org.junit.Test;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode (0);
        ListNode head = dummy;
        while (true){
            if (list1==null){
                dummy.next=list2;
                break;
            }
            if (list2==null){
                dummy.next=list1;
                break;
            }
            if (list1.val<=list2.val){
                dummy.next=list1;
                list1=list1.next;
            }
            else {
                dummy.next=list2;
                list2=list2.next;
            }
            dummy=dummy.next;
        }
        return head.next;
    }


    @Test
    public void test_mergeTwoSortedLists() {
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
        ListNode list1 = new ListNode(1);
        ListNode list1_1 = new ListNode(2);
        ListNode list1_2 = new ListNode(4);
        list1_1.next = list1_2;
        list1.next = list1_1;

        ListNode list2 = new ListNode(1);
        ListNode list2_1 = new ListNode(3);
        ListNode list2_2 = new ListNode(4);
        list2_1.next = list2_2;
        list2.next = list2_1;

        mergeTwoLists(list1, list2);
    }
}


