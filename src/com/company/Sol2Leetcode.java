package com.company;

 class Sol2Leetcode {
    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int lastDigit;
        int reminder = 0;
        while ((l1 != null) || (l2 != null)){
            lastDigit = 0;
            if (l1 != null)
            {lastDigit = lastDigit+ l1.val;
                l1 = l1.next;
            }
            if (l2 != null)
            {
                lastDigit = lastDigit + l2.val;
                l2 = l2.next;
            }
            if(reminder == 1)
            {
                lastDigit++;
                reminder = 0;
            }

            if(lastDigit >= 10)
            {
                lastDigit = lastDigit % 10;
                reminder = 1;
            }


            current.next = new ListNode(lastDigit);
            current = current.next;
        }
        if (reminder == 1)
            current.next = new ListNode(1);
        current= current.next;
        return dummy.next;
    }
}
/*
        Sol2Leetcode sol = new Sol2Leetcode();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode result = sol.addTwoNumbers(l1, l2);

        while(result != null){
            System.out.print(result.val + " ");
            result = result.next;
        }

 */