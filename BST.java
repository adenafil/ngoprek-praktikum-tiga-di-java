import java.util.LinkedList;
import java.util.Queue;

public class BST {
    
    public Node root;
    public int minData;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void add(int data) {
        Node baru = new Node(data);
        int level = 1;

        if (isEmpty()) {
            this.root = baru;
            // minData = root.data;
            setMinData(root.data);
            System.out.println(level);
            // System.out.println(has(this.root, data));
            return;
        }

        Node tempRoot = this.root;

        while (true && !has(tempRoot, data)) {
            // System.out.println(has(tempRoot, data));
            
            if (data < tempRoot.data) {
                level++;
                if (tempRoot.leftChild == null) {
                    tempRoot.leftChild = baru;
                    System.out.println(level);
                    setMinData(data);
                    break;
                }
                tempRoot = tempRoot.leftChild;
            }
            else
            {
                level++;
                if (tempRoot.rightChild == null) {
                    tempRoot.rightChild = baru;
                    System.out.println(level);
                    setMinData(data);
                    break;
                }

                tempRoot = tempRoot.rightChild;
            }

        }
    }

    public boolean has(Node node, int value) {
        // cek root
        if (node.data == value) {
            System.out.println("Duplikat");
            return true;
        }
        
        while (true) {

            if (value < node.data) {

                if (node.leftChild == null) {
                    return false;
                }

                if (node.leftChild.data == value) {
                    return true;
                }

                node = node.leftChild;
            }
            else
            {
                if (node.rightChild == null) {
                    return false;
                }

                if (node.rightChild.data == value) {
                    return true;
                }

                node = node.rightChild;
            }


        }
    }

    public void setMinData(int newData) {
        if (minData == 0) minData = newData;

        if (minData > newData) {
            minData = newData;
            return;
        }
    }

    public int getMinData() {
        return minData;
    }

    public void searchNodeVWithBFS(int value) {
        Queue<Node> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            Node current = list.poll();

            System.out.print(current.data + " ");

            if (current.data == value) break;

            if (current.leftChild != null) list.add(current.leftChild);

            if (current.rightChild != null) list.add(current.rightChild);

            if (list.isEmpty()) System.out.print(-1);

        }
    }

}
