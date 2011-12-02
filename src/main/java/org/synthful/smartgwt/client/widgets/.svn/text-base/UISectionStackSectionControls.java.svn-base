package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;

public class UISectionStackSectionControls 
extends Canvas implements HasWidgets {

	List items = new ArrayList();
	
	@Override
	public void add(Widget w) {
		if (w instanceof Canvas){
			items.add(w);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		return items.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return items.remove(w);
	}

	public Canvas[] toArray(){
		Canvas[] a = new Canvas[items.size()];
		items.toArray(a);
		return a;
	}

}
