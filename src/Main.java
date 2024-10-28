import java.util.*;
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
    private ArrayList<T> _thing; // the T here
    public Stuff() {
        _thing = new ArrayList<T>();
    }
    public Stuff(int size) {
        _thing = new ArrayList<T>(size);
    }
//    public void setThing(T thing) {
//        _thing = thing;
//    }
//    public T getThing() {
//        return _thing;
//    }
    public void addItem(T t) {
        _thing.add(t);
    }
    public T removeItem(int idx) {
        if(idx >= 0 && idx < _thing.size()) {
            T removed = _thing.remove(idx);
            return removed;
        }
        return null;
    }
    public boolean findItem(T t) {
        boolean found = false;
        int i = 0;
        while(i < _thing.size() && !found) {
            if(_thing.get(i).equals(t))
                found = true;
            i++;
        }
        return found;
    }
    public void printItems() {

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
        Stuff<Test> s2 = new Stuff<Test>(5);
        s.addItem(new Test(3));
        Test t = new Test(3);
        System.out.println(s.findItem(t));
    }
}