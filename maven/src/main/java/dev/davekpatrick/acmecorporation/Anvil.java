
package dev.davekpatrick.acmecorporation;
/**
 * Hello world!
 *
 */
public class Anvil 
{
    public static void main( String[] args )
    {
      try {
          String greetingType = args[0];
          //
          if (  greetingType.equals("version") ) {
            // Print the version
            String version = Anvil.class.getPackage().getImplementationVersion();
            System.out.println(version);
          } else if ( greetingType.equals("help") ) {
            // Print the help
            System.out.println( "cmd <greetingType>" );
          } else {
             // apply Capitalization the greeting
             String greetingTypeMsg = greetingType.substring(0, 1).toUpperCase() + greetingType.substring(1);
             System.out.println( greetingTypeMsg + ", World!" );
          }
      }
      catch (ArrayIndexOutOfBoundsException e) {
          System.out.println ("ArrayIndexOutOfBoundsException caught");
      }
      finally {
        // Do nothing
      }
    }
}
