public class MyListTest {
    public static void main(String[] args) {
        MyList<String> listString=new MyList<String>();

        listString.add("hello");
        listString.add("boss");
        listString.add("huan");

        System.out.println(listString.get(2));

    }
}
