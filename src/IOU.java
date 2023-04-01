import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> book;

    public IOU() {
        book = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        book.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return book.getOrDefault(toWhom, 0.00);
    }
}
