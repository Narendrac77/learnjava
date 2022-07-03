package com.narendra.leetcode.AddTwoNodes;

import java.util.LinkedList;

public class AddTwoNumbers {
    private ListNode add(ListNode first, ListNode second){
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(first != null && second != null){
            int sum = carry + first.val + second.val ;
            int digit = sum % 10;
            ans.next = new ListNode(digit);
            ans = ans.next;
            carry = sum/10;
            first = first.next;
            second  = second.next;
        }
        while(first != null){
            int sum= carry + first.val;
            int digit = sum % 10;
            ans.next = new ListNode(digit);
            ans = ans.next;
            carry = sum/ 10;
            first = first.next;
        }
        while(second != null){
            int sum= carry + second.val;
            int digit = sum % 10;
            ans.next = new ListNode(digit);
            ans = ans.next;
            carry = sum/ 10;
            second  = second.next;
        }
        while(carry != 0){
            int sum = carry;
            int digit = sum % 10;
            ans.next = new ListNode(digit);
            ans = ans.next;
            carry = sum/ 10;
        }
        return dummy.next;
    }

    public ListNode addTwoNumbers(ListNode first, ListNode second) {
        ListNode ans = add(first, second);
        return ans;
    }

    public static void main(String[] args) {
        ListNode first;
        first = new ListNode(2, new ListNode(5, new ListNode(3, new ListNode(9))));
        ListNode second;
        second = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(first, second);
        System.out.println(result.val);
    }
}
