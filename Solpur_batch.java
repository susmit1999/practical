class Student{
int stu_id;
String name;
Student (int stu_id,String name){
this.stu_id=stu_id;
this.name=name;
}
}
class Course extends Student{
float cou_fees;
Course(int stu_id,String name,float cou_fees){
super(stu_id,name);
this.cou_fees=cou_fees;
}
void show(){
System.out.println(stu_id+" "+name+" "+cou_fees);
}
}
public class Solpur_batch{
public static void main(String[] args){
Course obj=new Course(1,"smit kshirsagar",2500f);
obj.show();
}
}