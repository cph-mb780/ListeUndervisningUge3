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
        System.out.println(result);
        return result;
    }

    public String removeFromHead() {

        if(isEmpty())
        {
            System.out.println("List is empty");
            return null;
        }

        if(head == tail)
        {
            head = null;
            return null;
        }

        head.next.prev = null;
        head = head.next;
        return head.name;
    }

    public String removeFromTail() {
        if(isEmpty())
        {
            System.out.println("List is empty");
            return null;
        }

        if(head == tail)
        {
            tail = null;
            return null;
        }

        tail.prev.next = null;
        tail = tail.prev;
        return tail.name;
    }
}
