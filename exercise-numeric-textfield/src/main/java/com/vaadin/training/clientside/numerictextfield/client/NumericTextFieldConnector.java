package com.vaadin.training.clientside.numerictextfield.client;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.vaadin.client.ui.VTextField;
import com.vaadin.client.ui.textfield.TextFieldConnector;
import com.vaadin.shared.ui.Connect;
import com.vaadin.training.clientside.numerictextfield.NumericTextField;

@SuppressWarnings("serial")
@Connect(NumericTextField.class)
public class NumericTextFieldConnector extends TextFieldConnector {

    private List<Integer> acceptedKeyCodes = new ArrayList<Integer>();

    public NumericTextFieldConnector() {
        java.util.logging.Logger.getLogger(getClass().getSimpleName())
                .log(Level.WARNING, "Hey there");
        acceptedKeyCodes.add(KeyCodes.KEY_ZERO);
        acceptedKeyCodes.add(KeyCodes.KEY_ONE);
        acceptedKeyCodes.add(KeyCodes.KEY_TWO);
        acceptedKeyCodes.add(KeyCodes.KEY_THREE);
        acceptedKeyCodes.add(KeyCodes.KEY_FOUR);
        acceptedKeyCodes.add(KeyCodes.KEY_FIVE);
        acceptedKeyCodes.add(KeyCodes.KEY_SIX);
        acceptedKeyCodes.add(KeyCodes.KEY_SEVEN);
        acceptedKeyCodes.add(KeyCodes.KEY_EIGHT);
        acceptedKeyCodes.add(KeyCodes.KEY_NINE);
        acceptedKeyCodes.add(KeyCodes.KEY_BACKSPACE);
        acceptedKeyCodes.add(KeyCodes.KEY_DELETE);
        acceptedKeyCodes.add(KeyCodes.KEY_LEFT);
        acceptedKeyCodes.add(KeyCodes.KEY_RIGHT);

        getWidget().addKeyDownHandler(new KeyDownHandler() {
            @Override
            public void onKeyDown(KeyDownEvent event) {
                if (!acceptedKeyCodes.contains(event.getNativeKeyCode())) {
                    event.preventDefault();
                }
            }
        });
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
