
public class Test6 {

	public static void main(String[] args) {
		
//		//Arithmetic operator
//         float x = 10f;
//         float y = 20f;
//         
//         float sum =(x + y) ;
//         System.out.println(sum);
//         
//         float sub = x - y ;
//         System.out.println(sub);
//         
//         float mul = x * y ;
//         System.out.println(mul);
//         
//         float div = x / y ;
//         System.out.println(div);
//         
//         int m = 20;
//         int n = 3;
//         
//         int o = m%n;
//         
//         System.out.println(o);
//         
//         int a = 10;
//         
//          // a = a+1;
//           
//           a+=1; //compound operator
//           
//           System.out.println(a);
//         System.out.println();
//           
//           a-=2; //a= a-2;
//           a*=2;
//           a%=3;
//         
//           //Increment and Decrement Operator
//           
//           int v = 10;
//           
//           
//           
//           System.out.println(v++);
//           
//           System.out.println(v);
//           
//           int g = 99;
//           
//       //System.out.println(g--);
//           
//           
//           int l = ++g;
//           System.out.println(l);
//           
//           
//           //Logic Operator
//           
//           //1. And Operator
//           
//           boolean b1 = true;
//           boolean b2 = true;
//           
//           boolean result = b1 && b2;
//           System.out.println(result);
//           
//           
//           //2. Or Operator
//           
//           boolean b3 = true;
//           boolean b4 = false;
//           
//           boolean result1 = b3 || b4;
//           System.out.println(result1);
//           
//           //3. Not operator
//           
//           boolean b5 = true;
//           
//           boolean b6 = !b5;
//           
//           System.out.println(b6);
//           
//           //4.Relational Operator
//           
//           int x1  = 55;
//           int y1  = 55;
//           
//           boolean z = x1>y1;
//           System.out.println(z);
//           
//           
//           System.out.println(x1 != y1);
//           
           
           //5.BitWise Operator
		
		   int x = 100;
		   int y = 110;
		   
		   
		   boolean b = (x++ < y) | (x > y++) ;
           //            true   ||   false
		   
         System.out.println(b);
         
         System.out.println(x);//101
         System.out.println(y);//111
         
         
         int m = 99;
         int n = 98;
         boolean b1 = (++m >= n) && (m <= n--);
                   // 100 >= 98  &&  100 <= 98
                   // true    &&  false
         System.out.println(b1);//false
         System.out.println(m);//100
         System.out.println(n); //97
         
         
         
         int p = 10;
         int q = 11;
         
         boolean b2 = (p == q--) | (++p  >= q++);
             //        10 == 11  &  11 >= 10
         System.out.println(b2);//true
         System.out.println(p);//11
         System.out.println(q); //11
           
          
         int j = 12;
         int k = 12;
         
         boolean b3 = (--j != k--) | (k++  >= j++);
                //    11 != 12   |  ( 11  >= 11 )
         System.out.println(b3);//true
         System.out.println(j);//12
         System.out.println(k); //12       
           
           
           
           
           
	}

}