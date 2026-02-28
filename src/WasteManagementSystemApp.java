public class WasteManagementSystemApp {
    public static void main(String[] args) {
        WasteManagementChain wasteSystem = new WasteManagementChain();

        WasteContainer bin1 = new WasteContainer("Recyclable", 50, true);
        WasteContainer bin2 = new WasteContainer("Organic", 30, true);
        WasteContainer bin3 = new WasteContainer("Hazardous", 10, true);

        WasteContainer bin4 = new WasteContainer("Organic", 15, false);

        System.out.println("--- Starting Automated Waste Collection ---");

        wasteSystem.collect(bin1);
        wasteSystem.collect(bin2);
        wasteSystem.collect(bin3);

        if (!bin4.isFull()) {
            System.out.println("Skipping collection: Container is not full.");
        } else {
            wasteSystem.collect(bin4);
        }
    }
}