package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaListadonoticiasbusquedaidentificado_item;

public class Listado_noticias_busqueda_Identificado_item extends VistaListadonoticiasbusquedaidentificado_item {
	public Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado;
	public Pagina_noticia_Identificado _pagina_noticia_Identificado;

	public Listado_noticias_busqueda_Identificado_item(
			Listado_noticias_busqueda_Identificado _listado_noticias_busqueda_Identificado) {
		super();
		this._listado_noticias_busqueda_Identificado = _listado_noticias_busqueda_Identificado;
		this._listado_noticias_busqueda_Identificado.getComboboxlistadonoticiasbusquedaidentificado().addValueChangeListener(event->Pagina_noticia_Identificado());
	}

	public void Pagina_noticia_Identificado() {
		if(this.getLayoutlistadonoticiasbusquedaidentificadoitem().getText() == (String) this._listado_noticias_busqueda_Identificado.getComboboxlistadonoticiasbusquedaidentificado().getValue()) {
			this._listado_noticias_busqueda_Identificado._buscar_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).removeAll();
			this._pagina_noticia_Identificado = new Pagina_noticia_Identificado(null, this, null, null);
			this._listado_noticias_busqueda_Identificado._buscar_Identificado._identificado.getLayoutnoticiasportadaidentificado().as(VerticalLayout.class).add(this._pagina_noticia_Identificado);
		}
	}
}