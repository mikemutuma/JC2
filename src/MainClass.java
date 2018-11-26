import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {

        ArrayList<PropertyClass>list;
        PropertyClass movie;
        list = new ArrayList<>();

        movie = new PropertyClass("Wakanda","Lupita",4.5);
        list.add(movie);

        movie = new PropertyClass("Skycrapper","The Rock",4.2);
        list.add(movie);

        System.out.println(list.toString());

    }

}
