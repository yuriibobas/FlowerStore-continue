package ua.edu.ucu.apps.lab7.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    /** String representation of a color. */
    private final String stringRepresentation;

    /** Setter of a color.
     *
     * @param colorStringRepresentation string representation of a color
     */
    FlowerColor(final String colorStringRepresentation) {
        this.stringRepresentation = colorStringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
