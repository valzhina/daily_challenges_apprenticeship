public class CLinkedList<T> {//<T> any object can go there
//Circular Linked List
    private Node head; //Pointer

//Method to add Node
//======================================================================================
    public void push(T newData){ //public method returns void and adds "data" to circular LinkedList

        if(head == null){ //if LinkedList is empty
            head = new Node(newData);
            head.next = head;
            return;
        }

        Node newNode = new Node(newData); //container for new "data"
        //newNode.next and newNode.data

        newNode.next = head.next;//old head.next(pointer part) part is written to new next component
        head.next = newNode; //Whole Node goes here
    }

//Method to pop Node
//======================================================================================
    public T pop() { //public method that removes first element of LinkedList
        T temp = head.next.data; //temporary container to store old head data before removing it
        head = head.next.next; //Whole Node goes here, the one that was connected to head
        head = head.next;
        return temp;
    }

//Method to peek Node data at first node
//======================================================================================
    public T peek(){
        return head.next.data;
    }

// Node defined
//======================================================================================
    private class Node{

        public Node(T data){ this.data = data;}

        Node next; //variable "next" type Node
        T data; // variable type T(generics) to rep any object

    }
}

