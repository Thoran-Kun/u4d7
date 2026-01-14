import entities.Customer;
import entities.Order;
import entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    //creo la lista dei prodotti
    List<Product> productList = new ArrayList<>();
    productList.add(new Product(1L, "Il Nome della Rosa", "Book", 65.00));
    productList.add(new Product(2L, "Ciuccio", "Baby", 70.00));
    productList.add(new Product(3L, "Il Silmarillion", "Book", 80.00));
    productList.add(new Product(4L, "Harry Potter e la Pietra Filosofale", "Book", 75.00));
    productList.add(new Product(5L, "Il Signore dei passeggini", "Baby", 120.00));
    productList.add(new Product(6L, "La Ragazza con il Tatuaggio del Drago", "Book", 90.00));
    productList.add(new Product(7L, "Il Gioco delle Ombre", "Book", 85.00));
    productList.add(new Product(8L, "La Storia Infinita", "Baby", 100.00));
    productList.add(new Product(9L, "Il Pendolo di Foucault", "Book", 110.00));
    productList.add(new Product(10L, "La Culla Perduta", "Baby", 125.00));
    //------------------------------------------------------------------------------------
    //creo la lista dei customer
    List<Customer> customerList = new ArrayList<>();
    Customer c1 = new Customer(1L, "Fabio Carlino", 1);
    Customer c2 = new Customer(2L, "Antonio Todx", 2);
    customerList.add(c1);
    customerList.add(c2);
    //------------------------------------------------------------------------------------
    //creo la lista degli ordini
    List<Order> orderList = new ArrayList<>();
    orderList.add(new Order(1L, "delivered", LocalDate.now(), LocalDate.now().plusDays(3), List.of(productList.get(2)), c1));
    //------------------------------------------------------------------------------------

    //ESERCIZIO 1
    List<Product> booksMax100 = productList.stream()
            .filter(p -> p.getCategory().equals("Book"))
            .filter(p -> p.getPrice() >= 100)
            .toList();
    System.out.println("I libri che costano 100€ o di più sono: "booksMax100);

    //ESERCIZIO 2
    List<Product> babyPoducts = productList.stream()
            .filter(p -> p.getCategory().equals("Baby")).toList();
    System.out.println("I prodotti dei bambini sono: "babyPoducts);

}
