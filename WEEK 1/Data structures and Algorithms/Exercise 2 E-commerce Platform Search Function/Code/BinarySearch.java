import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.ArrayList;



public class BinarySearch {

    public static void sortprodByName(Product[] prod) {
        Objects.requireNonNull(prod, "Product array cannot be null");
        int n = prod.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (prod[j] == null || prod[j+1] == null) continue;
                String name1 = prod[j].getProductName();
                String name2 = prod[j+1].getProductName();
                // compareIgnoreCase manually
                if (String.CASE_INSENSITIVE_ORDER.compare(name1, name2) > 0) {
                    Product temp = prod[j];
                    prod[j] = prod[j+1];
                    prod[j+1] = temp;
                }
            }
        }
    }
    public static Product searchByName(Product[] prod, String targetName) {
        Objects.requireNonNull(prod, "Product array cannot be null");
        Objects.requireNonNull(targetName, "Target name cannot be null");
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] != null && prod[i].getProductName().equalsIgnoreCase(targetName)) {
                return prod[i];
            }
        }
        return null;
    }

    public static Product[] searchByPriceRange(Product[] prod, double minPrice, double maxPrice) {
        Objects.requireNonNull(prod, "Product array cannot be null");
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] == null) continue;
            double price = prod[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                list.add(prod[i]);
            }
        }
        Product[] result = new Product[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
