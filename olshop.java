import java.util.LinkedHashMap;
import java.util.Map;

public class olshop{
    class produk {
        private String namaP;
        private double harga;
    
        public produk(String namaP, double harga) {
            this.namaP = namaP;
            this.harga = harga;
        }
    
        public String getName() {
            return namaP;
        }
    
        public double getPrice() {
            return harga;
        }
    }
    
    // ShoppingCart Class (Menggunakan LinkedHashMap)
    class ShoppingCart {
        private Map<produk, Integer> items;
    
        public ShoppingCart() {
            this.items = new LinkedHashMap<>();
        }
    
        public void addItem(produk p, int quantity) {
            items.put(p, items.getOrDefault(p, 0) + quantity);
        }
    
        public void showCart() {
            System.out.println("Shopping Cart:");
            for (Map.Entry<produk, Integer> entry : items.entrySet()) {
                produk p = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(p.getName() + " - Qty: " + quantity + " - Price: " + (p.getPrice() * quantity));
            }
        }
    }
    
    // Customer Class
    class Customer {
        private String noTelp;
        private String namaLengkap;
        private ShoppingCart cart;
    
        public Customer(String phoneNumber, String fullName) {
            this.noTelp = phoneNumber;
            this.namaLengkap = fullName;
            this.cart = new ShoppingCart();
        }
    
        public void addToCart(produk p, int quantity) {
            cart.addItem(p, quantity);
        }
    
        public void showCart() {
            cart.showCart();
        }
    }
    
}
