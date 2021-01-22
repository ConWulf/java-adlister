import models.Album;
import models.Author;
import models.Employee;
import models.Quote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
//        Employee bob = new Employee();
//        bob.setEmpNo(1L);
//        bob.setFirstName("bob");
//        bob.setLastName("boby");
//        bob.setBirthDate(new Date());
//        bob.setHireDate(new Date());
//        bob.setGender('M');

//        System.out.printf("full name = %s %s", bob.getFirstName(), bob.getLastName());
//        List<Album> albumList = new ArrayList<>();
//        Album a1 = new Album();
//        Album a2 = new Album();
//        Album a3 = new Album();
//        Album a4 = new Album();
//        a1.setArtist("P!NK");
//        a1.setName("F**ckin perfect");
//        a1.setGenre("rock, pop");
//        a1.setDate(2010);
//        a1.setId(1L);
//        a2.setArtist("Pentatonix");
//        a2.setName("at home");
//        a2.setGenre("pop, A cappella");
//        a2.setDate(2020);
//        a2.setId(2L);
//        a3.setArtist("Blackpink");
//        a3.setName("Blackpink in your area");
//        a3.setGenre("kpop");
//        a3.setDate(2018);
//        a3.setId(3L);
//        a4.setArtist("Imagine Dragons");
//        a4.setName("evolve");
//        a4.setGenre("alternative");
//        a4.setDate(2017);
//        a4.setId(4L);
//        albumList.add(a1);
//        albumList.add(a2);
//        albumList.add(a3);
//        albumList.add(a4);

//        for (Album album : albumList) {
//            System.out.println("name: "+album.getName()+", artist: "+album.getArtist());
//        }

        Author douglasAdams = new Author();
        Author markTwain = new Author();
        Author kurtVonnegut = new Author();
        douglasAdams.setFirstName("Douglas");
        douglasAdams.setLastName("Adams");
        markTwain.setFirstName("Mark");
        markTwain.setLastName("Twain");
        kurtVonnegut.setFirstName("Kurt");
        kurtVonnegut.setLastName("Vonnegut");
        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        Quote quote3 = new Quote();
        Quote quote4 = new Quote();
        Quote quote5 = new Quote();
        quote1.setAuthor(douglasAdams);
        quote1.setContent("I love deadlines. I love the whooshing noise they make as they go by.");
        quote2.setAuthor(douglasAdams);
        quote2.setContent("Don't Panic.");
        quote3.setAuthor(douglasAdams);
        quote3.setContent("Time is an illusion. Lunchtime doubly so.");
        quote4.setAuthor(markTwain);
        quote4.setContent("Clothes make the man. Naked people have little or no influence on society.");
        quote5.setAuthor(kurtVonnegut);
        quote4.setContent("The universe is a big place, perhaps the biggest.");

        List<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3, quote4, quote5));
        for (Quote quote : quotes) {
            System.out.println("quote: "+quote.getContent()+"-- author: "+
                    quote.getAuthor().getFirstName()+" "+quote.getAuthor().getLastName());
        }
    }

}
