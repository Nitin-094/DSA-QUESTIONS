import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class bt1 {

    static class node{
        int data;
        node lc;
        node rc;

        node(int data){
            this.data = data;
            this.lc = null;
            this.rc = null;
        }
    }
    static int i = -1;
    static node buildTree(int[] nodeArr){ // building the tree using preorder fashion.
        i++;

        if(nodeArr[i]==-1){
            return null;
        }
        node node1 = new node(nodeArr[i]);
         node1.lc = buildTree(nodeArr);
         node1.rc = buildTree(nodeArr);

        return node1;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void preOrder(node node) {

        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        preOrder(node.lc);//-------------
        preOrder(node.rc);

    }

    static void inOrder(node node) {

        if(node == null){
            return;
        }

        inOrder(node.lc);
        System.out.print(node.data+" ");
        inOrder(node.rc);

    }
    static void postOrder(node node) {

        if(node == null){
            return;
        }

        postOrder(node.lc);
        postOrder(node.rc);
        System.out.print(node.data+" ");

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void levelOrder(node node) {
        if (node == null) {
            return;
        }
        Queue<node> q1 = new LinkedList<>();
        q1.add(node);
        q1.add(null);
        while (!q1.isEmpty()) {
            {
                node curNode = q1.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q1.isEmpty()) {
                        break;
                    } else {
                        q1.add(null);
                    }
                } else {
                    System.out.print(curNode.data + " ");
                    if (curNode.lc != null) {
                        q1.add(curNode.lc);
                    }
                    if (curNode.rc != null) {
                        q1.add(curNode.rc);
                    }
                }
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static int height(node node){
        if(node == null){
            return 0;
        }
        int LH = height(node.lc);
        int RH = height(node.rc);

        return Math.max(LH,RH) + 1;
//        return LH+RH+ node.data;    //sum of nodes
//        return LH+RH+1;             //number of nodes
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class info{
        int dia;
        int height;
        info(int d , int h){
            this.dia = d;
            this.height = h;
        }
    }

    static info diameter(node node){
        if(node == null){
            return new info(0,0);
        }

        info leftDia = diameter(node.lc);
        info rightDia = diameter(node.rc);

        int finalDia = Math.max(Math.max(leftDia.dia, rightDia.dia) , leftDia.height+ rightDia.height +1);
        int height= Math.max(leftDia.height, rightDia.height) + 1;

        return new info(finalDia,height);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean isIdentical(node node , node subnode){
        //checking each and every single node of both node and subnode so we have to check for each left and right.
        if(node == null && subnode == null){return true;
        } else if(node == null || subnode == null || node.data != subnode.data){return false;}

        if(!isIdentical(node.lc , subnode.lc)){ return false;}
        if(!isIdentical(node.rc , subnode.rc)){ return false;}

        return true;
    }

    static boolean isSubtree(node node , node subnode){
        if(node == null){
            return false;
        }
        if(node.data == subnode.data){
            if(isIdentical(node,subnode)){
                return true;
            }
        }
        return isSubtree(node.lc , subnode) || isSubtree(node.rc , subnode);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static class infoView{
        node node;
        int HD;
        infoView(node node , int HD){
            this.node = node;
            this.HD = HD;
        }
    }

    static void topView(node node){

        if(node == null){
            return;
        }
        int min = 0 , max = 0;
        Queue<infoView> q1 = new LinkedList<>();
        q1.add(new infoView(node,0)); q1.add(null);
        HashMap<Integer,node> map = new HashMap<>();

        while(!q1.isEmpty()){
            infoView currNode = q1.remove();
            if(currNode==null){
                if(q1.isEmpty()){
                    break;
                }else {
                    q1.add(null);
                }
            } else{
                if(!map.containsKey(currNode.HD)){
                    map.put(currNode.HD,currNode.node);
                }
                if(currNode.node.lc != null){
                    q1.add(new infoView(currNode.node.lc , currNode.HD-1));
                    min = Math.min(min , currNode.HD-1);
                }
                if(currNode.node.rc != null){
                    q1.add(new infoView(currNode.node.rc , currNode.HD+1));
                    max = Math.max(max , currNode.HD+1 );
                }
            }
        }
        for (int j = min; j <= max ; j++) {
            System.out.print(map.get(j).data+" ");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void kthLvl(node node , int lvl, int i) {
        if(node == null){return;}

        if(lvl == i){
            System.out.print(node.data+" ");
            return; // don't go to further nodes
        }
        kthLvl(node.rc,lvl,i+1);
        kthLvl(node.lc,lvl,i+1);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     static node lca(node node , int n1 , int n2){

        if(node == null || node.data == n1 || node.data == n2){
            return node;
        }

        node leftNode = lca(node.lc , n1 , n2);
        node rightNode = lca(node.rc, n1 , n2);

        if(rightNode == null){return leftNode;}
        if(leftNode == null){return rightNode;}


        return node;
     }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     static int lcaDist(node node , int n){
        if(node == null){return -1;}
        if(node.data == n){return 0;}

        int leftDis = lcaDist(node.lc , n);
        int rightDis = lcaDist(node.rc , n);

        if(leftDis == -1 && rightDis == -1){ // means the n does not exist in the left or the right subroots.
            return -1;
        } else if (leftDis == -1) {
            return rightDis+1;
        }else{
            return leftDis+1;
        }

     }
     static int minDist(node node , int n1 , int n2){
        node lca = lca(node , n1 , n2);
        int d1 = lcaDist(lca,n1);
         int d2 = lcaDist(lca,n2);

         return d1+d2;
     }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static int kancestor(node node , int n , int k ){
        if(node == null){
            return -1;
        }
        if(node.data == n){
            return 0;
        }

        int leftDis = kancestor(node.lc , n , k);
        int rightDis = kancestor(node.rc , n , k);


        if(leftDis == -1 && rightDis == -1){
            return -1;
        }
        int max = Math.max(leftDis , rightDis);
        if(max+1 == k){
            System.out.println(node.data);
        }

        return max+1;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static int sumTree(node node){
        if(node == null){
            return 0;
        }

        int leftChild = sumTree(node.lc);
        int rightChild = sumTree(node.rc);
        int data = node.data;


        int newLeft = node.lc == null ? 0 : node.lc.data;
        int newRight = node.rc == null ? 0 : node.rc.data;

        node.data = leftChild + newLeft + rightChild + newRight;

        return data;

    }


    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        node n1 = buildTree(nodes);
//        preOrder(n1);
//        System.out.println();
//        inOrder(n1);
//        System.out.println();
//        postOrder(n1);

//        levelOrder(n1);

//        System.out.println(height(n1));

//        System.out.println(diameter(n1).dia +" "+diameter(n1).height);

        node root = new node(11);
        root.lc = new node(12);
        root.rc = new node(13);
        root.lc.lc = new node(14);
        root.lc.rc = new node(15);
        root.rc.lc = new node(16);
        root.rc.rc = new node(17);

        node root1 = new node(2);
        root1.lc = new node(4);
        root1.rc = new node(5);


//        isSubtree(root,root1);
//        System.out.println(isSubtree(root,root1));
//        isSubtree(root,root1);
//        kthLvl (root , 2,0);

//        System.out.println(lca(root,6,7).data);
//        System.out.println(minDist(root , 4,7 ));
//        System.out.println(lca(root,6,7).data);
//     kancestor(root , 14,2);

        sumTree(root);

        preOrder(root);



    }
}
