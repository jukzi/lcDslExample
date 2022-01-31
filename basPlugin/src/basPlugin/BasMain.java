package basPlugin;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class BasMain implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("BasMain: " + System.getProperty("myArg"));
		return EXIT_OK;
	}

	@Override
	public void stop() {
	}

}
