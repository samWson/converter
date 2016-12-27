package converter;

public class Main {

    public static void main(String[] args) {

	// Command line help message.
	final String help = new StringBuilder( "Usage: converter [-options] [args...]\n")
	    .append("(to convert a value)\n")
	    .append("where options include:\n")
	    .append("\t-mph\tto convert from kilometers per hour to miles per hour\n")
	    .append("\t-kph\tto convert from miles per hour to kilometers per hour\n")
	    .toString();
	
	
	if (args.length == 0) {
	    System.out.println(help);
	}
    }
}
