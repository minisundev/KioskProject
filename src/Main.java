import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static int waiting = 0;//대기인원
    public static int getWaiting(){
        return waiting;
    }
    public static void decreaseWaiting(){
        waiting = waiting-1;
    }
    public static void increaseWaiting(){
        waiting = waiting+1;
    }

    public static ArrayList<Order> orders = new ArrayList<Order>();

    public static void main(String[] args) {

        while (true) {//order반복
            int result = Order.selectMenu();//주문하지 않으면 리턴되지 않는 while로 감싸인 함수임
            if(result==1){//주문했음
                for (Menu m : Order.menus) {

                    Product good  = new Product(m.getName(),m.getDesc(),m.getPrice());
                    Order order = new Order();
                    order.instanceMenus = new ArrayList<Menu>();
                    order.instanceMenus.add(good);
                    orders.add(order);
                }
                Order.menus.clear();//static 메뉴선택 끝나서 장바구니 비워줌
                /*개수 카운트 비워줌*/
                Burger.clear();
                Drink.clear();
                Icecream.clear();
                Beer.clear();

            }else if(result ==2){//취소했음
                Order.menus.clear();//static 메뉴선택 취소해서 장바구니 비워줌
                /*개수 카운트 비워줌*/
                Burger.clear();
                Drink.clear();
                Icecream.clear();
                Beer.clear();
            }else if(result==3){//총 판매목록
                double total = 0;
                System.out.println(
                        "[ 총 판매 목록 ]");
                for (Order o : orders) {
                    for (Menu m : o.instanceMenus) {
                        m.printDesc();
                        total = total+ ((Product)m).getPrice();
                    }
                }
                System.out.println("[ Total ]\nW " + total);

            }

        }
    }
}
