class Solution {
    public int getValue(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; 
        }
    }

    public int romanToInt(String s) {
        int n=s.length();
        int curr=0, prev=0, total=0;
        for(int i=n-1; i>=0; i--){
            curr= getValue(s.charAt(i));
            if(curr<prev){
                total-=curr;
                prev=curr;
            }
            else{
                total+=curr;
                prev=curr;
            }
        }
        return total;
    }
}