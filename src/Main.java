public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.addMoney(100);
        card2.addMoney(100);
        card3.getMoney(100);

        card1.display();
        card2.display();
        card3.display();
    }
}