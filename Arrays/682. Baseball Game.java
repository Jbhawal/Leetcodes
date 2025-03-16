public class Baseball{
    public static int calPoints(String[] operations) {
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
                    if(top>=0) top--;
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
    
    public static void main(String[] args) {
        String[] ops = {"36","28","70","65","C","+","33","-46","84","C"};  //expected 219, giving 303.
        int result = calPoints(ops);
        System.out.println("The final sum is: " + result);
    }
}