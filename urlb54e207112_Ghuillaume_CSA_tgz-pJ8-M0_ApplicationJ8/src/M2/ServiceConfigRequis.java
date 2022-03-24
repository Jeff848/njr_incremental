package M2;

import M0.Trace;

public class ServiceConfigRequis extends ServiceConfig {

	public ServiceConfigRequis(String name, Configuration config) {
		super(name, config);
	}
	
	public void run(String message) {
		// Pas de comportement par défaut
	}


	@Override
	public final void activate(String message) {
		Trace.printInterfaceActivation(this, message);
		this.run(message);
	}
}
