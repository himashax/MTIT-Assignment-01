package movieservicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		IMovieService moviePublisherService = new MovieServiceImpl();
		publishServiceRegistration = bundleContext.registerService(IMovieService.class.getName(), moviePublisherService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
