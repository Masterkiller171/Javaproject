public class drawShop {
    private int multiplier = 1;
    private int muliplierPrice = 10;
    private long value;

    public int getMultiplier(draw draw) {
        this.value = draw.getValue();
        value *= this.multiplier;
        return multiplier;
    }

    public int getMuliplierPrice(draw draw) {
        if (draw.getValue() > 10) {
            this.value = draw.getValue();
             value -= this.muliplierPrice;
            muliplierPrice *= 2;
        }
        return muliplierPrice;
    }
}
