
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate date1 = new SimpleDate(10,8,1990);
        System.out.println(date1.hashCode());
        SimpleDate date2 = new SimpleDate(10, 3, 1994);
        System.out.println(date2.hashCode());
    }
}
