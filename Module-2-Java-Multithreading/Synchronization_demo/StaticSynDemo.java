package Synchronization_demo;

class BookTheaterApp
{
    static int totalSeats = 20;

    // Static synchronize will be applied for class level lock and not for object level...
    // Without class level lock,because of multiple objects creation, Data inconsistency happens...
    // That's why we use static keyword for multiple objects to invoke a class...
    // If we do not do this then every object will have different locking areas where they would create data inconsistency problems...
    static synchronized void bookSeat(int seats)
    {
        if (totalSeats >= seats )
        {
            System.out.println(seats + " Seats booked successfully for : "+ Thread.currentThread().getName());
            totalSeats = totalSeats - seats;
            System.out.println("Seats left : " + totalSeats);
        }
        else
        {
            System.out.println(seats + " Seats cannot booked for : " + Thread.currentThread().getName());
            System.out.println("Seats left : " + totalSeats);
        }
    }
}

class MyThread1 extends Thread
{
    BookTheaterApp b;
    int seats;

    MyThread1(BookTheaterApp b, int seats)
    {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run()
    {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread
{
    BookTheaterApp b;
    int seats;

    MyThread2(BookTheaterApp b, int seats)
    {
        this.b = b;
        this.seats = seats;
    }

    @Override
    public void run()
    {
        b.bookSeat(seats);
    }
}

public class StaticSynDemo
{
    static void main(String[] args)
    {
        BookTheaterApp b1 = new BookTheaterApp();

        MyThread1 t1 = new MyThread1(b1, 15);
        t1.start();

        MyThread2 t2 = new MyThread2(b1, 6);
        t2.start();

        //-------------------------------------------

        BookTheaterApp b2 = new BookTheaterApp();

        MyThread2 t3 = new MyThread2(b2, 5);
        t3.start();

        MyThread2 t4 = new MyThread2(b2, 9);
        t4.start();

    }
}
