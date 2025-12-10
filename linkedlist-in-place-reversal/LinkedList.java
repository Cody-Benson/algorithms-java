public class LinkedList {
    public Node head = null;

    public LinkedList(){}

    public void addNode(int num){
        if(head == null){
            head = new Node(num);
            return;
        }

        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(num);
    }

    public void printList(){
        Node cur = head;
        while(cur != null){
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    public void reverse(){
        Node cur = head;
        if(cur == null){
            return;
        }

        if(cur.next == null){
            return;
        }

        Node prev = null;
        Node temp = cur.next;
        while(temp != null){
            cur.next = prev;
            prev = cur;
            cur = temp;
            temp = temp.next;
        }
        cur.next = prev;
        head = cur;
        return;
    }
}
