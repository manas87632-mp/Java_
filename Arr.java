class Arr{
String name;
int roll;
public static void main(String args[]){
Arr s1=new Arr();
s1.name="rama";
s1.roll=100;
Arr s2=new Arr();
s2.name="raja";
s2.roll=200;
Arr stud[]=new Arr[2];
stud[0]=s1;
stud[1]=s2;
for(int i=0;i<stud.length;i++){
System.out.println("stud[i].name+" "+ stud[i].roll+")
}
}
}