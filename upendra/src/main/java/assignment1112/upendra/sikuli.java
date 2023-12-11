package assignment1112.upendra;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class sikuli {
	public static void main(String[] args ) throws FindFailed {
		Screen s = new Screen();
		Pattern p = new Pattern("C:\\Users\\Testing\\Desktop\\siluli\\Capture.PNG");
		s.doubleClick(p);
	}
}




