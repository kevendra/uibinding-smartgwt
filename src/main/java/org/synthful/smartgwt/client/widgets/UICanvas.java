package org.synthful.smartgwt.client.widgets;

import java.util.ArrayList;
import java.util.Iterator;

import org.synthful.smartgwt.client.HasUICanvasAlign;
import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;

public class UICanvas
	extends Canvas
	implements HasWidgets, HasUICanvasAlign
{
	@Override
	public void add(Widget w) {
		Canvas c = getUIMasqueradedCanvas(w);
		if (c!=null){
			super.addChild(c);
		}
		else{
			super.addChild(w);
		}
	}

	@Override
	public Iterator<Widget> iterator() {
		ArrayList<Widget> widgets = new ArrayList<Widget>();
		for (Canvas cx : getChildren()){
			widgets.add(cx);
		}
		return widgets.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		Canvas c = getUIMasqueradedCanvas(w);
		if (c!=null){
			this.removeChild(c);
		}
		return HasWidgetsUtil.remove(this, w);
	}
		
	static public Canvas getUIMasqueradedCanvas(Widget w){
		if (w instanceof UIMasquerade<?>){
			UIMasquerade<?> uim = (UIMasquerade<?>)w;
			Object uio = uim.getSmartObject();
			if (uio instanceof Canvas)
				return (Canvas)uio;
		}
		return null;
	}
	
	public boolean showCanvas(Canvas c){
		boolean matched=false;
		for (Canvas cx : getChildren()){
			if (cx!=c){
				cx.hide();
				matched=true;
			}
			else
				cx.show();
		}
		return matched;
	}
	
	public void hideAll(){
		for (Canvas cx : getChildren()){
			cx.hide();
		}
	}
	
	@Override
	public void setLayoutHAlign(Alignment alignment) {
		super.setLayoutAlign(alignment);
	}

	@Override
	public void setLayoutVAlign(VerticalAlignment alignment) {
		super.setLayoutAlign(alignment);
	}
	
	@Override
	public void destroy() {
		for(Canvas child : getChildren()) {
			child.destroy();
		}
		super.destroy();
	}
}
