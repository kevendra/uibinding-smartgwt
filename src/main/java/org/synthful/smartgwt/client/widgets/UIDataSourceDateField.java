package org.synthful.smartgwt.client.widgets;

import com.smartgwt.client.data.fields.DataSourceDateField;

public class UIDataSourceDateField
extends UIDataSourceField {

	public UIDataSourceDateField() {
		field = new DataSourceDateField();
	}
    public void setUseTextField(Boolean useTextField) {
        ((DataSourceDateField)field).setUseTextField(useTextField);
    }
}
