import java.util.Arrays;

public class Queue<T>  {//implements java.util.Queue

    private Node head, tail; //Pointer

//Method to add Node to the end of the Queue
//======================================================================================
    public void enqueue(T newData){ //public method returns void and adds "data"

        if(head == null){ //if Queue is empty
            head = new Node(newData);
            tail = head;
            return;
        }

        tail.next = new Node(newData); //back.next will be a container for new "data"
        //it has newNode.next and newNode.data
        tail = tail.next;//Whole new Node goes here
    }

//Method to remove Node from the head of the Queue
//======================================================================================
    public T dequeue() { //public method that removes first element of Queue
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

