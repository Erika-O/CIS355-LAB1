public class HealthProfile
{
   //instance variable declaration
   String name;
   int age;
   double weight;
   double height;

   //default constructor, initialize instance variable
   public HealthProfile()
   {
       name="";
       age=0;
       weight=0.0;
       height=0.0;
   }

   //method to set the name
   public void setName(String strName)
   {
       name=strName;
   }

   //method to set the age
   public void setAge(int a)
   {
       age=a;
   }

   //method to set the weight
   public void setWeight(double wt)
   {
       weight=wt;
   }

   //method to set the height
   public void setHeight(double ft, double inch)
   {
       //convert feet to inches and add the inches and set to height
       height=(ft*12)+inch;
   }

   //method that returns name
   public String getName()
   {
       return name;
   }

   //method that returns age
   public int getAge()
   {
       return age;
   }

   //method that returns weight
   public double getWeight()
   {
       return weight;
   }

   //method that returns height
   public double getHeight()
   {
       return height;
   }

   //method that returns bmi
   public double getBMI()
   {
       double bmi;

       //calculate and return bmi
       bmi = (weight * 703) / (height * height);
       return bmi;
   }

   //method that returns category
   public String getCategory(double BMI)
   {
       //if bmi is less than 18.5 return underweight
       if(BMI<18.5)
           return "Underweight";
       //if bmi is between 18.5 and 25 return normal
       else if(BMI>=18.5 && BMI<25)
           return"Normal";
       //if bmi is between 25 and 30 return overweight
       else if(BMI>=25 && BMI<30)
           return "Overweight";
       //else return obese
       else
           return "Obese";
   }

   //method that returns maximum heart rate
   public int getMaxHR()
   {
       //return 220 minus age
       return (220-age);
   }

}
