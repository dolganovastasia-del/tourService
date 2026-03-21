import exception.TourServiceValidationException;
import model.Client;

public class Main {
    public static void main(String[] args) {
        try {
            var client = new Client("", "", "", "", 0);
        }catch (TourServiceValidationException e){
            System.out.println("");
            e.getMessage();
            return;
        }
    }
}
