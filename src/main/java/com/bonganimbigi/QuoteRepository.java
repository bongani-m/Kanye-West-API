package com.bonganimbigi;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bongani on 9/19/2016.
 */

@Component
public class QuoteRepository {

    private List<Quote> quotes;

    public QuoteRepository() {
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        quotes.add(new Quote("MY MUSIC ISN'T JUST MUSIC -- IT'S MEDICINE.", "MusicWorld, 2006", "static/backgrounds/01-kanye.jpg"));
        quotes.add(new Quote("FOR ME TO SAY I WASN’T A GENIUS, I WOULD JUST BE LYING TO YOU AND TO MYSELF.", "Jimmy Kimmel Live, 2013", "static/backgrounds/02-kanye.jpg"));
        quotes.add(new Quote("I FEEL LIKE A LITTLE BIT, LIKE, I’M THE BRAVEHEART OF CREATIVITY.", "San Francisco's 99.7, 2013", "static/backgrounds/03-kanye.jpg"));
        quotes.add(new Quote("I AM WARHOL! I AM THE NUMBER ONE MOST IMPACTFUL ARTIST OF OUR GENERATION. I AM SHAKESPEARE IN THE FLESH. WALT DISNEY, NIKE, GOOGLE.", "Sway in the Morning, 2013", "static/backgrounds/04-kanye.jpg"));
        quotes.add(new Quote("VISITING MY MIND IS LIKE VISITING THE HERMÈS FACTORY.", "W Magazine, 2013", "static/backgrounds/05-kanye.jpg"));
        quotes.add(new Quote("I’M LIKE A VESSEL, AND GOD HAS CHOSEN ME TO BE THE VOICE AND THE CONNECTOR.", "W Magazine, 2013", "static/backgrounds/10-kanye.jpg"));
        quotes.add(new Quote("'EVERYTHING I'M NOT MADE ME EVERYTHING I AM.' IN MY HUMBLE OPINION, THAT'S A PROPHETIC STATEMENT. GANDHI WOULD HAVE SAID SOMETHING LIKE THAT.", "Rolling Stone, 2007", "static/backgrounds/09-kanye.jpg"));
        quotes.add(new Quote("COME ON NOW! HOW COULD YOU BE ME AND WANT TO BE SOMEONE ELSE?", "Guardian, 2005", "static/backgrounds/11-kanye.jpg"));
        quotes.add(new Quote("WHEN I THINK OF MY SHOWS, I THINK IT'S LIKE THE BADDEST CONTINUOUS DELIVERY PIPELINE EVER CREATED BY A DEVOPS OR IT OPS ENGINEER.", "ELASTICBOX, 2014", "static/backgrounds/13-kanye.jpg"));
        this.quotes = quotes;
    }

    public List<Quote> getQuotes() {
        return this.quotes;
    }

}
