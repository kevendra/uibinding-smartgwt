package org.synthful.smartgwt.client.widgets;

import org.synthful.smartgwt.client.UIMasqueradedWidgetArray;

import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.viewer.DetailViewerField;

public class UIDetailViewerFieldArray extends UIMasqueradedWidgetArray<UIDetailViewerField, DetailViewerField>{

	@Override
	public void add(Widget widget) {
		if (widget instanceof UIDetailViewerField){
			addMasqueradedWidget((UIDetailViewerField)widget);
		}
	}

	@Override
	public boolean remove(Widget widget) {
		if (widget instanceof UIDetailViewerField){
			return removeMasqueradedWidget((UIDetailViewerField)widget);
		}
		return false;
	}
	
	public DetailViewerField[] toArray(){
		DetailViewerField[] a = new DetailViewerField[items.size()];
		items.toArray(a);
		return a;
	}
}