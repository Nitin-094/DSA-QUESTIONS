public class LinkedList {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

//        l1.addFirst(1);
//        l1.addFirst(2);

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(1);
//        l1.addMiddle(3,2);
//        l1.print();
        System.out.println();
//        l1.findAndRemoveEnd(2);
//        l1.removeFirst();
//        l1.removeLast();
//            l1.reverseLL();
//        l1.addMiddle(44,1);
//        l1.removeFirst();
        l1.print();
        System.out.println();

        LLpalindrome();



        System.out.println();
//        System.out.println(l1.recSearch(10));
//        System.out.println("Size - "+l1.size);

    }
    public static class Node{
        int data;
        Node next; //empty connection , linkage
        Node(int data1){
            this.data = data1;
            this.next = null;
        }
    }
    //Properties are defined of Node class.
    public static Node head;
    public static Node tail;
    public static int size; // by default size of this is 0.
    // We will make calls using non-static functions using object to a class.
    static void addFirst(int data){


        //step1 - creating new node
        Node newNode = new Node(data);
        size++;
        // if my LinkedList is empty.
        if (head == null){
            head = tail = newNode;
        }
        //step2 - newNode next = head
        newNode.next = head; // next ke andar head ka address/refrence store ho gya hai.
        //step3 - head = newNode.
        head = newNode;


    }
    static void addLast(int data){

        Node n1 = new Node(data);
        size++;

        if (head == null){
            head = tail = n1;
        }

        tail.next = n1;
        tail = n1;

    }

    static void print(){

        Node temp = head;
//        if (temp == null){
//            System.out.println("EMPTY");
//            return;
//        }

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        if (head == null){
            System.out.println("EMPTY");
        }

    }


    static void addMiddle(int data ,int index){

        Node temp = head;
        int i = 0;
        while(i<index -1){
            temp = temp.next;
            i++;
        }

        Node n1 = new Node(data);
        size++;
        n1.next = temp.next;
        temp.next = n1;


    }

    public static void removeFirst(){

        if (size == 0){
            System.out.println("empty");
        }
        if (size == 1){
            head = tail = null;
        }
        head = head.next;
        size--;

    }

    public static void removeLast(){

        if(size == 0){
            System.out.println("EMPTY");
        }
        if(size == 1){
            head = tail = null;
        }


        Node prev = head;
        int i =0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }

        prev.next = null;
        tail = prev;
        size--;


    }


    public static int helper(Node head , int key){

        if (head == null) return -1;

        if (head.data == key) return 0;

        int idx = helper(head.next , key);

        if (idx == -1) return -1;

        return idx+1;

    }

    public static int recSearch(int key){
        return helper(head,key);
    }


    public static void reverseLL(){

        Node prev = null;
        Node curr = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
         head = prev;
    }

    public static void findAndRemoveEnd(int n){

        if (size == n){ // remove first
            head = head.next;
            return;
        }

        int size1 = size - n-1;
        Node prev = head;
        int i = 0;

        while(i<size1){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
//        return;
    }


     public static void LLpalindrome(){
        int[] arr = new int[size];
        Node temp = head;
        int i=0;
        while(temp != null){

            arr[i]=temp.data;
            i++;
            temp = temp.next;
        }
        palin(arr);
     }
     public static boolean palin(int[] arr){
         for (int j = 0; j < arr.length/2; j++) {
             if(arr[j] != arr[arr.length-1-j]){
                 System.out.println("NOT PALINDROME");
                 return false;
             }
         }
         System.out.println("palindrome");
    return true;
    }
}