public class Liste {
    Node head = null;
    Node tail = null;
public boolean isEmpty()
{
    if(head == null)
    {
        return true;
    }
    return false;
}

    public Node insertFromHead (String s)
    {
        Node node = new Node(s);

        if(isEmpty())
        {
            head = node;
            tail = node;
            return head;
        }

        head.prev = node;
        node.next = head;
        head = node;
        return head;
    }

    public String printFromHead() {
        Node n = head;
        String result = "";

        if(isEmpty())
        {
            System.out.println("List is empty");
        }

        while(n != null)
        {
            result += n.name;
            n = n.next;
        }
        System.out.println(result);
        return result;
    }

    public String printFromTail() {
    Node n = tail;
    String result = "";

    if (isEmpty())
    {
        System.out.println("List is empty");
    }

    while(n != null)
    {
        result += n.name;
        n = n.prev;
    }
    return result;
    }
}
