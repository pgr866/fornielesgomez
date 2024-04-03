package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

@Tag("vista-logout")
@JsModule("./src/vista-logout.ts")
public class VistaLogout extends LitTemplate {

    public Element getLayoutbotonlogout() {
		return layoutbotonlogout;
	}

	public void setLayoutbotonlogout(Element layoutbotonlogout) {
		this.layoutbotonlogout = layoutbotonlogout;
	}

	public Button getButtonlogout() {
		return buttonlogout;
	}

	public void setButtonlogout(Button buttonlogout) {
		this.buttonlogout = buttonlogout;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	@Id("Layoutbotonlogout")
	private Element layoutbotonlogout;
	@Id("Buttonlogout")
	private Button buttonlogout;
	@Id("img")
	private Image img;

	public VistaLogout() {
        // You can initialise any data required for the connected UI components here.
    }

}