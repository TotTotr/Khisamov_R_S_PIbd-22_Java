import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Set;

public class AttackAircrafts {

	public AttackAircrafts(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean turbines,
			boolean propeller, boolean flag) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
		DopColor = dopColor;
		Turbines = turbines;
		Propeller = propeller;
		Flag = flag;

	}

	// Левая координата отрисовки штурмовика
	static int _startPosX;

	// Правая кооридната отрисовки штурмовика
	static int _startPosY;

	// Ширина окна отрисовки
	private int _pictureWidth;

	// Высота окна отрисовки
	private int _pictureHeight;

	// Ширина отрисовки штурмовика
	private final int AttackAircraftWidth = 100;

	// Ширина отрисовки штурмовика
	private final int AttackAircraftHeight = 60;

	// Максимальная скорость
	public int MaxSpeed;
	{
		Set get;
	}

	// Вес штурмовика
	public float Weight;
	{
		Set get;
	}

	// Основной цвет
	public static Color MainColor;
	{
		Set get;
	}

	// Дополнительный цвет
	public static Color DopColor;
	{
		Set get;
	}

	// Признак наличия турбин
	private static boolean Turbines;
	{
		Set get;
	}

	public boolean setTurbines;
	{
		Set get;
	}

	// Признак наличия пропеллера
	private static boolean Propeller;
	{
		Set get;
	}

	private static boolean Flag;
	{
		Set get;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	public void MoveTransport(Direction direction) {
		float step = MaxSpeed * 100 / Weight;
		switch (direction) {
		// вправо
		case Right:
			if (_startPosX + 100 + step < 630) {
				_startPosX += step;
			}
			break;
		// влево
		case Left:
			if (_startPosX - step > 0)

			{
				_startPosX -= step;
			}
			break;
		// вверх
		case Up:
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		// вниз
		case Down:
			if (_startPosY + step + 60 < 380) {
				_startPosY += step;
			}
			break;
		}
	}

	final Random random = new Random();
	int number = 4 + (int) (Math.random() * 3);

	public void DrawAttackAircraft(Graphics g) {

		if (Propeller) {

			g.setColor(Color.GRAY);

			g.fillOval(_startPosX + 5, _startPosY + 3, 100, 20);
			g.fillOval(_startPosX + 5, _startPosY - 8, 9, 20);
		}

		if (Turbines) {
			g.setColor(Color.BLACK);
			g.fillOval(_startPosX + 35, _startPosY + 7, 30, 8);
		}
		switch (number) {
		case 4:
			new AircraftsGuns().NumberBombs(Number.Four, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;
		case 5:
			new AircraftsGuns().NumberBombs(Number.Five, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;
		case 6:
			new AircraftsGuns().NumberBombs(Number.Six, g, AttackAircrafts._startPosX, AttackAircrafts._startPosY);
			break;
		}

		g.setColor(Color.BLACK);
		g.fillOval(_startPosX + 60, _startPosY, 5, 20);

	}
}
