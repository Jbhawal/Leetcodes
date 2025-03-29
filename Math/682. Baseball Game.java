class Solution {
    public int calPoints(String[] operations) {
        int top= -1;
        int sum=0, finalSum=0;
        int temp;
        int n= operations.length;
        int[] stack = new int[n];
        for (int i=0; i<n; i++){
            if(operations[i].equals("+")){
                if(top>=1){
                    int first= stack[top--];
                    int second= stack[top++];
                    sum = first+second;
                    stack[++top]=sum;
                }
            }
            else if(operations[i].equals("C")){
                 top--;
            }
            else if(operations[i].equals("D")){
                if(top>=0){
                    temp = 2* stack[top];
                    stack[++top]= temp; 
                }
            }
            else{
                stack[++top]= Integer.parseInt(operations[i]);
            }
        }
        if(top<0) return 0;
        for(int j=0; j<=top; j++){
            finalSum+= stack[j];    
        }
        return finalSum;
    }
}