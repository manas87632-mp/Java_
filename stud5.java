class stud{
    String name;
    int roll;
    float fee;
    String address;
    stud(String name,int roll,float fee,String address){
        this.name=name;
        this.roll=roll;
        this.fee=fee;
        this.address=address;
    }
    void display(){
        System.out.println(name+" " +roll+" " +fee+" " +address+" ");

    }
}
class stud5{
    public static void main (String args[]){
    stud s1=new stud("ram",200,1000f,"bbsr");
    stud s2=new stud("raj",300,2000f,"ctc");
    stud s3=new stud("dop",400,3000f,"kdp");
    s1.display();
    s2.display();
    s3.display();
    }
}