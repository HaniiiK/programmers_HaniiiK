import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList answer = new ArrayList();
        
        for(int i=0; i<numlist.length; i++) {
            if(numlist[i]%n==0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }
}