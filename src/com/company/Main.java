package com.company;

public class Main {




    public static void main(String[] args) {

        Sol2Leetcode sol = new Sol2Leetcode();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(6);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(8);

        ListNode result = sol.addTwoNumbers(l1, l2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}