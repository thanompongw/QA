package co.th.genth.qa;

import com.vaadin.Application;
import com.vaadin.ui.*;

public class QaApplication extends Application {
	/**
     * serialVersionUID.
     */
    private static final long serialVersionUID = -2253832490506047236L;
    
    private final VerticalLayout layout = new VerticalLayout();

    @Override
	public void init() {
		final Window mainWindow = new Window("QA Voice File ");
		super.setMainWindow(mainWindow);
		mainWindow.setContent(layout);
		
		this.initUI();
		super.setTheme("gt");
	}
    
    private void initUI() {

        // Have a Panel where to put the custom layout.
        Panel panel = new Panel("Login");
        panel.setSizeUndefined();
        
        layout.addComponent(panel);
        layout.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
        layout.setSizeFull();
         
        // Create custom layout from "layoutname.html" template.
        CustomLayout custom = new CustomLayout("../../gt/layouts/login");
         
        // Use it as the layout of the Panel.
        panel.setContent(custom);
         
        // Create a few components and bind them to the location tags
        // in the custom layout.
        TextField username = new TextField();
        username.setRequired(true);
        username.setMaxLength(15);
        custom.addComponent(username, "username");
         
        PasswordField password = new PasswordField();
        password.setRequired(true);
        password.setMaxLength(8);
        custom.addComponent(password, "password");
         
        Button ok = new Button("Login");
        custom.addComponent(ok, "okbutton");
    }

}
