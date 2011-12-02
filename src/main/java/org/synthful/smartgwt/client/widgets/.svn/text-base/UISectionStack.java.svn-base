package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.SectionStack;
import com.smartgwt.client.widgets.layout.SectionStackSection;

public class UISectionStack extends SectionStack implements HasWidgets{
	
	public void add(Widget w){
		if (w instanceof UIMasquerade<?>){
			Object uio = ((UIMasquerade<?>)w).getSmartObject();
			if (uio instanceof SectionStackSection){
				addSection((SectionStackSection)uio);
			}
			else if(uio instanceof Canvas){
				addMember((Canvas)uio);
			}
		}
		else{
			addMember(w);	
		}
	}
	
	@Override
	public void destroy() {
		for(SectionStackSection section : getSections()) {
			for(Canvas item : section.getItems()) {
				item.destroy();
			}
		}
		super.destroy();
	}

	@Override
	public Iterator<Widget> iterator(){
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w){
		return HasWidgetsUtil.remove(this, w);
	}
	
	public void setDefaultLayoutHAlign(Alignment alignment){
		super.setDefaultLayoutAlign(alignment);
	}
	public void setDefaultLayoutVAlign(VerticalAlignment alignment){
		super.setDefaultLayoutAlign(alignment);
	}

}
