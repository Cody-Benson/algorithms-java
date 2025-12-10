package palindrome;
public class Solution {
    
    public Solution(){}

    public boolean isPalindrome(String word){
        int leftPos = 0;
        int rightPos =word.length()-1;

        while(leftPos < rightPos){
            if(word.charAt(leftPos) != word.charAt(rightPos)){
                return false;
            }
            leftPos++;
            rightPos--;
        }
        return true;
    }
}