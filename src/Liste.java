public class Liste {
    Node head = null;
    Node tail = null;

    public Node insertFromHead (Node n)
    {
        if(head == null)
        {
            head = n;
            tail = n;
            return head;
        }

        head.prev = n;
        n.next = head;
        head = n;
        return head;
    }
}
