package co.th.genth.qa.ui;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.*;

public class StaffUI extends CustomComponent {
    
    @AutoGenerated
    private AbsoluteLayout mainLayout;
    @AutoGenerated
    private Panel staffPanel;
    @AutoGenerated
    private VerticalLayout staffVerticalLayout;
    @AutoGenerated
    private ComboBox cbxSection;
    @AutoGenerated
    private TextField txtStaffName;
    @AutoGenerated
    private TextField txtStaffCode;

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 9174291145324405344L;

    /**
     * The constructor should first build the main layout, set the
     * composition root and then do any custom initialization.
     *
     * The constructor will not be automatically regenerated by the
     * visual editor.
     */
    public StaffUI() {
        buildMainLayout();
        setCompositionRoot(mainLayout);
    }
    
    @AutoGenerated
    private AbsoluteLayout buildMainLayout() {
        // common part: create layout
        mainLayout = new AbsoluteLayout();
        mainLayout.setImmediate(false);
        mainLayout.setWidth("100%");
        mainLayout.setHeight("100%");
        mainLayout.setMargin(false);
        
        // top-level component properties
        setWidth("100.0%");
        setHeight("100.0%");
        
        // staffPanel
        staffPanel = buildStaffPanel();
        mainLayout.addComponent(staffPanel, "top:0.0px;right:8.0px;bottom:-4.0px;left:0.0px;");
        
        return mainLayout;
    }

    @AutoGenerated
    private Panel buildStaffPanel() {
        // common part: create layout
        staffPanel = new Panel();
        staffPanel.setCaption("Staff");
        staffPanel.setImmediate(false);
        staffPanel.setWidth("100.0%");
        staffPanel.setHeight("100.0%");
        
        // staffVerticalLayout
        staffVerticalLayout = buildStaffVerticalLayout();
        staffPanel.setContent(staffVerticalLayout);
        
        return staffPanel;
    }

    @AutoGenerated
    private VerticalLayout buildStaffVerticalLayout() {
        // common part: create layout
        staffVerticalLayout = new VerticalLayout();
        staffVerticalLayout.setImmediate(false);
        staffVerticalLayout.setWidth("100.0%");
        staffVerticalLayout.setHeight("-1px");
        staffVerticalLayout.setMargin(true);
        staffVerticalLayout.setSpacing(true);
        
        // txtStaffCode
        txtStaffCode = new TextField();
        txtStaffCode.setCaption("Staff Code");
        txtStaffCode.setImmediate(false);
        txtStaffCode.setWidth("-1px");
        txtStaffCode.setHeight("-1px");
        txtStaffCode.setTabIndex(1);
        txtStaffCode.setRequired(true);
        txtStaffCode.setMaxLength(6);
        txtStaffCode.setSecret(false);
        staffVerticalLayout.addComponent(txtStaffCode);
        
        // txtStaffName
        txtStaffName = new TextField();
        txtStaffName.setCaption("Staff Name");
        txtStaffName.setImmediate(false);
        txtStaffName.setWidth("-1px");
        txtStaffName.setHeight("-1px");
        txtStaffName.setTabIndex(2);
        txtStaffName.setRequired(true);
        txtStaffName.setMaxLength(50);
        txtStaffName.setSecret(false);
        staffVerticalLayout.addComponent(txtStaffName);
        
        // cbxSection
        cbxSection = new ComboBox();
        cbxSection.setCaption("Section");
        cbxSection.setImmediate(false);
        cbxSection.setWidth("-1px");
        cbxSection.setHeight("-1px");
        cbxSection.setTabIndex(3);
        cbxSection.setRequired(true);
        staffVerticalLayout.addComponent(cbxSection);
        
        return staffVerticalLayout;
    }
    
}
