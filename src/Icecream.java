public class Icecream extends Product {
    public Icecream(int select) {
        if (select == 1) {
            super.setName("Classic Hand-Spun Shakes");
            super.setDesc("쫀득하고 진한 커스터드가 들어간 클래식 쉐이크");
            super.setPrice(6.5);
        } else if (select == 2) {
            super.setName("Floats");
            super.setDesc("부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료");
            super.setPrice(6.5);
        } else if (select == 3) {
            super.setName("Cup & Cones");
            super.setDesc("매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림");
            super.setPrice(5.4);
        }
    }
    public static void printProduct() {
        System.out.println("[ Forzen Custard MENU ]\n" +
                "1. Classic Hand-Spun Shakes   | W 6.5 | 쫀득하고 진한 커스터드가 들어간 클래식 쉐이크\n" +
                "2. Floats    | W 6.5 | 부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료\n" +
                "3. Cup & Cones | W 5.4 | 매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림\n"
        );
    }
}
