import java.util.ArrayList;

public class TestImports{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("world!");

        for(String str : list){
            System.out.println(str);
        }
    }
}
