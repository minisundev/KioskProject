import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String args[]) {

        /*기존 메뉴 등록*/
        Menu.createMenu("Burger","앵거스 비프 통살을 다져만든 버거");
        Menu.createMenu("Frozen Custard","매장에서 신선하게 만드는 아이스크림");
        Menu.createMenu("Drink","매장에서 직접 만드는 음료");
        Menu.createMenu("Beer","뉴욕 브루클린 브루어리에서 양조한 맥주");

        Product.createProduct("Burger","ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
        Product.createProduct("Burger","SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
        Product.createProduct("Burger","Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
        Product.createProduct("Burger","Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
        Product.createProduct("Burger","Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);

        Product.createProduct("Beer","Lager", "강한 탄산감이 있는 청량한 맥주", 6.5);
        Product.createProduct("Beer","Ale", "풍부한 향과 단맛이 나는 높은 바디감의 맥주", 6.5);
        Product.createProduct("Beer","Abita Root Beer", "맥주인 척 하는 탄산음료", 5.4);

        Product.createProduct("Frozen Custard","Classic Hand-Spun Shakes", "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크", 6.5);
        Product.createProduct("Frozen Custard","Floats", "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료", 6.5);
        Product.createProduct("Frozen Custard","Cup & Cones", "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림", 5.4);

        Product.createProduct("Drink","Raspberry Lemonade", "쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드", 6.5);
        Product.createProduct("Drink","Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 6.5);
        Product.createProduct("Drink","Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스 티", 5.4);
        /*기존 메뉴 등록*/


        int select;

        Loop1:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "접속할 앱을 선택해 주세요.\n" +
                    "1. 주문\n" +
                    "2. 관리\n" +
                    "3. 앱 종료"
            );
            select = sc.nextInt();

            Loop2:
            switch (select) {
                case 1:
                    KioskApp.selectMenu();
                    break;
                case 2:
                    ManagerApp.run();
                    break;
                case 3:
                    break Loop1;
                default:
                    System.out.println("다시 선택해 주세요");
            }
        }
    }
}
