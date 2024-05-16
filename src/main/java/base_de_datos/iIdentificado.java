package base_de_datos;

import basededatos.Seccion;
import basededatos.Noticia;

public interface iIdentificado {

	public void Guardar_cambios(int aId, String aNombre, String aNick, String aEmail, String aContrasena, String aUrl_foto_perfil, String aNum_tarjeta);

	public void Comentar(int aId_identificado, int aId_noticia, String aContenido);

	public void Valorar_comentario(int aId_comentario, int aId_identificado, boolean aPositiva);

	public void Valorar_noticia(int aId_noticia, int aId_identificado, boolean aPositiva);

	public Seccion[] Cargar_secciones();

	public Noticia[] Cargar_noticias();

	public Noticia[] Cargar_noticias_portada();
}