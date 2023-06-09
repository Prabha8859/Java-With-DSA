public class ASS3_DeletDuplicates {
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node head;
    void addData(int daa){
        Node newNode=new Node(daa);
        if(head == null){
            head = new Node(daa);
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        return;
    }
    static void deleteDuplicates() {
        if(head == null || head.next == null)
            return ;
        Node cur = head;
        
        while( cur != null && cur.next != null){
           
            if(cur.data == cur.next.data){
                cur.next = cur.next.next;
            }
            else{
                cur = cur.next; 
            }
        }
        return;
    }
    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ASS3_DeletDuplicates ll = new ASS3_DeletDuplicates();
        ll.addData(1);
        ll.print();
        ll.addData(2);
        ll.print();
        ll.addData(3);
        ll.print();
        ll.addData(3);
        System.out.println("Print this Linked list Befor Duplicates:-");
        ll.print();
        
        ll.deleteDuplicates();
        System.out.println("Print this Linked list after Duplicates:-");
        ll.print();
    }
}
