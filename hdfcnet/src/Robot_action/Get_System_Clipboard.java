package Robot_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Get_System_Clipboard {

	public static void main(String[] args) throws IOException, AWTException {
		String command ="notepad.exe";
		Runtime run =Runtime.getRuntime();
		run.exec(command);
		String tetx="The Robot class in the Java AWT package is used to";
	StringSelection stext=	new StringSelection(tetx);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents( stext, stext);
// create robot class awt
	Robot robot=new Robot();
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	}

}
