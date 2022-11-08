/*we want display the grades 
average >90 --> A
Average >75 --> B
Average>50 -->  C
		<50 -->D*/
class Test2010226 {
public static void main(String[] args) {
int m1=75, m2=95, m3=50;
 int sum=m1+m2+m3;
 double average=sum/3;
 System.out.println("Total marks: "+sum);
 System.out.println("Average of the Student:"+average);
 if(average>90){
	 System.out.println("A");
	}else if(average>75) {
		 System.out.println("B");
		}else if(average>50){
			 System.out.println("C");
		}else {System.out.println("D");}
}
}