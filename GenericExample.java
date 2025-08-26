class DisplayValue <T>
{
T t;
DisplayValue(T t){
this.t=t;
}
public void display(){
System.out.println(t);
}
}
public class GenericExample{
public static void main(String args[]){
DisplayValue <Integer> iValue=new DisplayValue<>(25);
iValue.display();
DisplayValue <Double> dValue=new DisplayValue<>(5.5);
dValue.display();
DisplayValue <String> sValue=new DisplayValue<>("Hello");
sValue.display();
}
}