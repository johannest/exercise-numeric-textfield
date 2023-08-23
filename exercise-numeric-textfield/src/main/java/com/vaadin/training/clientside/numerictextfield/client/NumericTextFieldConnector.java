package com.vaadin.training.clientside.numerictextfield.client;

import com.google.gwt.core.client.GWT;
import com.vaadin.client.ui.VTextField;
import com.vaadin.client.ui.textfield.TextFieldConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.training.clientside.numerictextfield.NumericTextField;

@Connect(NumericTextField.class)
public class NumericTextFieldConnector extends TextFieldConnector {

    public NumericTextFieldConnector() {
        // TODO: add keydown handler to the widget that allows only numbers
    }

    @Override
    protected VTextField createWidget() {
        return GWT.create(VTextField.class);
    }

    @Override
    public VTextField getWidget() {
        return super.getWidget();
    }

}
