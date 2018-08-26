package rentalstore;

import java.util.Enumeration;

public  abstract class Statement {
    public  String Statement(Customer customer){
        Enumeration rentals = customer.getRentals().elements();
        String result = getHeader(customer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getContent(each);
        }
        //add footer lines
        result += getFooter(customer);
        return result;
    }
      abstract String getHeader(Customer customer);

      abstract String getContent(Rental each);

      abstract String getFooter(Customer customer);
}
