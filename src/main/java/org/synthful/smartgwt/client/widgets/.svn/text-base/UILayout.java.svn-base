package org.synthful.smartgwt.client.widgets;

import java.util.Iterator;

import org.synthful.smartgwt.client.HasUILayoutAlign;
import org.synthful.smartgwt.client.HasWidgetsUtil;
import org.synthful.smartgwt.client.UIMasquerade;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.layout.Layout;

public class UILayout
	extends Layout
	implements HasWidgets, HasUILayoutAlign
{
	public void add(Widget w){
		if (w instanceof Canvas){
			this.addMember((Canvas)w);
			return;
		}
		
		if (w instanceof UIMasquerade<?>){
			Object uio = ((UIMasquerade<?>)w).getSmartObject();
			if (uio instanceof Canvas){
				this.addMember((Canvas)uio);
				return;
			}
		}
		
		this.addMember(w);
	}

	@Override
	public Iterator<Widget> iterator(){
		return HasWidgetsUtil.iterator(this);
	}

	@Override
	public boolean remove(Widget w){
		if (w instanceof Canvas && this.hasMember((Canvas)w)){
			this.removeMember((Canvas)w);
			return true;
		}
		return HasWidgetsUtil.remove(this, w);
	}
	
	@Override
	public void setDefaultLayoutHAlign(Alignment alignment){
		super.setDefaultLayoutAlign(alignment);
	}
	@Override
	public void setDefaultLayoutVAlign(VerticalAlignment alignment){
		super.setDefaultLayoutAlign(alignment);
	}

	@Override
	public void setLayoutHAlign(Alignment alignment) {
		super.setLayoutAlign(alignment);
	}

	@Override
	public void setLayoutVAlign(VerticalAlignment alignment) {
		super.setLayoutAlign(alignment);
	}
}
