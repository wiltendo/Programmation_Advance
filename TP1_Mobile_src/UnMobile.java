package TP1_Mobile_src;

import java.awt.*;
import javax.swing.*;

class UnMobile extends JPanel implements Runnable
{
    int saLargeur, saHauteur, sonDebDessin,sonTemps;
    final int sonPas = 10,sonCote=40;
    
    UnMobile(int telleLargeur, int telleHauteur)
    {
	super();
	saLargeur = telleLargeur;
	saHauteur = telleHauteur;
	sonTemps = (int)(Math.random() * (200-50));
	setSize(telleLargeur, telleHauteur);

    }

    public void run() {
		while (true) {
			for (sonDebDessin = 0; sonDebDessin < saLargeur - sonPas; sonDebDessin += sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}
			for (sonDebDessin = saLargeur - sonPas; sonDebDessin > 0; sonDebDessin -= sonPas) {
				repaint();
				try {
					Thread.sleep(sonTemps);
				} catch (InterruptedException telleExcp) {
					telleExcp.printStackTrace();
				}
			}

		}
    }

    public void paintComponent(Graphics telCG)
    {
	super.paintComponent(telCG);
	telCG.fillRect(sonDebDessin, saHauteur/2, sonCote, sonCote);
    }
}