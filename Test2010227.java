
// Ternary operator example (Instead of if-else statement we can use Ternary operators)
class Test2010227 {
public static void main(String[] args) {
int m1=85, m2=34, m3=60;
 int sum=m1+m2+m3;
 double average=sum/3;
 System.out.println("Total marks: "+sum);
 System.out.println("Average of the Student:"+average);
 /*if(average>90){
	 System.out.println("A");
	}else if(average>75) {
		 System.out.println("B");
		}else if(average>50){
			 System.out.println("C");
		}else {System.out.println("D");}*/
String result=m1>=35&&m2>=35&&m3>=35?"Passed":"Failed";
String Grade=average>90?"A":average>75?"B":average>50?"C":"D";
		System.out.println(Grade);
		System.out.println(result);
}
}
