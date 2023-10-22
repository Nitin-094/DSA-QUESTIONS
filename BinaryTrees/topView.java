import java.util.*;
import java.util.LinkedList;

public class topView {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class bTree {
        static int i = -1;

        public static Node buildTree(int[] nodes) {
            i++;

            if (nodes[i] == -1) {
                return null;
            }

           Node bt = new Node(nodes[i]);

            bt.left = buildTree(nodes);
            bt.right = buildTree(nodes);


            return bt;
        }
    }

    static class info{
        Node node;
        int hd;
        info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    static void topViewBT(Node root){
        //level order

        Queue<info> q1 = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0 , max = 0;

        q1.add(new info(root,0));
        q1.add(null);//to track a new line.

        while(!q1.isEmpty()){
            info curr = q1.remove();
            if(curr==null){
                if(q1.isEmpty()){
                    break;
                }else{
                    q1.add(null);
                }
            }else {
                if(!map.containsKey(curr.hd)){// first time HD has occured
                    map.put(curr.hd,curr.node);// key and value pair.
                }

                if(curr.node.left != null){
                    q1.add(new info(curr.node.left,curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q1.add(new info(curr.node.right, curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }

        }

        for (int i = min; i <= max ; i++) {
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();

    }


    public static void main(String[] args) {


        topView.Node root = new topView.Node(1);
        root.left = new topView.Node(2);
        root.right = new topView.Node(3);
        root.left.left = new topView.Node(4);
        root.left.right = new topView.Node(5);
        root.right.left = new topView.Node(6);
        root.right.right = new topView.Node(7);


        topViewBT(root);

    }



}
