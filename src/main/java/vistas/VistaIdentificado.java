package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;

@Tag("vista-identificado")
@JsModule("./src/vista-identificado.ts")
public class VistaIdentificado extends LitTemplate {

	public Element getLayoutlogoidentificado() {
		return layoutlogoidentificado;
	}

	public void setLayoutlogoidentificado(Element layoutlogoidentificado) {
		this.layoutlogoidentificado = layoutlogoidentificado;
	}

	public Button getButtonlogoidentificado() {
		return buttonlogoidentificado;
	}

	public void setButtonlogoidentificado(Button buttonlogoidentificado) {
		this.buttonlogoidentificado = buttonlogoidentificado;
	}

	public Image getImagenlogoidentificado() {
		return imagenlogoidentificado;
	}

	public void setImagenlogoidentificado(Image imagenlogoidentificado) {
		this.imagenlogoidentificado = imagenlogoidentificado;
	}

	public HorizontalLayout getLayoutvistabuscaridentificado() {
		return layoutvistabuscaridentificado;
	}

	public void setLayoutvistabuscaridentificado(HorizontalLayout layoutvistabuscaridentificado) {
		this.layoutvistabuscaridentificado = layoutvistabuscaridentificado;
	}

	public Element getLayoutexplorarseccionesidentificado() {
		return layoutexplorarseccionesidentificado;
	}

	public void setLayoutexplorarseccionesidentificado(Element layoutexplorarseccionesidentificado) {
		this.layoutexplorarseccionesidentificado = layoutexplorarseccionesidentificado;
	}

	public Button getExplorarseccionesidentificado() {
		return explorarseccionesidentificado;
	}

	public void setExplorarseccionesidentificado(Button explorarseccionesidentificado) {
		this.explorarseccionesidentificado = explorarseccionesidentificado;
	}

	public Element getLayoutvermisnoticiasidentificado() {
		return layoutvermisnoticiasidentificado;
	}

	public void setLayoutvermisnoticiasidentificado(Element layoutvermisnoticiasidentificado) {
		this.layoutvermisnoticiasidentificado = layoutvermisnoticiasidentificado;
	}

	public Element getLayoutcrearnuevanoticiaidentificado() {
		return layoutcrearnuevanoticiaidentificado;
	}

	public void setLayoutcrearnuevanoticiaidentificado(Element layoutcrearnuevanoticiaidentificado) {
		this.layoutcrearnuevanoticiaidentificado = layoutcrearnuevanoticiaidentificado;
	}

	public Button getButtoncrearnuevanoticiaidentificado() {
		return buttoncrearnuevanoticiaidentificado;
	}

	public void setButtoncrearnuevanoticiaidentificado(Button buttoncrearnuevanoticiaidentificado) {
		this.buttoncrearnuevanoticiaidentificado = buttoncrearnuevanoticiaidentificado;
	}

	public Element getLayoutvistanoticiasarevisaridentificado() {
		return layoutvistanoticiasarevisaridentificado;
	}

	public void setLayoutvistanoticiasarevisaridentificado(Element layoutvistanoticiasarevisaridentificado) {
		this.layoutvistanoticiasarevisaridentificado = layoutvistanoticiasarevisaridentificado;
	}

	public Element getLayoutdaraltabajaperiodistaidentificado() {
		return layoutdaraltabajaperiodistaidentificado;
	}

	public void setLayoutdaraltabajaperiodistaidentificado(Element layoutdaraltabajaperiodistaidentificado) {
		this.layoutdaraltabajaperiodistaidentificado = layoutdaraltabajaperiodistaidentificado;
	}

	public Button getButtondaraltabajaperiodistaidentificado() {
		return buttondaraltabajaperiodistaidentificado;
	}

	public void setButtondaraltabajaperiodistaidentificado(Button buttondaraltabajaperiodistaidentificado) {
		this.buttondaraltabajaperiodistaidentificado = buttondaraltabajaperiodistaidentificado;
	}

	public Element getOpcionescuentaidentificado() {
		return opcionescuentaidentificado;
	}

	public void setOpcionescuentaidentificado(Element opcionescuentaidentificado) {
		this.opcionescuentaidentificado = opcionescuentaidentificado;
	}

	public Button getConfigurarperfilidentificado() {
		return configurarperfilidentificado;
	}

	public void setConfigurarperfilidentificado(Button configurarperfilidentificado) {
		this.configurarperfilidentificado = configurarperfilidentificado;
	}

	public Image getImagenconfigurarperfilidentificado() {
		return imagenconfigurarperfilidentificado;
	}

	public void setImagenconfigurarperfilidentificado(Image imagenconfigurarperfilidentificado) {
		this.imagenconfigurarperfilidentificado = imagenconfigurarperfilidentificado;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getLayoutnoticiasportadaidentificado() {
		return layoutnoticiasportadaidentificado;
	}

	public void setLayoutnoticiasportadaidentificado(Element layoutnoticiasportadaidentificado) {
		this.layoutnoticiasportadaidentificado = layoutnoticiasportadaidentificado;
	}

	@Id("Layoutlogoidentificado")
	private Element layoutlogoidentificado;
	@Id("Buttonlogoidentificado")
	private Button buttonlogoidentificado;
	@Id("imagenlogoidentificado")
	private Image imagenlogoidentificado;
	@Id("Layoutvistabuscaridentificado")
	private HorizontalLayout layoutvistabuscaridentificado;
	@Id("Layoutexplorarseccionesidentificado")
	private Element layoutexplorarseccionesidentificado;
	@Id("Explorarseccionesidentificado")
	private Button explorarseccionesidentificado;
	@Id("Layoutvermisnoticiasidentificado")
	private Element layoutvermisnoticiasidentificado;
	@Id("Layoutcrearnuevanoticiaidentificado")
	private Element layoutcrearnuevanoticiaidentificado;
	@Id("Buttoncrearnuevanoticiaidentificado")
	private Button buttoncrearnuevanoticiaidentificado;
	@Id("Layoutvistanoticiasarevisaridentificado")
	private Element layoutvistanoticiasarevisaridentificado;
	@Id("Layoutdaraltabajaperiodistaidentificado")
	private Element layoutdaraltabajaperiodistaidentificado;
	@Id("Buttondaraltabajaperiodistaidentificado")
	private Button buttondaraltabajaperiodistaidentificado;
	@Id("Opcionescuentaidentificado")
	private Element opcionescuentaidentificado;
	@Id("Configurarperfilidentificado")
	private Button configurarperfilidentificado;
	@Id("Imagenconfigurarperfilidentificado")
	private Image imagenconfigurarperfilidentificado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("Layoutnoticiasportadaidentificado")
	private Element layoutnoticiasportadaidentificado;

	public VistaIdentificado() {
        // You can initialise any data required for the connected UI components here.
    }

}