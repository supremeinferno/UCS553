import java.util.Vector;

class ApplicationException extends Exception {
    ApplicationException(String s) {
        super(s);
    }
}

class ProductException extends ApplicationException {
    ProductException(String s) {
        super(s);
    }
}

class ProductNotFoundException extends ProductException {
    ProductNotFoundException(String s) {
        super(s);
    }
}

class OutOfStockException extends ProductException {
    OutOfStockException(String s) {
        super(s);
    }
}

class PaymentException extends ApplicationException {
    PaymentException(String s) {
        super(s);
    }
}

class InvalidPaymentException extends PaymentException {
    InvalidPaymentException(String s) {
        super(s);
    }
}

class InsufficientFundsException extends PaymentException {
    InsufficientFundsException(String s) {
        super(s);
    }
}

class OrderException extends ApplicationException {
    OrderException(String s) {
        super(s);
    }
}

class EmptyCartException extends OrderException {
    EmptyCartException(String s) {
        super(s);
    }
}

class Account {
    int bal;

    Account(int bal) {
        this.bal = bal;
    }

    void pay(int amount)
            throws InvalidPaymentException, InsufficientFundsException {

        if (amount <= 0)
            throw new InvalidPaymentException("Invalid Payment");

        if (amount > bal)
            throw new InsufficientFundsException("Insufficient Funds");

        bal -= amount;
        System.out.println("Payment Successful. Balance: " + bal);
    }
}

class Product {
    int id, price;
    boolean stock;

    Product(int id, int price, boolean stock) {
        this.id = id;
        this.price = price;
        this.stock = stock;
    }
}

public class Problem7 {

    static Vector<Product> cart = new Vector<>();
    static Vector<Product> products = new Vector<>();

    static Product search(int id) throws ProductNotFoundException {
        for (Product p : products)
            if (p.id == id)
                return p;

        throw new ProductNotFoundException("Product not found");
    }

    static void add(int id)
            throws ProductNotFoundException, OutOfStockException {

        Product p = search(id);

        if (!p.stock)
            throw new OutOfStockException("Out of Stock");

        cart.add(p);
        System.out.println("Product added");
    }

    static void remove(int id) throws ProductNotFoundException {
        Product p = search(id);
        cart.remove(p);
        System.out.println("Product removed");
    }

    static void order(Account a)
            throws EmptyCartException,
            InvalidPaymentException,
            InsufficientFundsException {

        if (cart.isEmpty())
            throw new EmptyCartException("Cart is empty");

        int total = 0;

        for (Product p : cart)
            total += p.price;

        a.pay(total);
        cart.clear();
        System.out.println("Order placed");
    }

    public static void main(String[] args) {

        products.add(new Product(1, 100, true));
        products.add(new Product(2, 200, false));

        Account a = new Account(500);

        try {
            add(1);
            add(2);
            order(a);
        } catch (ApplicationException e) {
            System.out.println(e.getMessage());
        }
    }
}