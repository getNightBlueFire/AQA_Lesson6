public class CreditCard {
    String cardNumber;
    int currentCount;

    void addMoney(int money){
        currentCount = currentCount + money;
    }

    void getMoney(int money){
        currentCount = currentCount - money;
    }
    void display(){
        System.out.println("current money:" + cardNumber);
    }

}
