package zad_08;

public final class ImmutableYachtPosition {
    private final double latitude;
    private final double longitude;
    private final double altitude;

    public ImmutableYachtPosition(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + latitude + ": " + longitude + ": " + altitude;
    }

    public ImmutableYachtPosition move(double latitudeChange, double longitudeChange, double altitudeChange) {
        double newLatitude = this.latitude + latitudeChange;
        double newLongitude = this.longitude + longitudeChange;
        double newAltitude = this.altitude + altitudeChange;
        return new ImmutableYachtPosition(newLatitude, newLongitude, newAltitude);
    }
}
