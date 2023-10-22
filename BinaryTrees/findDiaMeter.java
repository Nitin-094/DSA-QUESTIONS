public class findDiaMeter {
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




    static int treeHeight(Node root){
        if(root == null){
            return 0;
        }

        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);

        return Math.max(lh,rh) + 1;

    }

    //Approach 1 to find out the height of diameter of a binary tree.
    static int findDia1(Node root){  // O(n^2)

        if(root == null){
            return 0;
        }
        int ldia = findDia1(root.left);
        int rdia = findDia1(root.right);
        int lh = treeHeight(root.left);
        int rh = treeHeight(root.right);

        int totalHeight = lh+rh+1;
        int maxDia = Math.max(ldia,rdia);
        return Math.max(maxDia,totalHeight);
    }

    static class infoTree{
        int d; // diameter
        int h; // height

        public infoTree(int dia, int height){
            this.d = dia;
            this.h = height;
        }

    }

    static infoTree diameter(Node root){

        if(root == null){
         return new infoTree(0,0);
        }
        infoTree leftDia = diameter(root.left);
        infoTree rightDia = diameter(root.right);

        int diaHeight = leftDia.h + rightDia.h +1;
        int singleMaxDia = Math.max(leftDia.d, rightDia.d);
        int maxDia = Math.max(diaHeight,singleMaxDia);
        int maxHeight = Math.max(leftDia.h, rightDia.h)+1;

        return new infoTree(maxDia , maxHeight);
    }
    static infoTree newDia(Node root){
        if(root == null){
            return new infoTree(0,0);
        }

        infoTree leftInfo = newDia(root.left);
        infoTree rightInfo = newDia(root.right);

        int maxDia = Math.max(leftInfo.d, Math.max(rightInfo.d, leftInfo.h+ rightInfo.h+1));
        int maxH = Math.max(leftInfo.h, rightInfo.h)+1;


        return new infoTree(maxDia,maxH);
    }

    public static void main(String[] args) {
        findDiaMeter.Node root = new findDiaMeter.Node(1);
        root.left = new findDiaMeter.Node(2);
        root.right = new findDiaMeter.Node(3);
        root.left.left = new findDiaMeter.Node(4);
        root.left.right = new findDiaMeter.Node(5);
        root.right.left = new findDiaMeter.Node(6);
        root.right.right = new findDiaMeter.Node(7);

//        System.out.println(findDia1(root));

        System.out.println(newDia(root).d+" "+diameter(root).d);
//
//        Node subRoot = new Node(2);
//        subRoot.left = new Node(4);
//        subRoot.right = new Node(5);

    }
}




