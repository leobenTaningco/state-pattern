class IdleState implements VendingMachineState {
    private VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin() { }
    @Override
    public void dispenseItem() { }
    @Override
    public void setOutOfOrder() { }
}