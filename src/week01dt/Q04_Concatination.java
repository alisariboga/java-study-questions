package week01dt;

public class Q04_Concatination {

    public static void main(String[] args) {
            /*
         Write a Java program to create a string in the form Str1 + Str2 + Str1 from two strings.
     EXAMPLE:
     INPUT      : Str1 =Refrigerator
                  Str2 = Empty

     OUTPUT :    EmptyRefrigaratorEmpty


     */

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first String");
//        String str1 = scan.next();
//        System.out.println("Enter Second String");
//        String str2 = scan.next();
//        System.out.println(str1+str2+str1);

        System.out.println(2+0+2+1+"TechProEd");
        System.out.println("TechProEd"+2+0+2+1);

        System.out.println(2+0+2+1+"TechProEd"+2+0+2+1);

        String name = "Jack", marks="1";
        String section = "A";
        marks+="230";
        System.out.println("Name: "+ name);// Jack
        System.out.println("Section: "+ section);//Section: A
        System.out.println("Marks: "+ marks);//Marks: 1230




    }
}
