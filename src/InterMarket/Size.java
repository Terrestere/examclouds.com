package InterMarket;

public enum Size {
    XXS (32){
        @Override
        public String getDescription() {
            return "Detskii";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Vzroslii";
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "euroSize=" + euroSize +
                '}';
    }
}
