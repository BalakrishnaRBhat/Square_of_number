public class square
{
    public static void main(String[] args) throws Exception {
        long num = 0;
        try {
        num = Long.parseLong(args[0]);//Covert command line argument to Integer 
            
        } catch (Exception e) {
            System.out.println("Enter a valid integer");
            System.exit(1);
        }
        
        String str = Long.toBinaryString(num);//Convert integer num to Binary String
        int len = str.length();
        long arr[] = new long[len];
        arr[0] = num;//store num at index 0
        long square = 0;
        int i,j;
        long temp;
        //store rest of array with sum of the previous element with itself
        for(i = 0;i<len-1;i++){
            arr[i+1] = arr[i]+arr[i];  
        }
        j = i;
        i = 0;
        //reverse the array
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //Compute square of num
        for(int x = 0;x<len;x++){
        if(str.charAt(x) == '1')
        {
                square = square+arr[x];
        }

        }
        //Print the square of num
        System.out.println("Square of "+num+" = "+square);         
        }
        
    }
