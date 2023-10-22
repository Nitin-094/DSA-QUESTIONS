import java.util.*;
import java.util.LinkedList;
public class basicsBT {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static class bTree{// via preorder traversal .
        static int i = -1;
       public static Node buildTree(int[] nodes){
            i++;
            if(nodes[i] == -1){
                return null;
            }
            Node bt = new Node(nodes[i]);
            bt.left = buildTree(nodes);
            bt.right = buildTree(nodes);
            return bt;
        }
        static void preOrder(Node root){

            if(root == null){
//                System.out.print(-1+" ");
                return;
            }

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }


        static void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }


        static void postOrder(Node root){

           if(root == null){
               return;
           }

           postOrder(root.left);
           postOrder(root.right);
           System.out.print(root.data+" ");

        }


        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q1 = new LinkedList<>();
            q1.add(root);
            q1.add(null);
            while(!q1.isEmpty()){
                Node currNode = q1.remove();
                if(currNode == null){
                    System.out.println();
                    if(q1.isEmpty()){
                        break;
                    }else{
                        q1.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q1.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q1.add(currNode.right);
                    }
                }
            }
        }

        public static List<List<Integer>> levelOrder1(Node root){ // to add the levels in a list
                Queue<Node> queue = new LinkedList<>();
                List<List<Integer>> wrap = new LinkedList<List<Integer>>();
                if(root==null) return wrap;
                queue.add(root);
                while(!queue.isEmpty()){
                    List<Integer> list = new LinkedList<>();
                    int num = queue.size();
                    for(int i=0; i<num; i++){
                        if(queue.peek().left!=null) queue.add(queue.peek().left);
                        if(queue.peek().right!=null) queue.add(queue.peek().right);
                        list.add(queue.remove().data);
                    }
                    wrap.add(list);
                }
                return wrap;
            }


        public static int treeHeight(Node root){

           if(root == null){
               return 0;
           }

           int lh = treeHeight(root.left);
           int rh = treeHeight(root.right);

           return Math.max(lh,rh) + 1;

        }

        static int nodeCount(Node root){

           if(root == null){
               return 0;
           }


           int lcount = nodeCount(root.left);
           int rcount = nodeCount(root.right);


           return lcount + rcount +1;
        }

        static int nodeSum(Node root){
            if(root == null){
                return 0;
            }
           int lSum = nodeSum(root.left);
           int rSum = nodeSum(root.right);
           return lSum+rSum+ root.data;
        }
    }

    public static void main(String[] args) {

        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        bTree b1 = new bTree();

        Node rootNode = bTree.buildTree(nodes);
//
////        System.out.println(rootNode.data);
//
//        bTree.preOrder(rootNode);
//        System.out.println();
//        bTree.inOrder(rootNode);
//        System.out.println();
//        bTree.postOrder(rootNode);

//
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);
//
//
////        System.out.println(bTree.nodeSum(root));
//
//        System.out.println(bTree.levelOrder1(root));
        ArrayList<Integer> l1 = new ArrayList<>();



    }
}
