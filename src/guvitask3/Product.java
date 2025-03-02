package management;

	class Product implements Taxable {

    private int pid;
    private double price;
    private int quantity;
    

    
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
        
    }

    
    
    public double calcTax() {
        return (price * quantity) * SALES_TAX;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
   
}



    


