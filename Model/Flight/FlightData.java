package flightmanagementsystem.Model.Flight;

import java.util.List;

public class FlightData extends Flight {
    List<Flight> flights;

    public List<Flight> getFlights() {
        return flights;
    }

    public void printAvailableFlights() {
        List<Flight> availFlights = this.flights;
        System.out.println("Available flights : " + availFlights.size());
        for (Flight flight : flights) {
            System.out.println("Flight Number " + " \n " + flight.getFlightNumber());
            System.out.println("Airline " + " \n " + flight.airline);
            System.out.println("Fare " + " \n " + flight.fare);
            System.out.println("Seats " + " \n " + flight.seats);
        }
    }
}
