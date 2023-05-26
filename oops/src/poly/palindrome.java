package poly;
import capsule.encap;
public class palindrome  {
    public boolean ispal(int n){
        int temp = n;
        int c=0;
        int sum=0;
        while(n>0){
            c = n%10;
            n = n/10;
            sum=sum*10+c;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean ispal(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String s = "";

        // Initializing a new boolean variable for the
        // answe

        for (int i = str.length() - 1; i >= 0; i--) {
            s = s + str.charAt(i);
        }

        // Checking if both the strings are equal
        if (str.equals(s)) {
            return true;
        }
       else{
           return false;
        }
    }
}

