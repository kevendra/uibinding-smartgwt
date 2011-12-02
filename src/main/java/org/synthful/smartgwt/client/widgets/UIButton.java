package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasText;
import com.smartgwt.client.widgets.Button;

public class UIButton extends Button implements HasText {

	public UIButton() {
	}

	public UIButton(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public UIButton(String title) {
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
