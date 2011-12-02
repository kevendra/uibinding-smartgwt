package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;
import com.smartgwt.client.widgets.IButton;

public class UIIButton extends IButton implements HasText {

	public UIIButton() {
	}

	public UIIButton(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public UIIButton(String title) {
		super(title);
	}

	@Override
	public String getText() {
		return super.getTitle();
	}

	@Override
	public void setText(String text) {
		super.setTitle(text);
	}

}
