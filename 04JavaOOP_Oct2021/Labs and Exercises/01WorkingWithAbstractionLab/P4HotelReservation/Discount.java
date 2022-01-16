package day1.WorkingWithAbstractionLab.P4.HotelReservation;

public enum Discount {
    VIP(0.8),
    SECOND_VISIT(0.9),
    None(1);

    private final double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public static Discount parseDiscount(String discount) {
        switch (discount) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return None;
            default:
                throw new IllegalArgumentException("Unknown discount type " + discount);
        }
    }
}
