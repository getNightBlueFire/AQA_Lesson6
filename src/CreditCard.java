public class CreditCard {
    String cardNumber;
    int currentCount;

    void addMoney(int money){
        currentCount = currentCount + money;
    }

    void getMoney(int money){
        currentCount = currentCount - money;
    }

}
