//to check whether a linked list is palindrome or not
// ex: 1 -> 2 -> 3 -> 2 -> 1
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;    
        }
        temp=head;
        while(temp!=null){
            if(temp.val!=st.peek()){
                return false;
            }
            st.pop();
            temp=temp.next;
        }
        return true;
    }}
//Time Complexity:O(2*N) 
//space Complexity:O(N) for using stack 
