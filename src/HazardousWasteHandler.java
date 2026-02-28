public class HazardousWasteHandler implements WasteCollectionChain {
    private WasteCollectionChain chain;

    @Override
    public void setNextChain(WasteCollectionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous") && container.isFull()) {
            System.out.println("Processing " + container.getCapacity() + " units of Hazardous Waste under strict safety protocols.");
        } else {
            if (this.chain != null) {
                this.chain.collect(container);
            } else {
                // Reached the end of the chain without being handled
                System.out.println("Warning: Unrecognized waste type or container not full. Cannot process.");
            }
        }
    }
}
