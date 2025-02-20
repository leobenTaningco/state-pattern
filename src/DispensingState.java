class DispensingState implements VendingMachineState {
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed.");
        machine.setState(machine.getIdleState());
    }

    @Override
    public void selectItem() { }
    @Override
    public void insertCoin() { }
    @Override
    public void setOutOfOrder() { }
}
