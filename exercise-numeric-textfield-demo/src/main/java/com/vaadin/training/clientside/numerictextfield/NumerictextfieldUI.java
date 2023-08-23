package com.vaadin.training.clientside.numerictextfield;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class NumerictextfieldUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = NumerictextfieldUI.class, widgetset = "com.vaadin.training.clientside.numerictextfield.DemoWidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    public void init(VaadinRequest request) {
        NumericTextField ntf = new NumericTextField();
        ntf.setImmediate(true);
        ntf.setNullRepresentation("");

        setContent(ntf);
    }

}
