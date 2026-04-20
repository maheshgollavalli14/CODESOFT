import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int total=0;
        System.out.print("Enter no of subjects");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter subject marks obtained");
        for( int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Subject "+i+" marks obtained by student :"+a[i]);
            total=total+a[i];
        }
        double avg=(double)total / n;
        char grade;
        if(avg<=100 && avg>=90){
            grade='A';
        }
        else if(avg<=90 && avg>=80){
            grade='B';
        }
        else if(avg<=70 && avg >=80){
            grade='C';
        }
        else if(avg<=60 && avg>=70){
            grade='D';
        }
        else if(avg<=50 && avg>=60){
            grade='E';
        
        }
        else {
            grade='F';
        }
        System.out.println("\n *** RESULTS***");
        System.out.println("TOTAL MARKS OBTAINED BY STUDENT:"+total);
        System.out.println("AVG MARKS OBTAINED BY STUDENT :"+avg);
        System.out.println("GRADE SCORED :"+grade);
    }
}