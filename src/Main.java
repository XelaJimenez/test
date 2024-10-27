class Test {
    int _x;
    public Test() {
        _x = 0;
    }
    public Test(int x) {
        _x = x;
    }
    public void setX(int x) {
        _x = x;
    }
    public int getX() {
        return _x;
    }

}
class Test2 {
    int _y;
    public Test2() {
        _y = 0;
    }
    public Test2(int y) {
        _y = y;
    }
    public void setY(int y) {
        _y = y;
    }
    public int getY() {
        return _y;
    }
}
class Stuff<T>  { // the T here will match the
    private T _thing; // the T here
    public Stuff() {
        _thing = null;
    }
    public Stuff(T t) {
        _thing = t;
    }
    public void setThing(T thing) {
        _thing = thing;
    }
    public T getThing() {
        return _thing;
    }
    public void print() {
        if (_thing != null)
            System.out.println("Type: " + _thing.getClass().getName() + ", value: " + _thing);
        else
            System.out.println("Nullllll");
    }
}
public class Main {
    public static void main(String[] args) {
        Stuff<Test> s = new Stuff<Test>(); // instanciating a thing called stuff that can hold a test obj
        s.print();
        s.setThing(new Test(5));
        s.print();
        System.out.println(s.getThing().getX());
    }
}