class Gen<T>{
T ob;
Gen(T ob1){
ob = ob1;
}
void disp(){
System.out.println("ob= "+ob);

}
void showType(){
System.out.println("Type of T:  "+ ob.getClass().getName());
}
}
public class MandCgeneric{
public static void main(String args[]){
Gen<Double> a=new Gen<Double>(2.2);
a.disp();
a.showType();
}
}