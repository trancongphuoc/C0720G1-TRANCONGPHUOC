package java00_extra_exercise.validate;

import java00_extra_exercise.exception.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String REGEX_ID_BOOK = "^BK-\\d{4}$";
    private static final String REGEX_NAME_AUTHOR = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    private static final String REGEX_NAME_BOOk = "^[A-Z][a-z]+(\\s[a-z]{2,})*$";
    private static final String REGEX_PUBLISHING_YEAR= "^([0][1-9]|[12][0-9]|[3][01])/([0][1-9]|[1][012])/\\d{4}$";
    private static final String REGEX_BOOK_TYPE = "^science|Science|art|Art|Technology|technology|Children|children$";

    public static void regexIdBook(String idBook) throws IDBookException {
        pattern = Pattern.compile(REGEX_ID_BOOK);
        matcher = pattern.matcher(idBook);
        if (!matcher.find()) throw new IDBookException("ID Failed!!!");
    }

    public static void regexNameAuthor(String author) throws NameException {
        pattern = Pattern.compile(REGEX_NAME_AUTHOR);
        matcher = pattern.matcher(author);
        if (!matcher.find()) throw new NameException("Name Author Failed!!!");
    }

    public static void regexPrice(String price) throws PriceException, NumberFormatException {
        if (Double.parseDouble(price) < 0) throw new PriceException("Price Failed!!!");
    }

    public static void regexNameBook(String nameBook) throws NameException {
        pattern = Pattern.compile(REGEX_NAME_BOOk);
        matcher = pattern.matcher(nameBook);
        if (!matcher.find()) throw new NameException("Name Book Failed!!!");
    }

    public static void regexDay(String publishingYear) throws PublishingYearException {
        pattern = Pattern.compile(REGEX_PUBLISHING_YEAR);
        matcher = pattern.matcher(publishingYear);
        if (!matcher.find()) throw new PublishingYearException("Publishing Year Failed!!!");
    }

    public static void regexBookType(String bookType) throws BookTypeException {
        pattern = Pattern.compile(REGEX_BOOK_TYPE);
        matcher = pattern.matcher(bookType);
        if (!matcher.find()) throw new BookTypeException("Book type Failed!!!");
    }

}
