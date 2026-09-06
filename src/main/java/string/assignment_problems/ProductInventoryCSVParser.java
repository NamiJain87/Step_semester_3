public class ProductInventoryCSVParser {

    void parseInventoryRecord(String csvLine) {

        String[] fields = csvLine.split(",");

        if (fields.length == 3) {
            System.out.println("Product: " + fields[0]
                    + " | SKU: " + fields[1]
                    + " | Qty: " + fields[2]);
        }
        else {
            System.out.println("Invalid Record");
        }
    }

    public static void main(String[] args) {

        String csvLine = "Wireless Mouse,WM-2201,150";

        ProductInventoryCSVParser obj = new ProductInventoryCSVParser();

        obj.parseInventoryRecord(csvLine);
    }
}