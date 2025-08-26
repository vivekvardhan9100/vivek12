class Gen< T,V >{
T ob1;
V ob2;
Gen(T o1,V o2){
ob1=o1;
ob2=o2;
}
T getOb1()
{
return ob1;
}
V getOb2(){
return ob2;
}
void showOb1Type(){
System.out.println("Type of T: "+ ob1.getClass().getName());
}
void showOb2Type(){
System.out.println("Type of T: " + ob2.getClass().getName());
}
}
public class GenWith2Params{
public static void main(String[] args){
Gen <Integer,Double> o1=new Gen<Integer,Double>(233,10.5);
System.out.println(o1.getOb1());
System.out.println(o1.getOb2());
o1.showOb1Type();
o1.showOb2Type();
}

}