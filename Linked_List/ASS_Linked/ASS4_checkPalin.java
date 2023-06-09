import java.util.zip.CheckedInputStream;

public class ASS4_checkPalin {
    class Node{
        int data;
        Node next;
        Node(int ad){
            data=ad;
            next = null;
        }
    }
    static Node head;
    void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return;
    }
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node midNode = findmid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left =  head;
        
        while( right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
       return true;
    }
    void print(){
        Node tem = head;
        while(tem != null){
            System.out.print(tem.data+" ->");
            tem = tem.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ASS4_checkPalin ll = new ASS4_checkPalin();
        ll.add(1);
        ll.print();
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.print();
        System.out.print(ll.checkPalindrome());

    }
}
