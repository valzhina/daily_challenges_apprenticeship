public class _206ReverseLinkedList {
    public static void main (String[] args throws Exception){

    }

    public void reverseLinkedList() {
        Node cursor = head.next;
        Node prev = head;

        Node temp;
        while(cursor.next != null){
            temp = cursor;
            cursor = cursor.next;
            prev.next.next = prev; //cursor.next
            prev = temp;
        }
        cursor.next = prev;
        head = cursor;
    }

    public void recReverseLinkedList(){
    }
}

// Node defined
//======================================================================================
    private class Node{

        public Node(T data){ this.data = data;}

        Node next; //variable "next" type Node
        T data; // variable type T(generics) to rep any object

}


