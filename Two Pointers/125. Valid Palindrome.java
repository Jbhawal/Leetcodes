class Solution {
    public boolean isPalindrome(String s) {
        String f=s.toLowerCase();
        int n= f.length();
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(Character.isLetterOrDigit(f.charAt(i))){
                list.add(f.charAt(i));
            }
        }
        int size=list.size();
        int l=0, u=size-1;
        while(l<=u){
            if(list.get(l).equals(list.get(u))){
                l++; 
                u--;
            }
            else return false;
        }
        return true;
    }
}