public class OrganicWasteHandler implements WasteCollectionChain {
    private WasteCollectionChain chain;

    @Override
    public void setNextChain(WasteCollectionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic") && container.isFull()) {
            System.out.println("Processing " + container.getCapacity() + " units of Organic Waste for composting.");
        } else {
            if (this.chain != null) {
                this.chain.collect(container);
            }
        }
    }
}