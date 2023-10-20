public class Icecream extends Product {
    private static int [] count ={0,0,0};
    private static String [] name = {"Classic Hand-Spun Shakes","Floats","Cup & Cones"};
    private static String [] desc = {"쫀득하고 진한 커스터드가 들어간 클래식 쉐이크",
            "부드러운 바닐라 커스터드와 톡톡 터지는 탄산이 만나 탄생한 색다른 음료",
            "매일 점포에서 신선하게 제조하는 쫀득하고 진한 아이스크림"};
    private static double [] price = {6.5,6.5,5.4};
    public Icecream(int select) {
        super.setName(name[select-1]);
        super.setDesc(desc[select-1]);
        super.setPrice(price[select-1]);
        count[select-1] = count[select-1]+1;
    }
    public void printDesc() {
        int productCount = 0;
        for(int i=0;i<name.length;i++){//for문 돌면서 이름 일치하는 상품이 2개 이상 있으면 개수 출력
            if(name[i]==super.getName()){
                productCount=count[i];
            }
        }
        if(productCount>1){
            System.out.println(super.getName() + "     | W " + super.getPrice() + " | " +productCount+ " | " + super.getDesc());
        }
    }
    public static void printProduct() {
        System.out.println("[ Burgers MENU ]\n");
        for(int i=0;i<count.length;i++){//for문 돌면서 있으면 출력
            System.out.println((i+1)+". "+name[i]+"   | W "+price[i]+" | "+desc[i]);
        }
    }
    public static void printProductCount() {
        for(int i=0;i<count.length;i++){//for문 돌면서 있으면 출력
            if(count[i]>1){
                System.out.println((i+1)+". "+name[i]+"   | W "+price[i]+" | "+count[i]+" | "+desc[i]);
            }else if(count[i]>0){
                System.out.println((i+1)+". "+name[i]+"   | W "+price[i]+" | "+desc[i]);
            }
        }
    }

    public static void clear(){
        for(int i=0;i<count.length;i++){
            count[i]=0;
        }
    }
}
