import java.text.DecimalFormat;
import java.util.Scanner;

public class HealthProfileTest {

   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       boolean repeat=true;

       String name;
       int age;
       double weight,htFeet,htInches;
       //repeat a loop until user enter X
       do
       {
           //prompt and read the name
           System.out.print("\nEnter name or X to quit: ");
           name=input.nextLine();

           //if user entered x, terminate the program
           if(name.toLowerCase().equals("x"))
           {
               System.out.println("\nGoodbye!");
               repeat=false;
           }
           //else continue
           else
           {
               //prompt and read the age
               System.out.print("Your age: ");
               age=input.nextInt();

               //prompt and read the weight
               System.out.print("Your weight: ");
               weight=input.nextDouble();

               //prompt and read the height in feet
               System.out.print("Your height (feet): ");
               htFeet=input.nextDouble();

               //prompt and read height in inches
               System.out.print("Your height (inches): ");
               htInches=input.nextDouble();

               //create an object for HealthProfile
               HealthProfile healthObj=new HealthProfile();
               //set the name using setName method
               healthObj.setName(name);
               //set the age using setAge method
               healthObj.setAge(age);
               //set the weight using setWeight method
               healthObj.setWeight(weight);
               //set the height using setHeight method
               healthObj.setHeight(htFeet, htInches);

               //get the BMI using getBMI method
               double bmi=healthObj.getBMI();
               DecimalFormat df=new DecimalFormat("0.0");
               //print the results
               //print the name using getName method
               System.out.println("\nHealth Profile for "+healthObj.getName());
               //print the BMI
               System.out.println("BMI: "+ df.format(bmi));
               //print the category using getCategory
               System.out.println("BMI Category: "+healthObj.getCategory(bmi));
               //print the max HR using getMaxHR
               System.out.println("Max heart rate: "+healthObj.getMaxHR());
               input.nextLine();
           }

       }while(repeat);
   }

}
