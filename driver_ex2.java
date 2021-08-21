
import java.io.*;  // import input and outputs


class LinkedNode {
    public int x;
    public LinkedNode next;
    public LinkedNode(int a){
         x = a;       
    }
}
class LinkedStack {
LinkedNode front; 
int count;        

// initialize front and count variables 
LinkedStack() {
front = null;
count = 0;
}

// push or insert method
void push(int x) {
    LinkedNode newNode = new LinkedNode(x); // create an object to LinkedNode 
    newNode.next = front;
    front = newNode;
    count++;  // increment count for each time we insert a new value 
}

// pop (or) delete method
int pop() {
int x = front.x;
front = front.next;
count--;    // decrement the count value for each pop 
return x;
}


int peek() {
return front.x;
}

// check that list is empty or not 
boolean isEmpty() {
return front==null; 
}


int size() {
return count;
}

public String toString() {
String str = "";

LinkedNode cur = front;
while (cur!=null) {
   str += cur.x + " ";
   cur = cur.next;
}

return str;
}
// method to remove bottom Half off values in the stack
void removeBottomHlf(){

   LinkedNode cur = front;
   int size = count;
  
   while (size > (count/2+1)){
       cur = cur.next;
       size--;
   }
   cur.next = null;
  
}
}

public class driver_ex2{
   public static void main(String[] args){
        LinkedStack st = new LinkedStack();
        for (int i = 0; i<10; i++)
            st.push(i);
        st.removeBottomHlf();
        System.out.println(st.toString());
        
   }

}

