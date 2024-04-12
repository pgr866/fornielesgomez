package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNoticiasarevisar_item;

public class Noticias_a_revisar_item extends VistaNoticiasarevisar_item {
	public Noticias_a_revisar _noticias_a_revisar;
	public Revisar_noticias _revisar_noticias;
	
	public Noticias_a_revisar_item(Noticias_a_revisar _noticias_a_revisar) {
		super();
		this._noticias_a_revisar = _noticias_a_revisar;
		this._noticias_a_revisar.getSelectnoticiasarevisar().addValueChangeListener(event->Revisar_noticias());
	}

	public void Revisar_noticias() {
		if(this.getItemnoticiasarevisar().getText() == (String) this._noticias_a_revisar.getSelectnoticiasarevisar().getValue()) {
			this._noticias_a_revisar._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
			_revisar_noticias = new Revisar_noticias(this);
			this._noticias_a_revisar._editor.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(_revisar_noticias);
		}
	}
}