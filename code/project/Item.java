
public class Item{
    private int enum_item;
    private String picture_address;
    public Item(int enum_item){
        this.enum_item = enum_item;
        this.picture_address = enum_item+".png";
    }
}