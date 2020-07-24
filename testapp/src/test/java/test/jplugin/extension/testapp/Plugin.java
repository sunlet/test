package test.jplugin.extension.testapp;



import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.core.kernel.api.PluginAnnotation;

@PluginAnnotation
public class Plugin  extends AbstractPlugin{

	public Plugin() {
		this.searchAndBindExtensions();
		
		
		
		
		
		
		
		
		
		//
		
		
		
	
	}

	@Override
	public void init() {
		
		System.out.println("initing.....");
	}

	@Override
	public int getPrivority() {
		return 0;
	}
	
	
}
