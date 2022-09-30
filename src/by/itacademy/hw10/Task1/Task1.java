package by.itacademy.hw10.Task1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Task1 {
    public static void main(String[] args) {

        Set<Integer> grp1 = new HashSet<Integer>();

        grp1.add(1);
        grp1.add(2);
        grp1.add(3);
        grp1.add(4);
        grp1.add(5);

        System.out.println(" Первый набор чисел: ");
        Iterator<Integer> i = grp1.iterator();
        while(i.hasNext()) {
            int numbers1 = i.next();
            System.out.print(numbers1 + " ");
        }
        System.out.println();

        Set<Integer> grp2 = new HashSet<Integer>();

        grp2.add(8);
        grp2.add(7);
        grp2.add(6);
        grp2.add(5);
        grp2.add(4);

        System.out.println(" Второй набор чисел: ");
        Iterator<Integer> y = grp2.iterator();
        while(y.hasNext()) {
            int numbers2 = y.next();
            System.out.print(numbers2 + " ");
        }
    }
}
