public class Burger extends Product {
    public Burger(int select) {
        if (select == 1) {
            super.setName("ShackBurger");
            super.setDesc("토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            super.setPrice(6.9);
        } else if (select == 2) {
            super.setName("SmokeShack");
            super.setDesc("베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            super.setPrice(8.9);
        } else if (select == 3) {
            super.setName("Shroom Burger");
            super.setDesc("몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
            super.setPrice(9.4);
        } else if (select == 4) {
            super.setName("Cheeseburger");
            super.setDesc("포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            super.setPrice(6.9);
        } else if (select == 5) {
            super.setName("Hamburger");
            super.setDesc("비프패티를 기반으로 야채가 들어간 기본버거");
            super.setPrice(5.4);
        }
    }
    public static void printProduct() {
        System.out.println("[ Burgers MENU ]\n" +
                "1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                "2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                "3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                "4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                "5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거"
        );
    }
}
