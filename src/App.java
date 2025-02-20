public class App {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectItem();
        vendingMachine.insertCoin(); 
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem();
        vendingMachine.insertCoin();
        vendingMachine.setOutOfOrder();
    }
}