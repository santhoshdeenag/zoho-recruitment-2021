import java.util.*;
import java.lang.*;
public class PatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int mid=str.length()/2;
		int l=mid;
		int count=0;
        rows=str.length();
        for(int j=0;j < rows;j++){
            for(int i=0;i <rows-j;i++){
                System.out.print("  ");
            }
            
            if(count<mid+2){
            for(int k=0;k<j; k++){
                System.out.print(str.charAt(l)+" ");
                l++;
                
            }
            count++;
            }
            l=mid;
            System.out.println();
        }

	}

}
