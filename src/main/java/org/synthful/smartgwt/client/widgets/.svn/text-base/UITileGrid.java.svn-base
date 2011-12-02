package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.widgets.tile.TileGrid;
import com.smartgwt.client.widgets.viewer.DetailViewerField;

public class UITileGrid extends TileGrid implements HasWidgets {

	@Override
	public void add(Widget widget) {
		/*
		if (widget instanceof UIDetailViewerField){
			DetailViewerField[] fields = getAttribute("fields");

			DetailViewerField[] newFields = new DetailViewerField[fields.length+1];

			for (int i = 0; i < fields.length; i++) {
				newFields[i] = fields[i];
			}
			newFields[fields.length] = ((UIDetailViewerField)widget).getSmartObject();
			setFields(newFields);
		}
		*/
		if (widget instanceof UIDetailViewerFieldArray){
			DetailViewerField[] newFields = ((UIDetailViewerFieldArray)widget).toArray();
			setFields(newFields);
		}
		else if (widget instanceof UIDataSource){
			DataSource datasrc = ((UIDataSource)widget).getSmartObject();
			setDataSource(datasrc);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Widget w) {
		// TODO Auto-generated method stub
		return false;
	}

}
