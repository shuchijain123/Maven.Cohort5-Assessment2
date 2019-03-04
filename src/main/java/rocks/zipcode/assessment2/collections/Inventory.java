package rocks.zipcode.assessment2.collections;

import java.util.*;



/**
 * Use a map to keep track of inventory in a store
 */

public class Inventory {

    HashMap<ArrayList<String>,Integer> mymap = new HashMap<>();
    List<String> strings = new ArrayList<>();
    Integer noofitem =0;
    String item="";

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {

        this.strings = strings;
    }

    /**
     /* @param strings list of strings to add / remove / fetch from
     */




    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }





    public Inventory(List<String> strings) {
        this.strings = new ArrayList<>();
        this.item=item;


    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
       this.strings = new ArrayList<>();
        this.item = item;
        this.noofitem= 0;

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {






      strings.add(item);


    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item)

    {
        mymap.remove(item);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {


        return mymap.get(item);
    }
}
