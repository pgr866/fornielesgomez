package interfaz;

public class Pagina_Noticia extends vistas.VistaPaginanoticia {
//	private Label _titulo;
//	private Label _autor;
//	private Label _fecha;
//	private Label _hora;
//	private Label _resumen;
//	private Image _imagen_noticia;
//	private label _hashtags;
	public Mostrar_valoracion_noticia _mostrar_valoracion_noticia;
	
	public Pagina_Noticia() {
		super();
		this._mostrar_valoracion_noticia = new Mostrar_valoracion_noticia(this);
		Mostrar_valoracion_noticia();
	}

	public void Mostrar_valoracion_noticia() {
		this.getMostrarvaloracionnoticiapaginanoticia().add(_mostrar_valoracion_noticia);
	}
}