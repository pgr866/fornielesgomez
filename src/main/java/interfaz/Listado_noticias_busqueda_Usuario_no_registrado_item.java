package interfaz;

import vistas.VistaListadonoticiasbusquedausuarionoregistrado_item;

public class Listado_noticias_busqueda_Usuario_no_registrado_item extends VistaListadonoticiasbusquedausuarionoregistrado_item {
	public Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado;
	public Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado;

	public Listado_noticias_busqueda_Usuario_no_registrado_item(
			Listado_noticias_busqueda_Usuario_no_registrado _listado_noticias_busqueda_Usuario_no_registrado,
			interfaz.Pagina_noticia_Usuario_no_registrado _pagina_noticia_Usuario_no_registrado) {
		super();
		this._listado_noticias_busqueda_Usuario_no_registrado = _listado_noticias_busqueda_Usuario_no_registrado;
		this._pagina_noticia_Usuario_no_registrado = _pagina_noticia_Usuario_no_registrado;
	}

	public void Pagina_noticia_Usuario_no_registrado() {
		throw new UnsupportedOperationException();
	}
}