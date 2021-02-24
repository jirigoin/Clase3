package tm;

public class Main {
    public static void main(String[] args) {
        Persona[] arr = new Persona[4];
        arr[0] = new Persona("Juan", 111111);
        arr[1] = new Persona("Maria", 777777);
        arr[2] = new Persona("Carlos", 555555);
        arr[3] = new Persona("Luis", 222222);

        SortUtil.ordenar(arr);
        for(Persona e: arr){
            System.out.println(e);
        }
    }
}
