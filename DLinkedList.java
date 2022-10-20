public class DLinkedList <T> { //<T> any object can go there
//Doubly Linked List

    private Node head, tail; //Pointer

//Method to add Node
//======================================================================================
    public void push(T newData){ //public method returns void and adds "data"  to  Double LinkedList

        if(head == null){ //if DLinkedList is empty
            head = new Node(newData);
            tail = head;
            return;
        }

        Node newNode = new Node(newData); //container for new "data"
        //newNode.next and newNode.data

        newNode.next = head;//old head == Old Node is written to this part of newNode
        head.prev = newNode; //Whole Node is written into Old head prev
        head = newNode; //Whole Node goes here
    }


//Method to pop Node
//======================================================================================
    public T pop() { //public method that removes first element of LinkedList

        T temp = head.data; //temporary container to store old head data before removing it
        head = head.next;
        head.prev = null;
        return temp;
    }


//Method to peek Node data at first node
//======================================================================================
    public T peek(){
        return head.data;
    }

    // Node defined
//======================================================================================
    private class Node{

        public Node(T data){ this.data = data;}

        Node next; //variable "next" type Node
        Node prev; //variable "prev" type Node
        T data; // variable type T(generics) to rep any object

    }
}
