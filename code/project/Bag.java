
public class Bag{
    private Item bag_item[];
    private Item_array item_array;
    public Bag(){
        item_array = new Item_array();
        bag_item = new Item[48];
        for(int i =0;i<48;i++){
            bag_item[i] = item_array .get_Item(0);
        }
    }
    public void add_Bag(int x){

    }
}