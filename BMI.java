import java.util.Scanner;
class BMI{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String membername;
        int weight;
        float height;

        System.out.print("Enter membername:");
        membername = sc.nextLine();

        System.out.print("Enter weight in kg:");
        weight = sc.nextInt();

        System.out.print ("Enter height in meters:");
        height = sc.nextFloat();

        System.out.println("***FITNESS REPORT***");
        System.out.println("membername:"+membername);
        System.out.println("weight:"+weight+" kg");
        System.out.println("height:"+height+" m");
        System.out.println("BMI:"+weight/(height*height));
         sc.close();
    

    }

}