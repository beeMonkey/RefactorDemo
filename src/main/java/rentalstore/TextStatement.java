package rentalstore;

import java.util.Enumeration;

public class TextStatement extends Statement {

    public  String getHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    public  String getFooter(Customer customer) {
        return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
                  + "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }

    public  String getContent(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
    }
}
