package interfaz;

public class Explorar_secciones_Identificado extends Explorar_secciones {

	public Identificado _identificado;
	public Noticias_en_seccion_Identificado _noticias_en_seccion_Identificado;

	public Explorar_secciones_Identificado(interfaz.Secciones _secciones, Identificado _identificado) {
		super(_secciones);
		this._identificado = _identificado;
		this._noticias_en_seccion_Identificado = new Noticias_en_seccion_Identificado(this);
		//this.get
		this.getLayoutnombrebotonesexplorarsecciones().setVisible(false);
	}
	
	public void Noticias_en_seccion_Identificado() {
		throw new UnsupportedOperationException();
	}
}