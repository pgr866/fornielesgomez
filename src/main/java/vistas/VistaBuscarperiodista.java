package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.combobox.ComboBox;

@Tag("vista-buscarperiodista")
@JsModule("./src/vista-buscarperiodista.ts")
public class VistaBuscarperiodista extends LitTemplate {

    public Element getLayoutbuscarperiodista() {
		return layoutbuscarperiodista;
	}

	public void setLayoutbuscarperiodista(Element layoutbuscarperiodista) {
		this.layoutbuscarperiodista = layoutbuscarperiodista;
	}

	public ComboBox<String> getComboboxbuscarperiodista() {
		return comboboxbuscarperiodista;
	}

	public void setComboboxbuscarperiodista(ComboBox<String> comboboxbuscarperiodista) {
		this.comboboxbuscarperiodista = comboboxbuscarperiodista;
	}

	@Id("Layoutbuscarperiodista")
	private Element layoutbuscarperiodista;
	@Id("Comboboxbuscarperiodista")
	private ComboBox<String> comboboxbuscarperiodista;

	public VistaBuscarperiodista() {
        // You can initialise any data required for the connected UI components here.
    }

}