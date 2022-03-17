public class StockItem{
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;

    StockItem(String in_num, String in_name, double in_price) {
        this.stockNumber = in_num;
        this.name = in_name;
        this.price = in_price;
        this.totalStock = 0;
    }
    void setPrice (double price){
        this.price = price;
    }
    void increseTotalStock (int stock_n){
        this.totalStock = stock_n;
    }
    double calculateTotalPrice (){
        return this.price * this.totalStock;
    }
    String getStockNumber(){
        return this.stockNumber;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return price;
    }
    int getTotalStock(){
        return totalStock;
    }
    String get_All_information(){
        return "Stocknumber: "+this.getStockNumber()
                +"\nStockname: "+this.getName()
                +"\nStockprice: "+this.getPrice()
                +"\nTotal stock: "+this.getTotalStock()
                +"\nTotal value: "+this.calculateTotalPrice();
    }
}