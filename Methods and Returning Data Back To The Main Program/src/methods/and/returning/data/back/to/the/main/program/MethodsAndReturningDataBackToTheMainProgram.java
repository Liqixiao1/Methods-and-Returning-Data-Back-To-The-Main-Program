/*
 *Lee Li at 26/11/2018
 */

package methods.and.returning.data.back.to.the.main.program;

/**
 *
 * @author Lee
 */
import java.util.Scanner;

public class MethodsAndReturningDataBackToTheMainProgram {

    /**
     * @param Value1
     * @param Value2
     * @param Value3
     * @param Value4  
     
    
     */
    public static void AveragesOfUser(int Value1,int Value2,int Value3,int Value4)
    {
        
        int Averages = (Value1 + Value2 + Value3 + Value4)/4;
        System.out.println("");
        System.out.println("This is your Averages "+ Averages);
        
        
    }
    
    public static void AreaCalculation(int width,int length,int high,int bottom)
    {   
        if (high == 0)
        {
          int Area = width * length; 
          System.out.println("The area of this Triangle/Square is "+ Area);
        }
        else if (high > 0)
        {
          int Area = (bottom * high)/2; 
          System.out.println("The area of this Triangle/Square is "+ Area);
        }
    }
    
    public static void IncomeTaxescalculation(double thing,double Taxes)
    {
        Taxes = 0.13;
        double incometaxes = Taxes * thing;
        
        System.out.println("The Income Taxes is "+ incometaxes);
    }
    
    public static void SmipluCalculation (int num1, int num2)
    {
        int Answer = num1 - num2;
        
        System.out.println("The Answer is "+ Answer);
    }
    
    public static void Sumcalculation (int n1,int n2)
    {
        int Answer = n1 + n2;
        
        System.out.println("The Answer of Sum is "+ Answer);
    }
           
         
    public static void main(String[] args) 
    {
        Scanner keyedInput = new Scanner(System.in);
        
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        int useranswer;
        
        useranswer = keyedInput.nextInt();
        
        if (useranswer == 1)
        {
           System.out.println("Please enter your first value");
           int Value1; 
           Value1 = keyedInput.nextInt();
           
           System.out.println("Please enter your second value");
           int Value2;
           Value2 = keyedInput.nextInt();
           
           System.out.println("Please enter your third value");
           int Value3;
           Value3 = keyedInput.nextInt();
           
           System.out.println("Please enter your fourth value");
           int Value4;
           Value4 = keyedInput.nextInt();
           
           AveragesOfUser (Value1,Value2,Value3,Value4);
           
           System.out.println("");
           
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply Calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        useranswer = keyedInput.nextInt();
           
        }
        else if (useranswer == 2)
        {
           System.out.println("Please enter the high");
           int high;
           high = keyedInput.nextInt();
           
           System.out.println("Please enter the width");
           int width;
           width = keyedInput.nextInt();
           
           System.out.println("Please enter your length");
           int length;
           length = keyedInput.nextInt();
           
           System.out.println("Please enter your bottom");
           int bottom;
           bottom = keyedInput.nextInt();
           
           AreaCalculation (high,width,length,bottom);
           
           System.out.println("");
           
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply Calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        useranswer = keyedInput.nextInt();
        
        }
        else if (useranswer == 3 )
        {
          System.out.println("Please enter the Value of your thing");
          double thing;
          thing = keyedInput.nextInt();
          
          double Taxes = 0.13;
          
          IncomeTaxescalculation(thing,Taxes);
          
          System.out.println("");
          
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply Calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        useranswer = keyedInput.nextInt();
        
        }
        else if(useranswer == 4)
        {
          System.out.println("Please enter your First num "); 
          int N1;
          N1 = keyedInput.nextInt();
          
          System.out.println("Please enter your Second num ");
          int N2;
          N2 = keyedInput.nextInt();
          
             Sumcalculation (N1,N2);
             
             System.out.println("");
          
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply Calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        useranswer = keyedInput.nextInt();
          
        }
        else if (useranswer == 6)
        {
            System.out.println("You will leave out of this Program");
            
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
          
        System.out.println("-----User Menu-----");
        System.out.println("");
        System.out.println("1. Averages calculation");
        System.out.println("2. Area calculation");
        System.out.println("3. Income Taxes calculation");
        System.out.println("4. Smiply Calculation");
        System.out.println("5. Sum calculation");
        System.out.println("6. Exit");
        System.out.println("");
        
        System.out.println("Please enter your choice");
        
        useranswer = keyedInput.nextInt();
            
        }
    }
    

   

    
    }

    
    

