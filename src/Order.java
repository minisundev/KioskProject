
import java.util.ArrayList;

public class Order {
    public ArrayList<Product> instanceMenus;
    private String offer = "";

    public Order() {
    }

    public String getOffer(){
        return this.offer;
    }
    public void setOffer(String offer){
        this.offer = offer;
    }



}

