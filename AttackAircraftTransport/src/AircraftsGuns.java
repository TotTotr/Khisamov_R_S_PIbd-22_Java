import java.awt.Color;
import java.awt.Graphics;

public class AircraftsGuns {

	public void NumberBombs(Number number, Graphics g, int x, int y) {
		DrawBombs(g, x + 55, y + 20);

		DrawBombs(g, x + 50, y + 20);

		if (number == Number.Six || number == Number.Five) {
			DrawBombs(g, x + 45, y + 20);
		}
		if (number == Number.Six) {

			DrawBombs(g, x + 55, y + 17);
			DrawBombs(g, x + 45, y + 20);
			DrawBombs(g, x + 45, y + 17);
			DrawBombs(g, x + 50, y + 17);
		}

	}

	public void DrawBombs(Graphics g, int x, int y) {

		g.setColor(Color.BLACK);
		g.fillRect(x, y + 1, 4, 2);

	}
}
