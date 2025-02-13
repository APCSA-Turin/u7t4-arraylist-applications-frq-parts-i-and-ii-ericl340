package com.example.project.Airport;
import java.util.ArrayList;

public class Airport  {
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights) {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights() {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue() {
        double s = 0;
        for (int i = 0; i < allFlights.size(); i++) {
            int p = allFlights.get(i).getNumPassengers();
            int c = allFlights.get(i).getCapacity();
            s += (c < p ? c : p)  * allFlights.get(i).getPrice();
        }
        return s;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights() {
        int s = 0;
        for (int i = 0; i < allFlights.size(); i++) {
            if (allFlights.get(i).getCapacity() / allFlights.get(i).getNumPassengers() >= 5) {
                s += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
                i--;
            }
        }
        return s;
    }
}