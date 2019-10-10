package Warehouse;

public class StockItems
{
    //Private variables
    private String description;
    private int level;
    private double price;
    
    //Constructor
    public StockItems(String desc, double price){
        level = 0;
        description = desc;
        this.price = price;
    }
    
    //Mutators
    public void setPrice(double price){
        this.price = price;
    }
    
    public void doDelivery(int amount){
        level += amount;
    }
    
    public void doSale(int amount){
        if(level < amount){
            System.out.print("Not Enough Stock To Complete Sale");
        }else{
            level -= amount;
        }
    }
    
    public int getStockLevel(){
        return level;
    }
    
    public String getDescription(){
        return description;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getStockInfo(){
        return "*** Stock Report ***\n" + "Item: " + getDescription()
        + "\nPrice: " + getPrice() + "\nStock Level: " + getStockLevel() +
        "\n********************";
    }
    }
    

