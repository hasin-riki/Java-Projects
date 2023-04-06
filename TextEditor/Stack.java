package TextEditor;
/**
 * @author Owais
 * @author Mohsin
 * @author Hasin
 */
public class Stack<T>{
    
    StackNode<T> top;
    
    public void PUSH(T c){
        StackNode<T> n=new StackNode(c);
        n.next=top;
        top=n;
    }
    
    public T POP(){
        T temp=null;
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            temp=top.info;
            top=top.next;
        }
        return temp;
    }
    
    public T PEEK(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        return top.info;
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    @Override
    public String toString(){
        StackNode<T> temp=top;
        String message="Linked Stack\n";
        while(temp!=null){
            message=message + temp.info + ", ";
            temp=temp.next;
        }
        return message;
    }
    
}

