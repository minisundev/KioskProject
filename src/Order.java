import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static ArrayList<Menu> menus = new ArrayList<Menu>();
    public ArrayList<Menu> instanceMenus;

    public Order() {
    }

    public static int selectMenu() {
        int menu;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                    "[ SHAKESHACK MENU ]\n" +
                    "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                    "2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림\n" +
                    "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                    "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n\n" +
                    "[ ORDER MENU ]\n" +
                    "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                    "6. Cancel      | 진행중인 주문을 취소합니다."
            );
            menu = sc.nextInt();

            if ((0 < menu) && (menu < 5)) {//버거,아이스크림,음료,맥주
                selectProduct(menu);
            } else if (menu == 5) {//Order
                int order = order();
                if (order == 1) {//1이면 주문 2이면 걍 반복
                    return 1;
                }
            } else if (menu == 6) {//Cancel
                int order = cancel();
                if (order == 1) {//1이면 주문취소 아니면 걍 반복
                    return 2;
                }
            }else if(menu==0){//총 판매 상품목록 출력
                return 3;
            }
        }
    }

    public static void selectProduct(int menu) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n");

            switch (menu) {
                case 1:
                    Burger.printProduct();
                    break;
                case 2:
                    Icecream.printProduct();
                    break;
                case 3:
                    Drink.printProduct();
                    break;
                case 4:
                    Beer.printProduct();
                    break;
                default:
                    continue;
            }
            int select = sc.nextInt();
            Product product;
            switch (menu) {
                case 1:
                    if ((0 < select) && (select < 6)) {
                        product = new Burger(select);
                    } else {
                        continue;
                    }
                    break;
                case 2:
                    if ((0 < select) && (select < 4)) {
                        product = new Icecream(select);
                    } else {
                        continue;
                    }
                    break;
                case 3:
                    if ((0 < select) && (select < 4)) {
                        product = new Drink(select);
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if ((0 < select) && (select < 4)) {
                        product = new Beer(select);
                    } else {
                        continue;
                    }
                    break;
                default:
                    continue;
            }
            int confirm = 0;
            while (confirm == 0) {
                product.printDesc();//개수출력
                confirm = confirmMenu();
            }
            if (confirm == 1) {
                menus.add(product);
                System.out.println(product.getName() + " 가 장바구니에 추가되었습니다.");
            }
            return;
        }
    }


    public static int confirmMenu() {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                    "1. 확인        2. 취소");
            int confirm = sc.nextInt();
            if (confirm == 1) {
                return confirm;
            } else if (confirm == 2) {
                return confirm;
            }
        }
    }

    public static int order() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("아래와 같이 주문 하시겠습니까?\n" +
                    "[ Orders ]\n");
            double total = 0;
            for (Menu m : menus) {
                //m.printDesc(); ->개수 출력해야 해서 바꿈
                total = total + ((Product) m).getPrice();
            }
            //개수 출력하는 함수
            Burger.printProductCount();
            Drink.printProductCount();
            Icecream.printProductCount();
            Beer.printProductCount();

            System.out.println("[ Total ]\nW " + total + "\n" +
                    "1. 주문      2. 메뉴판");
            int x = sc.nextInt();
            if (x == 1) {//주문
                Main.increaseWaiting();//대기 인원 증가
                System.out.println("주문이 완료되었습니다!\n\n" +
                        "대기번호는 [ " + Main.getWaiting() + " ] 번 입니다.\n" +
                        "(3초후 메뉴판으로 돌아갑니다.)");
                //3초 기다려야됨

                return x;
            } else if (x == 2) {
                return x;
            }
        }
    }

    public static int cancel() {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("주문을 취소 하시겠습니까?\n" +
                    "1. 확인      2. 메뉴판");
            int x = sc.nextInt();
            if (x == 1) {//주문취소
                System.out.println("취소가 완료되었습니다!\n\n");
                //3초 기다려야됨
                return x;
            } else if (x == 2) {

                return x;
            }
        }
    }

}
