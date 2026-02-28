public class WasteManagementChain implements WasteCollectionChain {
    private WasteCollectionChain nextChain;

    public WasteManagementChain() {
        this.nextChain = new OrganicWasteHandler();
        WasteCollectionChain c2 = new RecyclableWasteHandler();
        WasteCollectionChain c3 = new HazardousWasteHandler();

        nextChain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public void collect(WasteContainer container) {
        nextChain.collect(container);
    }

    @Override
    public void setNextChain(WasteCollectionChain nextChain) {
        this.nextChain = nextChain;
    }
}