import java.util.ArrayList;

public class R2_Sort_An_Array {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int a[] = new int[]{4, 6, 2, 1, 8, 0, 3, -10};

        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        sortUsingRecursion(list);
        System.out.println(list);
    }

    private static void sortUsingRecursion(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return;
        }
        int temp = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        sortUsingRecursion(list);

        insert(list, temp);
    }

    public static ArrayList<Integer> insert(ArrayList<Integer> arr, int temp) {
        if (arr.size() == 0) {//|| (int)arr.get(arr.size()-1)temp){
            arr.add(temp);
            return arr;
        } else if ((int) arr.get(0) >= temp) {
            arr.add(0, temp);
            return arr;
        } else if ((int) arr.get(arr.size() - 1) <= temp) {
            arr.add(arr.size(), temp);
            return arr;
        }
        int temp1 = (int) arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        arr = insert(arr, temp);
        arr.add(arr.size(), temp1);
        return arr;
    }
}
