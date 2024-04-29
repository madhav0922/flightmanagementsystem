package flightmanagementsystem.Model.SearchFlight;

import java.util.List;

import flightmanagementsystem.Model.Flight.Flight;

public class SearchFlight {

    // Search by indexing the flight id.
    public List<Flight> searchFlightByPreferedAirline(String from, String to, String departDate, int paxCount,
            String preferredAirline, String sortBy, String sortType) {
        // Find the preferredflight using list of flights
        Flight flight = new Flight();
        List<Flight> availableFlights = flight.get
        // from src to dest

        // check paxCount does not exceed available passengers

        // check if flight seats are not already booked

        // check if preferred airline is available

        // Sort using enums as sortType

    }

    // one more trick is to get the latest fare.
    // fares is the main trick for this question.

    // double and float are not perfect values
    // we store the values in terms of int and long
    // google search

    // form a admins perspective if its nullable.. and people make mistakes..
    // so if its nullable then we could get it done.
    // notnull is field level

    // faretype is like for economy, business class and all that

    // the lock is not implemented, timeout is done

    // what are DTOs?

    // the endpoints should never be in camelcase

    // it should be search-flight and no camelcase

    // seggragate the controller layers..
    // user controller, flight controller
    // but we are only going to book
    // they expect the production ready code hence he is not willing to see the
    // fully fledged code.
    // how much you have considered in detail is what they expect not everything.
    // should i implement the rest APIs?
    // he just went through the class like

    // for twitter we cant post more than 5 posts.. lets say
    // he checked if the whole code is loosely coupled or not. How many layers have
    // we maintained..

    // controller - client
    // repo
    // DTO layer
    // ENUMS
    // UTILS layer
    // exceptions layer - super or specific custom exceptions

    // we could also name them as layering only

    // every management system is like this only - how we are maintaining the code..
    // code it in a neat way.

    // gather requirements only 4 to 5 requirements.
    // keep it comfortable with

    // the logic behind db should be so efficient.
    // service layers should be loosely coupled.

    // which companies - amazon, UBI, target, bank of singapore - SDE 2 / SDE 3.
    // SDE2 and 3 will get machine coding for user.
    // They may give it orally, or in written format.
    // they explain you for 10 mins and leave. and they give you written format,
    // please discuss I'll stay in call for 2 mins and then you may start the
    // problem and he will leave.
    // how you are making him understand what are the necessary things we get--
    // LLD is small problems for us. HLD would not be there.
    // Machine code round would also deal with HLD.. how will you share the data and
    // how would you maintain the node db? how can we migrate? if we want to?
    // how would you implement kafka? how would you do it? are you able to deal with
    // microservices? I see microservices here only 3 - > payment gateway, for user
    // different, for remaining one user service, so only 3
    // payment as separate microservice -> on the basis of business functionality.
    // even for authorizing also

    // DSA -> all medium based questions -> google cloud, google maps, if you are
    // applying there.. they expect you to focus on DS like graphs, DP, structures..
    // standard / payments -> collections / linked list / stacks
    // big tech companies -> after clearing telephonic round -> they will mail you
    // regarding the DS you need to practice, max is for 30 days to 45 days. THEY
    // WILL WAIT.
    // apple does this / meta does this.
    // Concentrating on the medium questions is really important.
    // Small companies follow those problems -> grind 150 and all
    // BIG COMPANIES like microsoft -> there level is like CP.

    // design data intensive problems
    // aug 2022 -> scaler
    // understand the DS.. couldn't able to learn much.
    // There was a guy striver -> he is also ex-scaler.. he thought well about DP
    // and graphs..
    // he planned his journey, he thought for 6 months..
    // in notice period..
}
