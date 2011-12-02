package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.toolbar.ToolStrip;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;

public class UIToolStrip
	extends ToolStrip
	implements HasWidgets
{
	@Override
	public void add(Widget w) {
		if (w instanceof ToolStripButton)
			 addButton((ToolStripButton) w);
	    else if (w instanceof UIToolStripMenuButton)
			 addMenuButton((UIToolStripMenuButton) w);
	    //else if (w instanceof UIFormItem)
		//	 addFormItem(w);
	    else if (w instanceof Canvas)
			 addMember((Canvas)w);


/*
			 addFill();
			 
			 addResizer();

			 addSeparator();

			 addSpacer(int space);
*/
	}

	@Override
	public Iterator<Widget> iterator() {
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w) {
		return HasWidgetsUtil.remove(this, w);
	}

}
