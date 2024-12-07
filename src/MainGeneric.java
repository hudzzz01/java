public class MainGeneric {
    public static void main(String[] args) {

        Data <String,Integer> data = new Data<String,Integer>("hudzaifah",23);

        data.setNama("Hudzaifah");
        System.out.println(data.getNama());
        System.out.println(data.getAge());

        Integer[] names = {1,2,3};
        System.out.println(data.sumArray(names));


    }


}


