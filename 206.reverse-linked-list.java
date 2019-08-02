/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode cur=head;
        ListNode newHead=null;
        while(cur!=null){
            ListNode temp=cur.next;

         
            cur.next=newHead;
            newHead=cur;
            cur=temp;

        }

        return newHead;
   
        
    }
}

