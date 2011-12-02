package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.data.fields.DataSourceImageField;

public class UIDataSourceImageField
extends UIDataSourceField {

	public UIDataSourceImageField() {
		field = new DataSourceImageField();
	}
	
    public void setImageHeight(String imageHeight) {
    	field.setAttribute("imageHeight", imageHeight);
    }

    public void setImageWidth(String imageWidth) {
    	field.setAttribute("imageWidth", imageWidth);
    }

    // Rename setWidth to setDataSrcWidth to avoid clash with widget.setWidth
    public void setDataSrcWidth(Integer length) {
    	field.setAttribute("width", length);
    }

    public void setImageURLPrefix(String imageURLPrefix) {
    	field.setAttribute("imageURLPrefix", imageURLPrefix);
    }

    public String getImageURLPrefix() {
    	return field.getAttribute("imageURLPrefix");
    }
	
}
