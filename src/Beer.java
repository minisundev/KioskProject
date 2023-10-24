public class Beer extends Product{
    private static int [] count ={0,0,0};
    private static String [] name = {"Lager","Ale","Abita Root Beer"};
    private static String [] desc = {"강한 탄산감이 있는 청량한 맥주",
            "풍부한 향과 단맛이 나는 높은 바디감의 맥주",
            "맥주인 척 하는 탄산음료"};
    private static double [] price = {4.8,4.3,3.5};
    public Beer(int select) {
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