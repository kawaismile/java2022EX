/**
 * Created with IntelliJ IDEA.
 *
 * @Package:IntelliJ IDEA
 * @Project:ideacode
 * @User:megumi
 * @Author: kawaismile
 * @Date: 2022/06/25/9:07
 * @Description:
 */
public class Hotel {
    private String name;
    private int rooms;
    private int booked;
    public Hotel(String name, int rooms) {
        this.name = name;
        this.rooms = rooms;
        this.booked = 0;
    }
    public Hotel() {
        System.out.println("Hotel");
    }
    public String getName() {
        return name;
    }
    public int getRooms() {
        return rooms;
    }
    public int getBooked() {
        return booked;
    }
    public void book() {
        if (rooms > booked) {
            booked++;
        }
    }
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        hotel.run();
    }

    public void run() {
        Hotel hotel = new Hotel();
        hotel.checkIn();
        hotel.checkOut();
    }
    public void checkIn() {
        System.out.println("Check in");
    }

    public void checkOut() {
        System.out.println("Check out");
    }
}



