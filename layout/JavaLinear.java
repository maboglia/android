import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;

public class JavaLinear extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Button button1 = new Button(this);
		button1.setText("Bottone 1");
		Button button2 = new Button(this);
		button2.setText("Bottone 2");
		Button button3 = new Button(this);
		button3.setText("Bottone 3");
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setGravity(Gravity.CENTER_HORIZONTAL);
		layout.addView(button1);
		layout.addView(button2);
		layout.addView(button3);
		setContentView(layout);
	}

}
