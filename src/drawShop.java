public class drawShop {
    private int multiplier = 1;
    private int muliplierPrice = 10;

    public long upDateMuliplier(long value) {

             value -= this.muliplierPrice;
            muliplierPrice *= 2;
            this.multiplier++;
        return value;
    }

    public int getMuliplierPrice() {
        return muliplierPrice;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
