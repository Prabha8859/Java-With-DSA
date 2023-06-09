// Q2. Insert a node at the given position in a linked list. 
// We are given a pointer to a node, and the
// new node is inserted after the given node.


public class ASS2_InsertAfter {
  class Node{
    int data;
    Node Next;
    Node(int da){
      data = da;
      Next = null;
    }
  }
  Node Head;
// Add New Element at the end of the List
  void EndAdd(int newElem){
    Node newNode = new Node(newElem);
    if(Head == null){
      Head = new Node(newElem);
      return;
    }
    Node temp = Head;
    while(temp.Next != null){
      temp = temp.Next;
    }
    temp.Next = newNode;
    return;
  }
  //  Display The Content of the List 
  void PrintData(){
    // Node tempp = new Node();
    Node tempp = Head;
    while(tempp != null){
      System.out.print(tempp.data+" ");
      tempp = tempp.Next;
    }
  }
  public static void main(String[] args) {
   ASS2_InsertAfter ll = new ASS2_InsertAfter();
   ll.EndAdd(2);
   ll.EndAdd(3);
}
}

