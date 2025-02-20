class ItemSelectedState implements VendingMachineState {
    private VendingMachine machine;

    public ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coins inserted. Dispensing item...");
        machine.setState(machine.getDispensingState());
        machine.dispenseItem();
    }

    @Override
    public void selectItem() { }
    @Override
    public void dispenseItem() { }
    @Override
    public void setOutOfOrder() { }
}