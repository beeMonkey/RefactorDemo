package rentalstore;

import java.util.Enumeration;

public class Statement {
    public static String statement(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = customer.getHeader();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += customer.getContent(each);
        }
        //add footer lines
        result += customer.getFooter();
        return result;
    }
}
