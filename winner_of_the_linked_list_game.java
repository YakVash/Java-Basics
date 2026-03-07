class ListNode {

    int val;
    ListNode next;

    //Constructor
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


class Solution{
    public String gameResult(ListNode head){
       int even = 0; 
       int odd = 0;

       ListNode current = head;
       while (current != null && current.next != null){
        if (current.val > current.next.val){
            even++;
        }
        else if(current.val < current.next.val) {
            odd++;
        }

        //Move two steps forward
        current = current.next.next;
       }

       if (even > odd) {
        return "Even";
       }

       else if (odd > even){
        return "odd";
       }

       else {
        return "Tie";
       }
    }
    

}

public class winner_of_the_linked_list_game {
    public static void main(String[] args) {
        //Creating Linked List: 2 -> 1 -> 4 -> 5
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);

        Solution sol = new Solution();

        String result = sol.gameResult(head);

        System.out.println("Winner:" + result);
    }
}