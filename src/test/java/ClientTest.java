import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ClientTest {

    final static String ANY_NUMBER = "999-888-777";
    final static Phone MOBILE_PHONE = new Phone(ANY_NUMBER, true);
    final static Phone STATIONARY_PHONE = new Phone(ANY_NUMBER, false);

    Client client = new Client();

    @Test
    public void hasMobile() {
        client.addPhone(MOBILE_PHONE);
        assertTrue(client.hasMobile());
    }

    @Test
    public void isMobile() {
        client.addPhone(MOBILE_PHONE);
        client.addPhone(STATIONARY_PHONE);
        List<Phone> phones = client.getPhones();
        phones.forEach(System.out::println);
        phones.forEach(phone -> System.out.println(phone.isMobile()));
    }
}