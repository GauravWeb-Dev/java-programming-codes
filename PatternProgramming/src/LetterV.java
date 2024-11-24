
public class LetterV {
	public static void main(String[] args){
	
    
	int n=10;
    int x = 1;
    int y = n * 2 - 1;
       
     for (int i = 0; i < n; i++){
       for (int j = 0; j < n * 2; j++){
         if (j == x || j == y){
           System.out.print("*");
         }
         else{
           System.out.print(" ");
         }
       }
       x++;
       y--;
       System.out.println("");
     }        
}
}
