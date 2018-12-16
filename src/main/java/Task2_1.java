import java.util.*;

public class Task2_1 {
    public static void main(String[] args) {
        Collection<String> linkedList = new LinkedList<String>();
        System.out.println("LinkedList:");
        System.out.println("add: " + getInsertTime(linkedList));
        System.out.println("contains: " + getSearchTime(linkedList));
        System.out.println("remove: " + getDeleteTime(linkedList));
        Collection<String> arrayList = new ArrayList<String>();
        System.out.print("\n");
        System.out.println("ArrayList:");
        System.out.println("add: " + getInsertTime(arrayList));
        System.out.println("contains: " + getSearchTime(arrayList));
        System.out.println("remove: " + getDeleteTime(arrayList));
        Collection<String> treeSet = new TreeSet<String>();
        System.out.print("\n");
        System.out.println("TreeSet:");
        System.out.println("add: " + getInsertTime(treeSet));
        System.out.println("contains: " + getSearchTime(treeSet));
        System.out.println("remove: " + getDeleteTime(treeSet));
        Collection<String> hashSet = new HashSet<String>();
        System.out.print("\n");
        System.out.println("HashSet:");
        System.out.println("add: " + getInsertTime(hashSet));
        System.out.println("contains: " + getSearchTime(hashSet));
        System.out.println("remove: " + getDeleteTime(hashSet));

    }

    public static long getInsertTime(Collection collection) {
        Date currentTime = new Date();
        insertList(collection);
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        return delay;
    }

    public static long getSearchTime(Collection collection) {
        Date currentTime = new Date();
        searchList(collection);
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        return delay;
    }

    public static long getDeleteTime(Collection collection) {
        Date currentTime = new Date();
        deleteList(collection);
        Date newTime = new Date();
        long delay = newTime.getTime() - currentTime.getTime();
        return delay;
    }

    public static void insertList (Collection collection){
        for (int i = 0; i < 100000; i++) {
            collection.add("test" + i);
        }
    }

    public static void searchList (Collection collection) {
        for (int i = 0; i < 100000; i++) {
            collection.contains("test50000");
        }
    }

    public static void deleteList (Collection collection){
        for (int i = 0; i < 100000; i++) {
            collection.removeAll(collection);
        }
    }
}