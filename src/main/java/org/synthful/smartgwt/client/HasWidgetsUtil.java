package org.synthful.smartgwt.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.Layout;

public class HasWidgetsUtil
{
	static public void clear(Canvas c){
		for(Canvas w:c.getChildren())
			c.removeChild(w);
	}
	
	static public Iterator<Widget> iterator(Canvas c){
		List<Widget> children = new ArrayList<Widget>();
		for(Canvas w:c.getChildren())
			children.add(w);
		return children.iterator();
	}

	static public boolean remove(Widget parent, Widget w){
	    if (w.getParent() != parent) {
	        return false;
	    }

		w.removeFromParent();
		return true;
	}
	static public void add(Layout parent,Widget w){
		if (w instanceof UIMasquerade<?>){
			Object uio = ((UIMasquerade<?>)w).getSmartObject();
			if (uio instanceof Canvas)
				parent.addMember((Canvas)uio);
		}
		else{
			parent.addMember(w);	
		}
	}
}
