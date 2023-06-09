// Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is
//  present in the linked list or not.
public class ASS1_SearchNum{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int da){
            data = da;
            next = null;
        }
    }
    // inserts a new node at the front of list
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    // Checks Whether the Value X is Present in List
    public boolean Search(Node head, int x){
        Node current = head;
        while (current != null){
            if(current.data == x){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ASS1_SearchNum ll = new ASS1_SearchNum();
        ll.push(11);
        ll.push(12);
        ll.push(21);
        ll.push(43);
        ll.push(23);
        if(ll.Search(ll.head, 21)){
            System.out.println("Yes ! Present This value: ");
        }else{
            System.out.println("No! Present This Value: ");
        }
    }
}