class AgedBrie extends Item {
    public AgedBrie(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    @Override
    public void tick() {
        if (quality < 50) {
            quality++;
        }
        daysRemaining--;
        if (daysRemaining < 0) {
            if (quality < 50) {
                quality++;
            }
        }
    }
}
