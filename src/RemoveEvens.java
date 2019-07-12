import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveEvens {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList();

        for (int i = 1; i<=100; i++) {
            myList.add(i);
        }

        System.out.println(removeEvens(myList));
    }

    public static List<Integer> removeEvens(ArrayList<Integer> numList) {
        return numList.stream()
                .filter(x -> x%2!=0)
                .collect(Collectors.toList());
    }
}
