import java.util.ArrayList;
import java.util.Stack;

public class stackBasics {

    public static void main(String[] args) {

//        stack s = new stack(); // done with array list

//        stackLL.stack1 s = new stackLL.stack1(); // done with linked list

        Stack<Integer> s = new Stack<>();

        s.push(1);s.push(2);s.push(3);s.push(4);s.push(5);s.push(6);s.push(7);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }


    }
    //Using ArrayList
    static class stack{

        ArrayList<Integer> s1 = new ArrayList<>();

        boolean isEmpty(){
            return s1.size() == 0;
        }

        void push(int data){
            if(isEmpty()){
                System.out.println("empty");
                return;
            }
            s1.add(data);
        }

        int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = s1.get(s1.size()-1);
            s1.remove(s1.size()-1);
            return top;
        }

        int peek(){
            if(isEmpty()){
                return -1;
            }
            return s1.get(s1.size()-1);
        }


    }

    static class stackLL{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }

        static class stack1 {

            static Node top = null;

            static boolean isEmpty() {
                return top == null;
            }

            static void push(int data) {
                Node n1 = new Node(data);
                if (isEmpty()) {
                    top = n1;
                    return;
                }
                n1.next = top;
                top = n1;

            }

            static int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int d = top.data;
                top = top.next;
                return d;
            }

            static int peek() {
                if (isEmpty()) {
                    return -1;
                }

                int d = top.data;
                return d;
            }
        }
    }
}
