import java.util.*;

public class Item implements Contract {
    //attrubutes
    String item;
    String direction;
    Number size;
    int x;
    int y;
    ArrayList <String> inventory;
    

    //methods

    /**
     * 
     */
    public void grab(String item){
        if (!inventory.contains(item)) {
            inventory.add(item);
        }
        else{
            throw new RuntimeException("You've already got this item");
        }
    }

    /**
     * 
     */
    public String drop(String item){
        if (inventory.contains(item)) {
            inventory.remove(item);
        }
        else{
            throw new RuntimeException("You don't have this item in your inventory");
        }
        return item + "dropped";
    }
    
    /**
     * 
     */
    public void use(String item){

    }


    public boolean walk(String direction){
        if(direction ){

        }
    }

    public boolean fly(int x, int y){
        this.x = x;
        this.y = y;

    }

    public Number shrink(){
        if(){

        }
    }

    public Number grow(){

    }

    public void rest(){

    }

    public void undo(){

    }
}
