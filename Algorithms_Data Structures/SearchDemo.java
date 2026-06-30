public class SearchDemo {
    // Product Class
    static class Product {
        int productId;
        String productName;
        String category;
        Product(int productId, String productName, String category) {
            this.productId = productId;
            this.productName = productName;
            this.category = category;
        }
        void display() {
            System.out.println("Product ID : " + productId);
            System.out.println("Product Name : " + productName);
            System.out.println("Category : " + category);
        }
    }
    // Linear Search
    public static Product linearSearch(Product[] products, int id) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == id) {
                return products[i];
            }
        }
        return null;
    }
    // Binary Search
    public static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            }
            if (products[mid].productId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    // Main Method
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };
        System.out.println("----- Linear Search -----");
        Product result1 = linearSearch(products, 104);
        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found.");
        }
        System.out.println();
        System.out.println("----- Binary Search -----");
        Product result2 = binarySearch(products, 104);
        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found.");
        }
    }
}