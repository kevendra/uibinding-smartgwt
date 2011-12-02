package org.synthful.smartgwt.client;

import com.smartgwt.client.widgets.Canvas;

abstract public class LazyCanvas<W extends Canvas>
extends Canvas {
  protected abstract W createCanvas();

  /**
   * Ensures that the canvas has been created by calling {@link #createCanvas}
   * if {@link #getCanvas} returns <code>null</code>. Typically it is not
   * necessary to call this directly, as it is called as a side effect of a
   * <code>setVisible(true)</code> call.
   */
  public void ensureCanvas() {
    if (this.canvas == null) {
    	this.canvas = createCanvas();
    	this.addChild(this.canvas);
    }
  }

  @Override
  /*
   * Sets whether this object is visible. If <code>visible</code> is
   * <code>true</code>, creates the sole child widget if necessary by calling
   * {@link #ensureCanvas}.
   * 
   * @param visible <code>true</code> to show the object, <code>false</code> to
   * hide it
   */
  public void setVisible(boolean visible) {
    if (visible) {
      ensureCanvas();
    }
    super.setVisible(visible);
  }
  
  @Override
  public void show(){
	this.setVisible(true);
    super.show();	  
  }
  
  public W getCanvas(){
	return canvas;
  }
  
  public void setCanvas(W w){
	  this.canvas = w;
  }
  
  protected W canvas;
  
}
