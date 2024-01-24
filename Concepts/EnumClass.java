package Concepts;

enum Mobile {
    iPhone(80_000), Real_me(20_000), Samsung, OnePlus(30_000);

    private int price;

    private Mobile() {
        this.price = 50_000;
    }

    private Mobile(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        for(Mobile m : Mobile.values()) {
            System.out.println(m + " : ₹" + m.getPrice());
        }
    }
}
