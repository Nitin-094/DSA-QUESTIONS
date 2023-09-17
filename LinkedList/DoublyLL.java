public class DoublyLL {
    public static void main(String[] args) {

        DoublyLL dl1 = new DoublyLL();

        dl1.addFirst(3);
        dl1.addFirst(2);
        dl1.addFirst(1);
//        dl1.removeFirst();
        dl1.print();
        System.out.println();
        dl1.reverseDLL();
        dl1.print();
    }

    public class Node{

        int data;
        Node next;
        Node prev;

        public Node(int data1){
            this.data = data1;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;


    public void addFirst(int data){

        Node n1 = new Node(data);
        size++;
        if (head==null){
            head = tail = n1;
            return;
        }

        n1.next = head;
        head.prev = n1;
        head = n1;

    }

    public void print(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }

    public void removeFirst(){
        Node n1 = head;

        if (head == null){
            System.out.println("empty");
        }

        if (size == 1){
            head = tail = n1;
        }

        head = head.next;
        head.prev = null;

    }

    public void reverseDLL(){

        Node prev = null;
        Node curr = head;
        Node next ;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;


    }



}
