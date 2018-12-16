import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Task2_3 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. пункт 'c'
        Iterator<Cat> iterator = cats.iterator();
        iterator.next();
        iterator.remove();

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. пункт 'b'
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());

        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // пункт 'd'
        for (Cat cat: cats)
            System.out.println(cat);
    }

    // пункт 'a'
    public static class Cat {

    }
}