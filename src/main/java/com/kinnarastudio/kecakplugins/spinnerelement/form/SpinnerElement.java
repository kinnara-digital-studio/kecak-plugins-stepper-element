package com.kinnarastudio.kecakplugins.spinnerelement.form;

import java.util.Map;

import org.joget.apps.app.service.AppUtil;
import org.joget.apps.form.model.Element;
import org.joget.apps.form.model.FormBuilderPaletteElement;
import org.joget.apps.form.model.FormData;
import org.joget.apps.form.service.FormUtil;

public class SpinnerElement extends Element implements FormBuilderPaletteElement{

    @Override
    public String getFormBuilderTemplate() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getFormBuilderTemplate'");
        return "Spinner: ";
    }

    @Override
    public String getClassName() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getClassName'");
        return SpinnerElement.class.getName();
    }

    @Override
    public String getLabel() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getLabel'");
        return "Spinner";
    }

    @Override
    public String getPropertyOptions() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getPropertyOptions'");
        return AppUtil.readPluginResource(getClassName(), "/properties/spinner.json");
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
        return getClass().getPackage().getImplementationTitle();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getName'");
        return "Spinner";
    }

    @Override
    public String getVersion() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getVersion'");
        return getClass().getPackage().getImplementationVersion();
    }

    @Override
    public String getFormBuilderCategory() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getFormBuilderCategory'");
        return "Kecak";
    }

    @Override
    public String getFormBuilderIcon() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getFormBuilderIcon'");
        return null;
    }

    @Override
    public int getFormBuilderPosition() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getFormBuilderPosition'");
        return 100;
    }

    @Override
    public String renderTemplate(FormData formData, Map map) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'renderTemplate'");
        String value = FormUtil.getElementPropertyValue(this, formData);
        map.put("value", value);
        
        return FormUtil.generateElementHtml(this, formData, "spinner.ftl", map);
    }    
}
