public class RecyclableWasteHandler implements WasteCollectionChain {
    private WasteCollectionChain chain;

    @Override
    public void setNextChain(WasteCollectionChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable") && container.isFull()) {
            System.out.println("Processing " + container.getCapacity() + " units of Recyclable Waste for sorting and reuse.");
        } else {
            if (this.chain != null) {
                this.chain.collect(container);
            }
        }
    }
}

