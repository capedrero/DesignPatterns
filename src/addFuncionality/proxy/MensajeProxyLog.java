package addFuncionality.proxy;

public class MensajeProxyLog implements IMensaje {
	private IMensaje msj = null;

	public MensajeProxyLog() {
		super();
		this.msj = new MensajeHTML();
	}

	public MensajeProxyLog(IMensaje msj) {
		super();
		this.msj = msj;
	}

	public IMensaje getMsj() {
		return msj;
	}

	public void setMsj(IMensaje msj) {
		this.msj = msj;
	}

	@Override
	public void decirHola() {
		System.out.println("Inicio - Soy el log");
		msj.decirHola();
		System.out.println("Fin - Soy el log");
	}

}
