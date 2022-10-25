public class BinaryTree {

        private Node root, cursor;


        public void add(int data){
            if (root == null){
                root = new Node(data);
            }

            cursor = root;
            while(cursor.data != data) { //doesn't contain the data we are trying to add
                if(data < cursor.data){
                    //look at left node
                    if(cursor.left != null){
                        cursor = cursor.left;
                        continue;
                    }

                    cursor.left = new Node(data);
                    break;
                }
                else if(data > cursor.data){
                    //look at right node
                    if(cursor.right != null){
                        cursor = cursor.left;
                        continue;
                    }

                    cursor.right = new Node(data);
                    break;
                }
            }
        }


// Node defined
//======================================================================================
    private class Node {
        public Node(int data) {
            this.data = data;
        }

        Node left; //variable "left" type Node
        Node right; //variable "right" type Node
        int data; // variable type T(generics) to rep any object

    }
}