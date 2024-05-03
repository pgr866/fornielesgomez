package interfaz;

import org.orm.PersistentException;

public class Registrarse extends vistas.VistaRegistrarse {
	
//	private event _cancelar;
//	private event _enviar;
//	private Label _email;
//	private Label _nombre;
//	private Label _apellidos;
//	private Label _fecha_naciemiento;
//	private Label _apodo;
//	private Label _dni;
//	private Label _num_tarjeta;
//	private Label _contrasena;
//	private Label _repetir_contrasena;
	public Iniciar_Sesion _iniciar_Sesion;
	public Gestionar_correo _gestionar_correo;
	public Gestionar_pagos _gestionar_pagos;
	
	public Registrarse(Iniciar_Sesion _iniciar_Sesion) {
		super();
		this._iniciar_Sesion = _iniciar_Sesion;
		this.getCancelarregistrarse().addClickListener(event->Cancelar());
		this.getEnviarregistrarse().addClickListener(event->Enviar());
	}

	public void Gestionar_correo() {
		throw new UnsupportedOperationException();
	}

	public void Cancelar() {
		this._iniciar_Sesion._usuario_no_Registrado.Iniciar_Sesion();
	}

	public void Enviar() {
		String email = this.getTextfieldemailregistrarse().getValue();
		String nick = this.getTextfieldregistrarse().getValue();
		String dni = this.getTextfielddniregistrarse().getValue();
		basededatos.Usuario_suscrito[] consulta;
		boolean validos = true;
		try {
			consulta = basededatos.Usuario_suscritoDAO.listUsuario_suscritoByQuery(
					"Email = '" + email + "' AND EsEliminado = FALSE", "");
			basededatos.Usuario_suscrito[] consulta2 = basededatos.Usuario_suscritoDAO.listUsuario_suscritoByQuery(
					"Email = '" + email + "' AND EsEliminado = FALSE", "");
			if (consulta.length > 0 || consulta2.length > 0) {
				this.getLabelerrordatosregistrarse().setText("Email ya registrado en otra cuenta");
				validos = false;
			}
			consulta = basededatos.Usuario_suscritoDAO.listUsuario_suscritoByQuery(
					"Nick_apodo = '" + nick + "' AND EsEliminado = FALSE", "");
			if (consulta.length > 0 && validos) {
				this.getLabelerrordatosregistrarse().setText("Nick ya registrado en otra cuenta");
				validos = false;
			}
			consulta = basededatos.Usuario_suscritoDAO.listUsuario_suscritoByQuery(
					"Dni = '" + dni + "' AND EsEliminado = FALSE", "");
			if (consulta.length > 0 && validos) {
				this.getLabelerrordatosregistrarse().setText("DNI ya registrado en otra cuenta");
				validos = false;
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		
		String contrasena = this.getPasswordfieldcontrasenaregistrarse().getValue();
		String repetir_contrasena = this.getPasswordfieldrepetircontrasenaregistrarse().getValue();

		if (contrasena != repetir_contrasena && validos) {
			this.getLabelerrordatosregistrarse().setText("Las contraseñas no coinciden");
			validos = false;
		}
		
		if (contrasena.length() < 8 && validos) {
			this.getLabelerrordatosregistrarse().setText("La contraseña debe tener al menos 8 caracteres");
			validos = false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c))
                hasDigit = true;
            else if (Character.isUpperCase(c))
                hasUpperCase = true;
            else if (Character.isLowerCase(c))
                hasLowerCase = true;
        }

        if (!(hasDigit && hasUpperCase && hasLowerCase) && validos) {
        	this.getLabelerrordatosregistrarse().setText("La contraseña debe tener al menos un número, una mayúscula, y una minúscula");
			validos = false;
        }
		
        if (validos) {
    		basededatos.Usuario_suscrito suscrito = new basededatos.Usuario_suscrito();
        	suscrito.setEmail(email);
    		suscrito.setNombre(this.getTextfieldnombreregistrarse().getValue());
    		suscrito.setApellidos(this.getTextfieldapellidosregistrarse().getValue());
    		suscrito.setFecha_nacimiento(this.getTextfieldfechanacimientoregistrarse().getValue());
    		suscrito.setNick_apodo(nick);
    		suscrito.setDni(dni);
    		suscrito.setNum_tarjeta(this.getTextfieldntarjetaregistrarse().getValue());
    		suscrito.setContrasena(contrasena);
    		suscrito.setUrl_foto_perfil("https://i.postimg.cc/m25GMKm4/foto.png");
    		this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito = new Usuario_Suscrito(this._iniciar_Sesion._usuario_no_Registrado.mainview, suscrito);
    		this._iniciar_Sesion._usuario_no_Registrado.mainview.removeAll();
    		this._iniciar_Sesion._usuario_no_Registrado.mainview.add(this._iniciar_Sesion._usuario_no_Registrado.mainview._usuario_suscrito);
        }
	}

	public void Gestionar_pagos() {
		throw new UnsupportedOperationException();
	}
}