package converter;

public class Main {

    /**
       Convert miles per hour to kilometers per hour.
       @param mph the mile per hour value to be converted
       @return the converted value
    */
    double mphToKph(double mph) {
	return mph * MILES_IN_KILOMETER;
    }
	
    /**
       Convert kilometers per hour to miles per hour.
       @param kph the kilometer per hour vaule to be converted
       @return the converted value
    */
    double kphToMph(double kph) {
	return kph * KILOMETERS_IN_MILE;
    }
	
    /**
       The entry point of the program. Selects the appropriate action based
       on the command line arguments.
       @param args the command line arguments
    */
    public static void main(String[] args) {

	// The number of miles in a kilometer.
	final double MILES_IN_KILOMETER = 1.6026;

	// The number of kilometers in a mile.
	final double KILOMETERS_IN_MILE = 0.624;

	// Command line help message.
	final String help = new StringBuilder( "Usage: converter [-options] [args...]\n")
	    .append("(to convert a value)\n")
	    .append("where options include:\n")
	    .append("\t-mph\tto convert from kilometers per hour to miles per hour\n")
	    .append("\t-kph\tto convert from miles per hour to kilometers per hour\n")
	    .toString();
	
	
	if (args.length == 0) {
	    // If there are no arguments, print help and exit program.
	    System.out.println(help);
	    System.exit(0);
	}

	// The conversion to make.
	final String CONVERSION = args[0];

	// The value to convert.
	final double VAULE = Double.parseDouble(args[1]);

	// The result of conversion.
	final double RESULT;

	switch (CONVERSION) {
	case "-mph":
	    RESULT = mphToKph(VAULE);
	    System.out.println(RESULT + " kph");
	    break;
	case "-kph":
	    //RESULT = kphToMph(VAULE);
	    //System.out.println(RESULT + " mph");
	    break;
	}
	
    }
}
