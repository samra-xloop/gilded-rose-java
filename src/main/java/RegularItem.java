class RegularItem extends Item {
    public RegularItem(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    @Override
    public void tick() {
        if (quality > 0) {
            quality--;
        }
        daysRemaining--;
        if (daysRemaining < 0) {
            if (quality > 0) {
                quality--;
            }
        }
    }
}