public class Beer extends Product{
    public Beer(int select) {
        if (select == 1) {
            super.setName("Lager");
            super.setDesc("강한 탄산감이 있는 청량한 맥주");
            super.setPrice(4.8);
        } else if (select == 2) {
            super.setName("Ale");
            super.setDesc("풍부한 향과 단맛이 나는 높은 바디감의 맥주");
            super.setPrice(4.3);
        } else if (select == 3) {
            super.setName("Abita Root Beer");
            super.setDesc("맥주인 척 하는 탄산음료");
            super.setPrice(3.5);
        }
    }
    public static void printProduct() {
        System.out.println(
                "[ Beers MENU ]\n" +
                        "1. Lager   | W 4.8 | 강한 탄산감이 있는 청량한 맥주\n" +
                        "2. Ale    | W 4.3 | 풍부한 향과 단맛이 나는 높은 바디감의 맥주\n" +
                        "3. Abita Root Beer | W 3.5 | 맥주인 척 하는 탄산음료\n"
        );
    }
}
