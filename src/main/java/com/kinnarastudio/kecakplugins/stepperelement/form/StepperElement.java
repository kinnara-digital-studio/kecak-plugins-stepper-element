package com.kinnarastudio.kecakplugins.stepperelement.form;

import java.util.Map;

import org.joget.apps.app.service.AppUtil;
import org.joget.apps.form.model.Element;
import org.joget.apps.form.model.FormBuilderPaletteElement;
import org.joget.apps.form.model.FormData;
import org.joget.apps.form.service.FormUtil;

public class StepperElement extends Element implements FormBuilderPaletteElement{

    @Override
    public String getFormBuilderTemplate() {
        return "Stepper: ";
    }

    @Override
    public String getClassName() {
        return StepperElement.class.getName();
    }

    @Override
    public String getLabel() {
        return "Stepper";
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClassName(), "/properties/stepper.json");
    }

    @Override
    public String getDescription() {
        return getClass().getPackage().getImplementationTitle();
    }

    @Override
    public String getName() {
        return "Stepper";
    }

    @Override
    public String getVersion() {
        return getClass().getPackage().getImplementationVersion();
    }

    @Override
    public String getFormBuilderCategory() {
        return "Kecak";
    }

    @Override
    public String getFormBuilderIcon() {
        return null;
    }

    @Override
    public int getFormBuilderPosition() {
        return 100;
    }

    @Override
    public String renderTemplate(FormData formData, Map map) {
        String value = FormUtil.getElementPropertyValue(this, formData);
        map.put("value", value);
        
        return FormUtil.generateElementHtml(this, formData, "stepper.ftl", map);
    }    
}
