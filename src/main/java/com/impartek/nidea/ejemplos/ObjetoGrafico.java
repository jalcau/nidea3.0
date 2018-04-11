package com.impartek.nidea.ejemplos;

import java.io.Serializable;

public abstract class ObjetoGrafico implements Imprimible, Cloneable, Serializable {
	int x, y;

	void moverA(int nuevaX, int nuevaY) {
		this.x = nuevaX;
		this.y = nuevaY;
	}

	abstract void dibujar();

}
