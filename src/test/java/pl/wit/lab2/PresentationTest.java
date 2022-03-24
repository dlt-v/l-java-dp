package pl.wit.lab2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresentationTest {

    @Test
    public void getFullName() {
        Presentation tomcio = new Presentation("Tomasz", "michalski");
        Assert.assertEquals(tomcio.getFullName(), "Tomasz Michalski");
    }

    @Test
    public void getBirthdayDateAsString() {
        Presentation tomcio = new Presentation("Tomasz", "michalski", 17, 11, 1999);
        Assert.assertEquals(tomcio.getBirthdayDateAsString(), "17.11.1999");

    }

    @Test
    public void getAge() {
        Presentation tomcio = new Presentation("Tomasz", "michalski", 17, 11, 1999);
        Assert.assertEquals(tomcio.getAge(), 22);

    }

    @Test
    public void getPresentationStory() {
        Presentation tomcio = new Presentation("Tomasz", "Michalski", 17, 11, 1999);
        tomcio.setFacebookFriendsQuantity((short) 401);
        Assert.assertEquals(tomcio.getPresentationStory(), "Nazywam się: Tomasz Michalski\n" +
                "Mam 22 lat. Urodziłem się 17.11.1999\n" +
                "Mam dużo znajomych na fejsie.");

    }
}