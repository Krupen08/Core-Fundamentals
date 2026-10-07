package Synchronization_Basics;

// Synchronization is process by which we control the accessibility of multiple threads
// to a particular shared resource...

// Disadvantages :- Increases the waiting time period of threads and create performance issues
class BookingSeat
{
    //int seats;
    int total_seats = 10;
    synchronized void bookingSetTicket(int seats)
    {
        if(total_seats >= seats)
        {
            System.out.println(seats + " Seats Booked Successfully for " + Thread.currentThread().getName());
            total_seats = total_seats-seats;
            System.out.println("Remaining Seats: " + total_seats);
        }
        else
        {
            System.out.println("Seat Booked Failed for " + Thread.currentThread().getName());
            System.out.println("Seat Remaining: " + total_seats);
        }
    }
}
public class Synchronization_Basics extends Thread
{
    static BookingSeat b; // Initialize the static instance for other class to call its Booking method in our run() method
    int seats;
    public void run()
    {
        b.bookingSetTicket(seats);
    }

    public static void main(String[] args) throws InterruptedException
    {

        // Every Object has 2 areas :- Non-Synchronized and Synchronized
        // When anything is written with "synchronized" then that particular method/block/static-syn will be go into synchronized area
        // In synchronized area that particular method/block will acquire lock and other threads would be not able to access it until it is unlocked first.

        b = new BookingSeat();
        Synchronization_Basics Krupen = new Synchronization_Basics();
        Krupen.setName("Krupen");
        Krupen.seats = 7;
        Krupen.start();

        Synchronization_Basics Romil = new Synchronization_Basics();
        Romil.setName("Romil");
        Romil.seats = 6;
        Romil.start();
    }

}
