# converter
A command line tool for converting units of measure

## Velocity
Converter provides methods for the following conversions:
* Miles per hour to kilometers per hour
* Kilometers per hour to miles per hour

## Build
Clone the repo and build using the ant script.

`git clone https://github.com/samWson/converter.git`
`cd converter`
`ant`

## Usage
Run at the terminal with the `java` command. A help menu is printed when no arguments are supplied.
To convert a value, provide the conversion and the vaule you want to convert as arguments e.g.

Convert 5 miles per hour to kilometers per hour:

`java -cp build/classes converter.Main -kph 5`

or if the ant 'jar' target has been run:

`java -jar build/jar/converter.jar -kph 5