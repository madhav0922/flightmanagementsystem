package flightmanagementsystem.Model.Flight;

import java.util.List;

public class ModifyFlightData extends Flight {

    public void addFlight(Flight flight) {
        List<Flight> availFlights = new FlightData().getFlights();
        availFlights.add(flight);
        System.out.println("Flight added");
    }
}
