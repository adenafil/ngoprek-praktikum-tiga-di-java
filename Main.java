import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        BST tes = new BST();

        tes.add(4);
        tes.add(8);
        tes.add(4);
        System.out.println("min data " + tes.minData);
        tes.add(1);
        tes.add(2);
        tes.add(7);
        tes.add(6);
        System.out.println("min data " + tes.minData);

        tes.searchNodeVWithBFS(9);

        // Queue<Node> list = new LinkedList<>();
        // list.add(tes.root);

        // while (!list.isEmpty()) {
        //     Node current = list.poll();

        //     System.out.print(current.data + " ");

        //     if (current.leftChild != null) list.add(current.leftChild);

        //     if (current.rightChild != null) list.add(current.rightChild);

        //     if (list.isEmpty()) System.out.print(-1);

        //     // if (current.rightChild == null && current.leftChild == null) System.out.print(-1);
        // }

    }
    
}
