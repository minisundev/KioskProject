import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    static ArrayList<Menu> menus = new ArrayList<Menu>();
    public ArrayList<Menu> instanceMenus;
    public Order() {
    }

    public static int selectMenu() {
        int menu;
        while(true) {
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

            if (menu == 1) {//버거
                selectBurger();
            } else if (menu == 2) {//아이스크림
                selectIcecream();
            } else if (menu == 3) {//음료
                selectDrink();
            } else if (menu == 4) {//맥주
                selectBeer();
            } else if (menu == 5) {//Order
                int order = order();
                if(order == 1){//1이면 주문 2이면 걍 반복
                    return 1;
                }
            } else if (menu == 6) {//Cancel
                int order = cancel();
                if(order == 1){//1이면 주문취소 아니면 걍 반복
                    return 2;
                }
            }
        }
    }

    public static void selectBurger() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                    "[ Burgers MENU ]\n" +
                    "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                    "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
            );
            int select = sc.nextInt();


            Product good;
            if (select == 1) {
                good = new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9);
            } else if (select == 2) {
                good = new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9);
            } else if (select == 3) {
                good = new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4);
            } else if (select == 4) {
                good = new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9);
            } else if (select == 5) {
                good = new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4);
            } else{
                continue;
            }

            int confirm = 0;
            while (confirm == 0) {
                good.printDesc();
                confirm = confirmMenu();
            }
            if (confirm == 1) {
                menus.add(good);
                System.out.println(good.getName() + " 가 장바구니에 추가되었습니다.");
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
                m.printDesc();
                total = total + ((Product)m).getPrice();
            }
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
            }else if(x==2) {

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
                System.out.println("취소가 완료되었습니다!\n\n" );
                //3초 기다려야됨
                return x;
            }else if(x==2) {

                return x;
            }
        }
    }

    public static void selectIcecream() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                    "[ Forzen Custard MENU ]\n" +
                    "1. Classic Hand-Spun Shakes   | W 6.5 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크\n" +
                    "2. Floats    | W 6.5 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료\n" +
                    "3. Cup & Cones | W 5.4 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림\n"
            );
            int select = sc.nextInt();


            Product good;
            if (select == 1) {
                good = new Product("Classic Hand-Spun Shakes", "쫀득하고 진한 커스터드가 들어간 클래식 쉐이크", 6.5);
            } else if (select == 2) {
                good = new Product("Floats", "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료", 6.5);
            } else if (select == 3){
                good = new Product("Cup & Cones", "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림", 5.4);
            } else{
                continue;
            }

            int confirm = 0;
            while (confirm == 0) {
                good.printDesc();
                confirm = confirmMenu();
            }
            if (confirm == 1) {
                menus.add(good);
                System.out.println(good.getName() + " 가 장바구니에 추가되었습니다.");
            }
            return;
        }
    }
    public static void selectDrink() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                    "[ Drinks MENU ]\n" +
                    "1. Raspberry Lemonade   | W 4.8 | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드\n" +
                    "2. Lemonade    | W 4.3 | 매장에서 직접 만드는 상큼한 레몬에이드\n" +
                    "3. Fresh Brewed Iced Tea | W 3.5 | 직접 유기농 홍차를 우려낸 아이스 티\n"
            );
            int select = sc.nextInt();


            Product good;
            if (select == 1) {
                good = new Product("Raspberry Lemonade", "쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드", 4.8);
            } else if (select == 2) {
                good = new Product("Lemonade", "매장에서 직접 만드는 상큼한 레몬에이드", 4.3);
            } else if (select == 3){
                good = new Product("Fresh Brewed Iced Tea", "직접 유기농 홍차를 우려낸 아이스 티", 3.5);
            } else{
                continue;
            }

            int confirm = 0;
            while (confirm == 0) {
                good.printDesc();
                confirm = confirmMenu();
            }
            if (confirm == 1) {
                menus.add(good);
                System.out.println(good.getName() + " 가 장바구니에 추가되었습니다.");
            }
            return;
        }
    }

    public static void selectBeer() {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.\n" +
                    "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n\n" +
                    "[ Beers MENU ]\n" +
                    "1. Lager   | W 4.8 | 강한 탄산감이 있는 청량한 맥주\n" +
                    "2. Ale    | W 4.3 | 풍부한 향과 단맛이 나는 높은 바디감의 맥주\n" +
                    "3. Abita Root Beer | W 3.5 | 맥주인 척 하는 탄산음료\n"
            );
            int select = sc.nextInt();


            Product good;
            if (select == 1) {
                good = new Product("Lager", "강한 탄산감이 있는 청량한 맥주", 4.8);
            } else if (select == 2) {
                good = new Product("Ale", "풍부한 향과 단맛이 나는 높은 바디감의 맥주", 4.3);
            } else if (select == 3){
                good = new Product("Abita Root Beer", "맥주인 척 하는 탄산음료", 3.5);
            } else{
                continue;
            }

            int confirm = 0;
            while (confirm == 0) {
                good.printDesc();
                confirm = confirmMenu();
            }
            if (confirm == 1) {
                menus.add(good);
                System.out.println(good.getName() + " 가 장바구니에 추가되었습니다.");
            }
            return;
        }
    }


}