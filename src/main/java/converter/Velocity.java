package converter;

/**
   Contains methods for converting measures of velocity. The
   constructor is private, and there is no way of instantiating the
   class.
*/
public final class Velocity {
    
    // The number of miles in a kilometer.
    public static final double MILES_IN_KILOMETER = 1.6026;

    // The number of kilometers in a mile.
    public static final double KILOMETERS_IN_MILE = 0.624;

    /** 
	Private empty constructor.
    */
    private Velocity() {}

    /**
       Convert miles per hour to kilometers per hour.
       @param mph the mile per hour value to be converted
       @return the converted value
    */
    public static double mphToKph(double mph) {
	return mph * MILES_IN_KILOMETER;
    }
	
    /**
       Convert kilometers per hour to miles per hour.
       @param kph the kilometer per hour vaule to be converted
       @return the converted value
    */
    public static double kphToMph(double kph) {
	return kph * KILOMETERS_IN_MILE;
    }
    
    
}
