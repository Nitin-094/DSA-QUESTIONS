import java.util.*;
public class stackQuestions {

    //printing using pop
    static void printStack(Stack<Integer> s){
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }


//    Q1. push at the bottom of the stack.
    static void pushBottom(Stack<Integer> s , int key){

        if(s.isEmpty()){
            s.push(key);
            return;
        }

        int top = s.pop();
        pushBottom(s,key);
        s.push(top);

    }

    // Q2. reverse a string
    static void revStr(String str){
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i++));
        }


        StringBuilder str1 = new StringBuilder();

        while(!s.isEmpty()){
            str1.append(s.pop());
        }

        System.out.println(str1);
    }


    // Q3. reverse a stack
    static void revStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int a = s.pop();
        revStack(s);
        pushBottom(s,a);

    }

    //Q4. stock Span problem
    static void stockSpan(int[] stocks,int[] span){

        Stack<Integer> s = new Stack<>();

        span[0]=1;   // 1st day span of any stock is one
        s.push(0); // index of 1;

        for (int i = 1; i < stocks.length ; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);s.push(2);s.push(3);s.push(4);

//        pushBottom(s,10);

//        revStack(s);

//        revStr("my name is nitin");



        int[] stocks = {100,80,60,70,60,85,100};
        int[] span = new int[stocks.length];

        stockSpan(stocks,span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }


    }



}
