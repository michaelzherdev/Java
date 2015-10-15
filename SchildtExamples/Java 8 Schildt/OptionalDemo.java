import java.util.Locale;
import java.util.Optional;
import java.util.TimeZone;


public class OptionalDemo {

	public static void main(String[] args) {
		Optional<String> noVal = Optional.empty();
		Optional<String> withVal = Optional.of("ABCDE");
		
		if(noVal.isPresent())
			System.out.println("This won`t be displayed.");
		
		if(withVal.isPresent())
			System.out.println("This will be displayed.");
		
		String defStr = noVal.orElse("Default String");
		System.out.println(defStr);
		
		
		System.out.println(Locale.getDefault());
		
	}

}
