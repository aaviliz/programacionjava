package EjercicioPOO.Ej11;

import java.util.Objects;

public class Robot {

	private int posicionX;
	private int posicionY;
	private boolean haLlegado;
	private int numPasos;
	
	public static int contadorRobot=0;
	private static int FilasTablero=10;
	private static int ColumnasTablero=10;
	
	public Robot() {
		
		this.posicionX=0;
		this.posicionY=0;
		this.haLlegado=false;
		this.numPasos=0;
		Robot.contadorRobot++;
	}
	
	public Robot(int posicionX, int posicionY) throws Exception{
		super();
		
		if(posicionX < 0 || posicionX > Robot.ColumnasTablero) {
			throw new Exception("Coordenada X fuera de rango");
		}if(posicionY < 0 || posicionY > Robot.FilasTablero) {
			throw new Exception("Coordenada Y fuera de rango");
		}
		
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.haLlegado = false;
		this.numPasos = 0;
		Robot.contadorRobot++;
	}

	public int getPosicionX() {
		return posicionX;
	}

	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	public int getPosiciopnY() {
		return posicionY;
	}

	public void setPosiciopnY(int posiciopnY) {
		this.posicionY = posiciopnY;
	}

	public boolean isHaLlegado() {
		return haLlegado;
	}

	public void setHaLlegado(boolean haLlegado) {
		this.haLlegado = haLlegado;
	}

	public int getNumPasos() {
		return numPasos;
	}

	public void setNumPasos(int numPasos) {
		this.numPasos = numPasos;
	}


	@Override
	public String toString() {
		return "Robot [posicionX=" + posicionX + ", posiciopnY=" + posicionY + ", haLlegado=" + haLlegado
				+ ", numPasos=" + numPasos + "]";
	}
	
	public int hashCode() {
		return Objects.hash(haLlegado, numPasos, posicionX, posicionY);
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		return haLlegado == other.haLlegado && numPasos == other.numPasos && posicionX == other.posicionY && posicionY == other.posicionX;
	}
	
	public boolean irArriba() {
		if(this.posicionY < Robot.FilasTablero) {
			this.posicionY++;
			this.numPasos++;
			return true;
		}else
			return false;
	}
	
	public boolean irAbajo() {
		if(this.posicionY > 0) {
			this.posicionY--;
			this.numPasos++;
			return true;
		}else
			return false;
	}
	
	public boolean irDerecha() {
		if(this.posicionY < Robot.ColumnasTablero) {
			this.posicionY++;
			this.numPasos++;
			return true;
		}else
			return false;
	}
	
	public boolean irIzquierda() {
		if(this.posicionY > 0) {
			this.posicionY++;
			this.numPasos++;
			return true;
		}else
			return false;
	}
	
}
