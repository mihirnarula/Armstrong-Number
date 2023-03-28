/*
Armstrong number: 
a number that is the sum of its own digits each raised to the power of the number of digits
*/
package armnum;
import java.util.*;
public class ArmNUm {

    int n;
    int l;
    
    ArmNUm(int nn){
        n = nn;
    }
    
    int sum_pow(int i){
        int temp = n;
        int sum = 0;
        
        for(int j = 0; j < l; j++){
            int dig = temp % 10;
            int digpow = 1;
                
            for(int k = 0; k < l; k++){
                    digpow = digpow * dig;
                }
            
            temp = temp/10;
            sum = sum + digpow;
        }
        
        return sum;
    }
            
    void isArmstrong(){
        String str = Integer.toString(n);
        l = str.length();
        
       int num = sum_pow(n);
       
       if(n == num)
            System.out.println("Armstrong number");
       else
            System.out.println("not an armstrong number");
        
    }
            
    
    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArmNUm ob = new ArmNUm(x);
        
        ob.isArmstrong();
        
    }
    
}
