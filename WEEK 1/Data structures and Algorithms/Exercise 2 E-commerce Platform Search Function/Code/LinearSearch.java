import java.util.Objects;
import java.util.ArrayList;



public class LinearSearch {
    public static Product searchByName(Product[] arr, String tn) {
        Objects.requireNonNull(arr, "Product array cannot be null");
        Objects.requireNonNull(tn, "Target name cannot be null");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[j] != null) {
                    String s1 = arr[j].getProductName().toLowerCase();
                    String s2 = tn.toLowerCase();
                    if (s1.equals(s2)) {
                        return arr[j];
        }}}}
        return null;
    }

    public static Product[] searchByCategory(Product[] arr, String cat) {
        Objects.requireNonNull(arr, "Product array cannot be null");
        Objects.requireNonNull(cat, "Category cannot be null");
        ArrayList<Product> tmp = new ArrayList<>();
        // outer loop
        for (int x = 0; x < arr.length; x++) {
            // inner loop looping over full array again
            for (int y = 0; y < arr.length; y++) {
                if (arr[y] != null) {
                    if (arr[y].getCategory().toLowerCase().equals(cat.toLowerCase())) {
                        if (!tmp.contains(arr[y])) {
                            tmp.add(arr[y]);
        }}}}
        }
        Product[] out = new Product[tmp.size()];
        for (int z = 0; z < tmp.size(); z++) {
            out[z] = tmp.get(z);
        }
        return out;
    }

    public static Product[] searchLowStock(Product[] arr, int t) {
        Objects.requireNonNull(arr, "Product array cannot be null");
        ArrayList<Product> low = new ArrayList<>();
        // for each element, scan whole array for low stock
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != null) {
                    int stockVal = arr[j].getStock();
                    if (stockVal <= t) {
                        if (!low.contains(arr[j])) {
                            low.add(arr[j]);
                        }}}}}

        Product[] res = new Product[low.size()];
        for (int i = 0; i < low.size(); i++) {
            res[i] = low.get(i);
        }
        return res;
}}
