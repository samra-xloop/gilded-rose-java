class BackstagePass extends Item {
    public BackstagePass(String name, int quality, int daysRemaining) {
        super(name, quality, daysRemaining);
    }

    @Override
    public void tick() {
        if (quality < 50) {
            quality++;
        }
        if (daysRemaining < 11) {
            if (quality < 50) {
                quality++;
            }
        }
        if (daysRemaining < 6) {
            if (quality < 50) {
                quality++;
            }
        }
        daysRemaining--;
        if (daysRemaining < 0) {
            quality = 0;
        }
    }
}
