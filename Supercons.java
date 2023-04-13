class shape2{
shape2()
{
System.out.println("Hello");
}
}
class Size2 extends Shape2{
Size2(){
super();
System.out.println("hi");
}
}
class Supercons{
public static void main(String[] args){
Size2 obj=new Size2();
}}