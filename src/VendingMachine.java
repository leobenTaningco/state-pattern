class VendingMachine {
    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;
    private VendingMachineState currentState;

    public VendingMachine() {
        idleState = new IdleState(this);
        itemSelectedState = new ItemSelectedState(this);
        dispensingState = new DispensingState(this);
        outOfOrderState = new OutOfOrderState(this);
        currentState = idleState;
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void insertCoin() {
        currentState.insertCoin();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void setOutOfOrder() {
        System.out.println("Vending machine is out of order.");
        setState(outOfOrderState);
    }

    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }
}
