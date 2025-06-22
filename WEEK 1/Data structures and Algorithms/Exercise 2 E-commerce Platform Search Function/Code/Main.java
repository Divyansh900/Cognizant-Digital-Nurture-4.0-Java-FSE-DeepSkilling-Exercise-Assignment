import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Product[] a = {
            new Product(101, "Laptop", "Electronics", 999.99, 15),
            new Product(102, "Running Shoes", "Footwear", 79.99, 8),
            new Product(103, "Smartphone", "Electronics", 699.99, 22),
            new Product(104, "Smart Watch", "Accessories", 199.99, 3),
            new Product(105, "Headphones", "Electronics", 149.99, 0),
            new Product(106, "Yoga Mat", "Fitness", 29.99, 12),
            new Product(107, "Water Bottle", "Accessories", 19.99, 30)
        };

        System.out.println("=== Full Product Inventory ===");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\n=== Linear Search Examples ===");
        doLin(a);


        System.out.println("\n=== Binary Search Examples ===");
        doBin(a);
    }

    private static void doLin(Product[] x) {

        Product p1 = LinearSearch.searchByName(x, "Smartphone");
        if (p1 != null) {
            System.out.println("Search for 'Smartphone': " + p1);
        } else {
            System.out.println("Search for 'Smartphone': Not found");
        }
        Product[] cRes = LinearSearch.searchByCategory(x, "Electronics");
        System.out.println("\nElectronics Products:");
        for (int i = 0; i < cRes.length; i++) {
            System.out.println(cRes[i]);
        }


        Product[] lRes = LinearSearch.searchLowStock(x, 5);
        System.out.println("\nLow Stock Items (≤5):");
        for (int j = 0; j < lRes.length; j++) {
            System.out.println(lRes[j]);
        }
    }

    private static void doBin(Product[] y) {
        
        for (int k = 0; k < y.length; k++) {
            BinarySearch.sortprodByName(y);
        }
        
        Product p2 = BinarySearch.searchByName(y, "Running Shoes");
        System.out.println("Search for 'Running Shoes': " + (p2 != null ? p2 : "Not found"));

        
        Product[] pr = BinarySearch.searchByPriceRange(y, 100, 200);
        System.out.println("\nProducts between $100-$200:");
        for (int m = 0; m < pr.length; m++) {
            if (pr[m] != null) {
                System.out.println(pr[m]);
}}}}
