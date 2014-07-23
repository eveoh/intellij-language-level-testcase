package eight;

import seven.A;

import java.util.Collection;

/**
 * Created by mark on 23/07/14.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        a.stream().forEach(System.out::println);
        Collection<String> b = a;
        b.stream().forEach(System.out::println);
    }
}
