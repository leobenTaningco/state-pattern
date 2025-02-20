class OutOfOrderState implements VendingMachineState {
    private VendingMachine machine;

    public OutOfOrderState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() { 
        System.out.println("Vending machine is out of order.");
    }
    @Override
    public void insertCoin() {
        System.out.println("Vending machine is out of order.");
     }
    @Override
    public void dispenseItem() { 
        System.out.println("Vending machine is out of order.");
    }
    @Override
    public void setOutOfOrder() {
        System.out.println("Already out of order");
     }
}