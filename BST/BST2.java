import java.util.ArrayList;
import java.util.Collections;

public class BST2 {

    static class node{
        int data;
        node lc;
        node rc;
        node(int data){
            this.data= data;
            this.rc = null;
            this.lc = null;
        }
    }



    static node arrayTObst(int[] arr , int si , int ei){

        if(si>ei) return null;

        int mid = (si+ei)/2;

        node root = new node(arr[mid]);
        root.lc = arrayTObst(arr,si,mid-1);
        root.rc = arrayTObst(arr,mid+1 , ei);

        return root;
    }

    static ArrayList<Integer> inorder(node node , ArrayList<Integer> l1){
        if(node == null){
            return new ArrayList<>();
        }

        inorder(node.lc,l1);
//        System.out.print();
        l1.add(node.data);
        inorder(node.rc,l1);

        Collections.sort(l1);
    return l1;
    }




    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};

//        node root =   arrayTObst(arr,0,arr.length-1);
//         inorder(root);

            node root1 = new node(8);
            root1.lc = new node(6);
        root1.lc.lc =  new node(5);
        root1.lc.lc.lc =  new node(3);
        root1.rc = new node(10);
        root1.rc.rc =  new node(11);
        root1.rc.rc.rc =  new node(12);

        ArrayList<Integer> l1 =inorder(root1 , new ArrayList<>());


    }




}
