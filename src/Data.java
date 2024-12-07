public class Data <T,U> {
    private T nama;
    private U age;

    Data(T nama){
        this.nama = nama;
    }
    Data(T nama, U age){
        this.nama = nama;
        this.age = age;
    }

    public <S> int sumArray (S[] array ){

        return array.length;
    }

    public T getNama() {
        return nama;
    }

    public void setNama(T nama) {
        this.nama = nama;
    }

    public U getAge() {
        return age;
    }

    public void setAge(U age) {
        this.age = age;
    }
}
