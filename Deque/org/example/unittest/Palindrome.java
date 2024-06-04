package org.example.unittest;

public class Palindrome<T> {
    public boolean isPalindrome(Deque<T> dq){
        Deque<T> dq2 = new Deque<T>(dq);
        while(dq2.size() > 1){
            try{
                T t1 = dq2.popFront();
                T t2 = dq2.popBack();

                if(!t1.equals(t2)){
                    return false;
                }
            }catch(Exception e){
                return false;
            }
        }

        return true;
    }
}