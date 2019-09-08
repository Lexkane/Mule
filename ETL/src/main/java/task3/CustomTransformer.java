package task3;

//CustomTransformer class for transforming string into CamelCase
public class CustomTransformer   {
	
	  public static String toCamelCase(final String init)  {
		    if (init == null)
		        return null;

		    final StringBuilder ret = new StringBuilder(init.length());

		    for (final String word : init.split(" ")) {
		        if (!word.isEmpty()) {
		            ret.append(Character.toUpperCase(word.charAt(0)));
		            ret.append(word.substring(1).toLowerCase());
		        }
		        if (!(ret.length() == init.length()))
		            ret.append(" ");
		    }

		    return ret.toString();
		}
	

}
