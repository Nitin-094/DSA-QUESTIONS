public class subTree {

    static class Node {
        int data;
        subTree.Node left;
        subTree.Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class bTree {
        static int i = -1;
        public static subTree.Node buildTree(int[] nodes) {
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            subTree.Node bt = new subTree.Node(nodes[i]);
            bt.left = buildTree(nodes);
            bt.right = buildTree(nodes);
            return bt;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot ==null ){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left,subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root,Node subRoot){ //subRoot that matches with the root of the tree.
    if(root == null){
        return false;
    }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        boolean left = isSubtree(root.left, subRoot); // if it exists in left sub tree of main tree
        boolean right = isSubtree(root.right,subRoot);

        return left || right;
    }

    public static void main(String[] args) {

        subTree.Node root = new subTree.Node(1);
        root.left = new subTree.Node(2);
        root.right = new subTree.Node(3);
        root.left.left = new subTree.Node(4);
        root.left.right = new subTree.Node(5);
        root.right.left = new subTree.Node(6);
        root.right.right = new subTree.Node(7);

        //-------------------------------------------------

        subTree.Node subRoot = new subTree.Node(2);
        subRoot.left = new subTree.Node(4);
        subRoot.right = new subTree.Node(5);

        //-------------------------------------------------

        System.out.println(isSubtree(root,subRoot));

    }
}
