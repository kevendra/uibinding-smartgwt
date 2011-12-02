package org.synthful.smartgwt.client.widgets;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.HasHTML;
import com.smartgwt.client.widgets.ImgButton;

public class UIImgButton extends ImgButton implements HasHTML {

	public UIImgButton() {
	}
	
	public UIImgButton(JavaScriptObject jsObj) {
		super(jsObj);
	}
	
	@Override
	public String getHTML() {
		return super.getSrc();
	}

	@Override
	public void setHTML(String src) {
		super.setSrc(src);
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String arg0) {
		// TODO Auto-generated method stub
		
	}

}
