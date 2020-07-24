package test.jplugin.extension.testapp;



import net.jplugin.core.kernel.api.AbstractPlugin;
import net.jplugin.core.kernel.api.PluginAnnotation;

@PluginAnnotation
public class Plugin  extends AbstractPlugin{

	public Plugin() {
		this.searchAndBindExtensions();
		
		
		
		//new version
		
		//hahaah
		//bbbb
		//ccc
		System.out.println("aaa");
		
		
		
		
		System.out.println("aaa");
		
		
		
		
	
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
