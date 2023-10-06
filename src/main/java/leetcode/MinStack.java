package leetcode;

import java.util.Stack;

public class MinStack extends Stack<Integer> {
     private final Stack<Integer> minimums = new Stack<>();

     @Override
     public Integer push(Integer value){
         if(isEmpty() || minimums.peek() > value){
             minimums.push(value);
         }
         else{
             minimums.push(minimums.peek());
         }
         return super.push(value);
     }

     @Override
     public Integer pop(){
         minimums.pop();
         return super.pop();
     }

    public Integer getMinimum() {
        return minimums.peek();
    }

}
