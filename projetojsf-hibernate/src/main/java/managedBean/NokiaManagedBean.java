package managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.NokiaCel;

@ManagedBean(name="NokiaManagedBean")
@ViewScoped
public class NokiaManagedBean {
	
	NokiaCel nokiacel = new NokiaCel(); 

}
