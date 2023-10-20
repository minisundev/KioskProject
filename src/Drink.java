public class Drink extends Product {
    public Drink(int select) {
        if (select == 1) {
            super.setName("Raspberry Lemonade");
            super.setDesc("쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드");
            super.setPrice(4.8);
        } else if (select == 2) {
            super.setName("Lemonade");
            super.setDesc("매장에서 직접 만드는 상큼한 레몬에이드");
            super.setPrice(4.3);
        } else if (select == 3) {
            super.setName("Fresh Brewed Iced Tea");
            super.setDesc("직접 유기농 홍차를 우려낸 아이스 티");
            super.setPrice(3.5);
        }
    }
    public static void printProduct() {
        System.out.println(
                "[ Drinks MENU ]\n" +
                "1. Raspberry Lemonade   | W 4.8 | 쉐이크쉑 시그니처 레몬에이드에 상큼 달콤한 라즈베리가 더해진 시즌 한정 레몬에이드\n" +
                "2. Lemonade    | W 4.3 | 매장에서 직접 만드는 상큼한 레몬에이드\n" +
                "3. Fresh Brewed Iced Tea | W 3.5 | 직접 유기농 홍차를 우려낸 아이스 티\n"
        );
    }
}
