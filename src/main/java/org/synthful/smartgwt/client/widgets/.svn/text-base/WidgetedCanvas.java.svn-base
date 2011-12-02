package org.synthful.smartgwt.client.widgets;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.widgets.Canvas;

public class WidgetedCanvas<W extends Widget>
extends Canvas {
    private W widget;

    public WidgetedCanvas() {
    }
    
    public WidgetedCanvas(W widget) {
    	this.setEmbeddedWidget(widget);
    }

    public String getInnerHTML() {
    	if (this.widget==null)
    		return null;
        //if this canvas is being redrawn, detach underlying gwt widget so that onDraw()
        //can correctly reassociate it with container div
        if(widget.isAttached()) widget.removeFromParent();

        return "<DIV STYLE='width:100%;height:100%' ID=" + this.getID() + "_widget></DIV>";
    }

    protected void onDraw() {
    	if (this.widget==null)
    		return;
        //a GWT widget must be attached to a GWT Panel for its events to fire.
        boolean attached = widget.isAttached();
        if (!attached) {
            RootPanel rp = RootPanel.get(this.getID() + "_widget");
            rp.add(widget);
            String width = DOM.getStyleAttribute(widget.getElement(), "width");
            if (width != null && !width.equals("")) {
                setWidth(width);
            }
            String height = DOM.getStyleAttribute(widget.getElement(), "height");
            if (height != null && !height.equals("")) {
                setHeight(height);
            }
        }
    }

	public W getEmbeddedWidget() {
		return widget;
	}

	private void setEmbeddedWidget(W widget) {
        if(this.widget!=null){
        	this.widget.setVisible(false);
        	this.widget.removeFromParent();
        }
        
        this.widget = widget;
        if (widget==null)
        	return;
        
        if (!ignited){
	        setRedrawOnResize(false);
	        setAttribute("_redrawWithParent", false, false);
	        setAttribute("_clearWithRemoveChild", true, false);
	        setOverflow(Overflow.VISIBLE);
	        ignited = true;
        }
        
        String width = DOM.getStyleAttribute(widget.getElement(), "width");
        String height = DOM.getStyleAttribute(widget.getElement(), "height");
        if (width != null && !width.equals("")) {
            setWidth(width);
        }
        if (height != null && !height.equals("")) {
            setHeight(height);
        }
	}
	
	private boolean ignited = false;
}
