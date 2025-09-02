
public class Box<T> {
    private T value;


    public Box(T value) {
        this.value = value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }


    public void displayType() {
        System.out.println("Type of T: " + value.getClass().getName());
    }

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer Value: " + intBox.getValue());
        intBox.displayType();

        Box<String> strBox = new Box<>("Hello Generics");
        System.out.println("String Value: " + strBox.getValue());
        strBox.displayType();


        Box<Double> dblBox = new Box<>(99.99);
        System.out.println("Double Value: " + dblBox.getValue());
        dblBox.displayType();
    }
}
