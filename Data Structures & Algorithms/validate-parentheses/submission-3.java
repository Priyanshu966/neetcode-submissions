class Node<T>{
    T val;
    Node<T> next;

    Node(T val){
        this.val = val;
        this.next = null;
    }
    
}


class Stack<T>{
    Node<T> head;
    int size;

    Stack(){
        this.head = null;
        this.size = 0;
    }

    void push(T data){

        Node<T> newNode = new Node<>(data);
        newNode.next = this.head;
        this.head = newNode;
        size++;
    }

    T pop(){
        if(size == 0){
            return null;
        }
        T temp = this.head.val;
        this.head = this.head.next;
        size--;
        return temp;
    }

    boolean isEmpty(){
        return size == 0;
    }

    

    
}

class Solution {
    public boolean isValid(String s) {

        int n = s.length();
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            Character ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }else{
                if(stk.isEmpty()) return false;
                
                char newch = stk.pop();
                if((ch == ')' && newch != '(' )|| (ch == '}' && newch != '{' )|| (ch == ']' && newch != '[')){
                    return false;
                }



                
            }
            

        }



        return stk.isEmpty();

        
    }
}
