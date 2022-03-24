package pl.wit.lab2;

import java.time.LocalDate;

/**
 *
 * @author Michalski Tomasz 19012
 * Klasa opisująca osobę
 */

public class Presentation {

    // pierwsze imię
    private String firstName;
    //  nazwisko
    private String lastName;
    // data urodzenia, dzień, miesiąc, rok
    private byte birthdayDay, birthdayMonth, birthdayYear;
    // miejsce urodzenia
    private String placeOfBirth;
    // ilość znajomych na fejsbuku
    private short facebookFriendsQuantity;
    // odwiedzone miejsca
    private String visitedPlaces[];

    public Presentation(String firstName,String lastName) {
        //inicjalizacja imienia i nazwiska
        firstName = firstName;
        lastName = lastName;
    }

    public Presentation(String firstName,String lastName,int birthdayDay,int birthdayMonth,int birthdayYear) {
        this(firstName,lastName);
        //dalsza inicjalizacja
        birthdayDay = birthdayDay;
        birthdayMonth = birthdayMonth;
        birthdayYear = birthdayYear;
    }

    public String getFullName() {
        //Zwrócenie połączonej wartości imienia i nazwiska ze spacją pomiędzy
        return firstName + ' ' + lastName;
    }

    public String getBirthdayDateAsString() {
        //Ręczne zbudowanie Daty w formacie dd.MM.yy (rok wyjątkowo na 2 pozycjach ;) )
        //tu jest yy, w pdfie jest yyyy, więc nie wiem dokładnie o co chodzi :(
        String day = String.format("%02d", birthdayDay);
        String month = String.format("%02d", birthdayMonth);
        return day + '.' + month + '.' + birthdayYear;
    }

    public byte getAge() {
        LocalDate now = LocalDate.now();

        //Obliczenie aktualnego wieku
        return (byte) (now.getYear() - birthdayYear);
    }

    public String getPresentationStory() {
        String result = "Nazywam się:";
        result += firstName + ' ' + lastName + "\n";
        result += "Mam " + this.getAge() + " lat. Urodziłem się " + this.getBirthdayDateAsString() + "\n";
        if (facebookFriendsQuantity > 400) {
            result += "Mam dużo znajomych na fejsie.";
        } else {
            result += "Mam trochę znajomych na fejsie.";
        }
        return null;
    }

    public String[] getVisitedPlaces() {
        return visitedPlaces;
    }

    public void setVisitedPlaces(String[] visitedPlaces) {
        this.visitedPlaces = visitedPlaces;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setBirthdayDay(byte birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public void setBirthdayMonth(byte birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public void setBirthdayYear(byte birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFacebookFriendsQuantity(short facebookFriendsQuantity) {
        this.facebookFriendsQuantity = facebookFriendsQuantity;
    }


    ////////////////////////////////////////////
    // gettery i settery
    ////////////////////////////////////////////
}
