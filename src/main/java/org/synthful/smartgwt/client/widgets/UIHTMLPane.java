package org.synthful.smartgwt.client.widgets;

import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.smartgwt.client.types.ContentsType;
import com.smartgwt.client.widgets.HTMLPane;

public class UIHTMLPane extends HTMLPane implements HasText, HasHTML, UIMasquerade<HTMLPane> {

	@Override
	public String getText() {
		return super.getContents();
	}

	@Override
	public void setText(String text) {
		super.setContents(text);
	}

	@Override
	public String getHTML() {
		return super.getContents();
	}

	@Override
	public void setHTML(String html) {
		super.setContents(html);
	}

	@Override
	public HTMLPane getSmartObject() {
		return this;
	}

	public void setContentsType(String value) {
		if(value != null && !"".equals(value)) {
			ContentsType contentsType = ContentsType.valueOf(value.toUpperCase());
			super.setContentsType(contentsType);
		}
	}
}
