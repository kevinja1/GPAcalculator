import java.util.*;
/**
 * Write a description of class Gradehelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gradehelp
{
    public static void main(String[] args)

    {
    Scanner input = new Scanner(System.in);
        System.out.println("Are you here to calculate your GPA?");
       
            
            if(input.next().equals("yes"))
            {
           
                System.out.println("Cartooning: ");
                double cartooning = input.nextDouble();
                long cartooningr = Math.round(cartooning);
        
                System.out.println("Social Studies: ");
                double ss= input.nextDouble();
                long ssr = Math.round(ss);
        
                System.out.println("Math Analysis: ");
                double analysis = input.nextDouble();
                long analysisr = Math.round(analysis);
        
                System.out.println("Computer Science: ");
                double compsci = input.nextDouble();
                long compscir = Math.round(compsci);
        
                System.out.println("Physics: ");
                double physics = input.nextDouble();
                long physicsr = Math.round(physics);
        
                System.out.println("Cad: ");
                double cad = input.nextDouble();
                long cadr = Math.round(cad);
       
                System.out.println("English: ");
                double english = input.nextDouble();
                long englishr = Math.round(english);
        
                System.out.println("Spanish: ");
                double spanish = input.nextDouble();
                long spanishr = Math.round(spanish);
        
                System.out.println("Gym: ");
                double health = input.nextDouble();
                long healthr = Math.round(health);
        
        System.out.println("Your GPA is: " + (cartooningr + ssr + 5 + analysisr + 5 + compscir + 10 + physicsr + 10 + cadr + 5 + englishr + 5 + spanishr + healthr) / 9.0);
        }
        
        
        System.out.println("What subject do you want to calculate with?");
        String subject = input.next();
        if (subject.equals("physics") || subject.equals("Physics"))
        {
           double homework;
           double homeworkavg;
           double homeworktotal=0;
           double classwork;
           double classworkavg;
           double classworktotal=0;
           double lab;
           double labavg;
           double labtotal=0;
           double quiz;
           double quizavg;
           double quiztotal=0;
           double test;
           double testavg;
           double testtotal=0;
           int numiter = 1;
           int numiter2 = 1;
           int numiter3 = 1;
           int numiter4 = 1;
           int numiter5 = 1;
           double totalavg = 0;
           
            System.out.println("how many quizzes have you had?");
               quiz = input.nextDouble();
               while ( numiter < quiz +1)
               {
                   System.out.println("What were you grades for quiz #" + numiter);
                   quiztotal = input.nextDouble() + quiztotal;
                   numiter++;
               }
               quizavg = quiztotal/quiz;
               
               System.out.println("how many tests have you had?");
               test = input.nextDouble();
               while ( numiter2 < test +1)
               {
                   System.out.println("What were you grades for test #" + numiter2);
                   testtotal = input.nextDouble() + testtotal;
                   numiter2++;
               }
               testavg = testtotal/test;
               
               System.out.println("how many labs have you had?");
               lab = input.nextDouble();
               while ( numiter3 < lab +1)
               {
                   System.out.println("What were you grades for lab #" + numiter3);
                   labtotal = input.nextDouble() + labtotal;
                   numiter3++;
               }
               labavg = labtotal/lab;
               
               System.out.println("how many classworks have you had?");
               classwork = input.nextDouble();
               while ( numiter4 < classwork +1)
               {
                   System.out.println("What were you grades for classwork #" + numiter4);
                   classworktotal = input.nextDouble() + classworktotal;
                   numiter4++;
               }
               classworkavg = classworktotal/classwork;
               
               System.out.println("how many homework have you had?");
               homework = input.nextDouble();
               while ( numiter5 < homework +1)
               {
                   System.out.println("What were you grades for homework #" + numiter5);
                   homeworktotal = input.nextDouble() + homeworktotal;
                   numiter5++;
               }
               homeworkavg = homeworktotal/homework;
               totalavg = (0.45*testavg) + (0.25*quizavg) + (0.15*labavg) + (.075*homeworkavg)+(.075*classworkavg);
               System.out.println("Your physics average is " + totalavg);
              
               
               System.out.println("What would you like your average to be?");
               double wish = input.nextDouble();
               double nextpoint;
               System.out.println("What is your next assignment?");
               String assignment = input.next();
               if(assignment.equals("quiz"))
               {
                   nextpoint = ((wish-0.15*labavg-0.075*classworkavg-0.075*homeworkavg-0.45*testavg)*(quiz+1))/0.25-quiztotal;
                   if (nextpoint <= 100)
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment");
                   }
                   else 
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment although it is impossible");
                   }
               }
               else if(assignment.equals("test"))
               {
                   nextpoint = ((wish-0.15*labavg-0.075*classworkavg-0.075*homeworkavg-0.25*quizavg)*(test+1))/0.45-testtotal;
                   if (nextpoint <= 100)
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment");
                   }
                   else 
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment although it is impossible");
                   }
               }
               else if(assignment.equals("classwork")) 
               {
                   nextpoint = ((wish-0.15*labavg-0.25*quizavg-0.075*homeworkavg-0.45*testavg)*(classwork+1))/0.075-classworktotal;
                   if (nextpoint <= 100)
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment");
                   }
                   else 
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment although it is impossible");
                   }
               }
               else if(assignment.equals("lab")) 
               {
                   nextpoint = ((wish-0.25*quizavg-0.075*classworkavg-0.075*homeworkavg-0.45*testavg)*(lab+1))/0.15-labtotal;
                   if (nextpoint <= 100)
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment");
                   }
                   else 
                   {
                       System.out.println("You need a " + nextpoint + " on your next assignment although it is impossible");
                   }
               }
               else if(assignment.equals("homework")) 
               {
                  nextpoint = ((wish-0.15*labavg-0.25*quizavg-0.075*classworkavg-0.45*testavg)*(homework+1))/0.075-homeworktotal;
                  if (nextpoint <= 100)
                  {
                      System.out.println("You need a " + nextpoint + " on your next assignment");
                  }
                  else 
                  {
                      System.out.println("You need a " + nextpoint + " on your next assignment although it is impossible");
                  }
               }
        }
        else if(subject.equals("socialstudies") || subject.equals("cad") || subject.equals("english") || subject.equals("math")
        || subject.equals("gym") || subject.equals("spanish") || subject.equals("compsci") || subject.equals("cartooning"))
        {
            int exit = 1;
            double total_possible = 0;
            double totalachieved = 0;
            double average;
            int numit=1;
            while (exit != 0)
            {
                System.out.println("What was assignment number " + numit + " out of?");
                total_possible = input.nextDouble() + total_possible;
                System.out.println("How many points did you earn out of the total");
                totalachieved = input.nextDouble() + totalachieved;
                System.out.println("Is this it? if yes, type 0, else type 1");
                if (input.nextInt()==0)
                {
                    exit = 0;
                }
                numit++;
            }
            average = totalachieved / total_possible;
            System.out.println("Your average is " + average*100 + " percent");
            System.out.println("What would you like your average to be?");
            double wish = input.nextDouble();
            System.out.println("How many points is your next assignment out of?");
            double nextpoint = input.nextDouble();
            double nextgrade = (wish*(total_possible + nextpoint)) / 100 - totalachieved;
            double nextpercent = (nextgrade/nextpoint)*100;
            if (nextgrade >= 100)
            {
                System.out.println("Your wish is not possible but anyway you would need to earn a " + nextpercent + " percent \n" +"You would need a " + 
                nextpercent+ " which is a " + nextgrade +" out of " + nextpoint);

            }
            else
            {
                System.out.println("You need to earn a " + nextgrade + " out of " + nextpoint + "\n"+
                "which is a " + nextpercent + "percent");

            }
           
        }
      
    
   
}
}
