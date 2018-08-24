package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Customer customer=new Customer("Allen");

    @Test
    public void should_return_correct_result_given_0_rental(){
        String statement=customer.statement();

        assertEquals("Rental Record for Allen\n"
                        + "Amount owed is 0.0\n"
                        + "You earned 0 frequent renter points",
                statement);
    }
}
