import java.awt.*;

public class ResourceLoader {
    static ResourceLoader rl= new ResourceLoader();
    public static Image getImage(String filename){
    	return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource(filename));
    }
}
