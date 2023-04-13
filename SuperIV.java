class shape{
String name="circle";
}
class size extends shape{
String name="No Size";
void print(){
System.out.println(name);
System.out.println(super.name);
}
}
class SuperIV{
public static void main(String[] args){
Size obj=new Size();
obj.print();
}}