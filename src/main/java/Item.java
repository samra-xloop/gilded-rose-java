abstract class Item {
    public String name;
    public int quality;
    public int daysRemaining;

    public Item(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public abstract void tick();
}

