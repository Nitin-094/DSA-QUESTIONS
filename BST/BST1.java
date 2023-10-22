import java.util.*;

public class BST1 {

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



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //root.left = insert(root.left , val) -> it will insert the required value in the left side of the bst and will return a ptr of leftsubtree which is stored in root.left

    static node createBST(node node, int values){
    if(node == null){
        return new node(values); //  Create and return a new node with a given data.
    }

    if(node.data > values){
        node.lc = createBST(node.lc, values); // calling the function on the left child of the node.
    }else{
        node.rc = createBST(node.rc , values); // calling the function on the right child of the node.
    }

    return node;
    }

    static void inOrder(node node){
        if(node == null){return;}

        inOrder(node.lc);
        System.out.print(node.data +" ");
        inOrder(node.rc);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static boolean binarySearch(node node , int key){

        if(node == null){
            return false;
        }
        if(node.data == key){
            return true;
        }


        if(node.data > key){
            return binarySearch(node.lc , key); // send to parent
        }else{
            return binarySearch(node.rc , key); // send to parent
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void printRange(node node , int k1 , int k2){
        if(node == null){
            return;
        }
        if(node.data >= k1 && node.data <= k2){
            printRange(node.lc,k1,k2);
            System.out.print(node.data+" ");
            printRange(node.rc,k1,k2);
        } else if (node.data < k1) {
            printRange(node.lc , k1,k2);
        }else{
            printRange(node.rc , k1,k2);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static node deleteNode(node node , int n){
        // reach subTree node
        if(n < node.data){
            node.lc = deleteNode(node.lc , n);
        } else if (n > node.data) {
            node.rc = deleteNode(node.rc , n);
        }
        else{
            // case 1 - no child
         if(node.lc == null && node.rc == null){
             return null;
         }
            // case 2 - single child
         if(node.lc == null){
             return node.rc;
         } else if (node.rc == null) {
           return node.lc;
         }
            // case 3 - two child
         // find the inorder successor and replace it with n
            node IS = findInoderSuccessor(node.rc);
            node.data = IS.data; // replace the data of node with that of inorder successor.
            node.rc = deleteNode(node.rc , IS.data); // after replacing delete the inorder successor.
        }
        return node;
    }

    static node findInoderSuccessor(node node){
        if(node == null){
            return null;
        }
        while(node.lc != null){
            node = node.lc;
        }
        return node;
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void leafPaths(node node , ArrayList<Integer> l1){
        if(node == null){
            return;
        }
        l1.add(node.data);
        if(node.lc == null && node.rc == null){
            for (int i = 0; i < l1.size(); i++) {
                System.out.print(l1.get(i)+"->");
            }
            System.out.println("N");
        }
        leafPaths(node.lc,l1);
        leafPaths(node.rc,l1);

        l1.remove(l1.size()-1);

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static boolean isValidBST(node node , node max , node min){
        if(node == null){
            return true; // if node is null , only null in the BST then its already a BST
        }

        if(min != null && node.data <= min.data){
            return false;
        }
        if(max != null && node.data >= max.data){
            return false;
        }

        return isValidBST(node.lc , node , min) && isValidBST(node.rc , max , node) ;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static node mirror(node node){
        if(node == null){
            return null;
        }

        node leftS = mirror(node.lc);
        node rightSS = mirror(node.rc);

        node.lc = rightSS;
        node.rc = leftS;

        return node;
    }


    public static void main(String[] args) {

        int[] values = {8,5,3,1,4,6,10,11,14};
        node root = null;
        for (int i = 0; i < values.length; i++) {
           root =  createBST(root,values[i]);
        }

//        inOrder(root);

//        System.out.println(binarySearch(root , 1));

//        printRange(root , 6 ,12);

//        deleteNode(root , 5);
//        System.out.println();
//        inOrder(root);

//        leafPaths(root,new ArrayList<>());

//        System.out.println(isValidBST(root,null,null));

        inOrder(root);
        mirror(root);
        System.out.println();
        inOrder(root);

    }
}
