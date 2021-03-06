package rentalstore;

import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public  String getContent(Rental each) {
        return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
    }

    public  String getFooter(Customer customer) {
        return "<P>You owe<EM>" + String.valueOf(customer.getTotalCharge()) + "</EM><P>\n"
                +"On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }

    public  String getHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
