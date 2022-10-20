public class LinkedList<T> { //<T> any object can go there

    private Node head; //Pointer

//Method to add Node
//======================================================================================
    public void add(T newData){ //public method returns void and adds "data"  to  LinkedList

        if(head == null){ //if LinkedList is empty
            head = new Node(newData);
            return;
        }

        Node newNode = new Node(newData); //container for new "data"
        //newNode.next and newNode.data

        newNode.next = head;//old head == Old Node is written to this part of newNode
        head = newNode; //Whole Node goes here
    }

//Method to pop Node
//======================================================================================
    public T pop() { //public method that removes first element of LinkedList
        T temp = head.data; //temporary container to store old head data before removing it
        head = head.next; //Whole Node goes here, the one that was connected to head
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
        T data; // variable type T(generics) to rep any object

    }
}

