import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap <Integer,String> days = new HashMap<Integer, String>();


        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "Kamis");
        days.put(6, "Jumat");
        days.put(7, "Sabtu");

        System.out.println("isi days object" + days);
        System.out.println(days.get(2));
        System.out.println(days.put(2,"hudza"));
        System.out.println("isi days object" + days);

        days.forEach((integer , s) ->{
            System.out.println(integer);
            System.out.println(s);
        } );





    }
}
