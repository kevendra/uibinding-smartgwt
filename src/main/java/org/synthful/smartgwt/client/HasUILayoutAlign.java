package org.synthful.smartgwt.client;


import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;

public interface HasUILayoutAlign
extends HasUICanvasAlign{
	void setDefaultLayoutHAlign(Alignment alignment);
	void setDefaultLayoutVAlign(VerticalAlignment alignment);
}
