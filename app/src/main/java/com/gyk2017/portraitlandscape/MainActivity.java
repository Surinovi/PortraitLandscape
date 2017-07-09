/* Course: 			Mobile Application Development
 * Project:			PortraitLandscape
 * AVD:				Nexus 4, Android API 18
 * Description:		A simple program that demonstrates the use of different XML 
 * 					files to define the GUI for Portrait and Landscape modes.
 */

package com.gyk2017.portraitlandscape;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Resources mResources;
	private Configuration mConfiguration;
	private int orientation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Hiding the title bar
		//Comment
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		// Learning the orientation
		mResources = getResources();
		mConfiguration = mResources.getConfiguration();
		orientation = mConfiguration.orientation;

		setContentView(R.layout.main);

		if (orientation == Configuration.ORIENTATION_PORTRAIT)
			displayToast("Portrait mode");
		else
			displayToast("Landscape mode");
	}

	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn1:
			displayToast("Top left button is pressed");
			break;
		case R.id.btn2:
			displayToast("Top right button is pressed");
			break;
		case R.id.btn3:
			displayToast("Bottom left button is pressed");
			break;
		case R.id.btn4:
			displayToast("Bottom right button is pressed");
			break;
		case R.id.btn5:
			displayToast("Center button is pressed");
			break;
		case R.id.btn6:
			displayToast("Top center button is pressed");
			break;
		case R.id.btn7:
			displayToast("Bottom center button is pressed");
			break;

		}
	}

	private void displayToast(String msg) {

		Toast toast = Toast.makeText(getBaseContext(), msg, Toast.LENGTH_LONG);
		// Appears in the center
		toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

		// Appears in the top-left corner
		// toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);
		toast.show();

		// To use Toast in one go
		// Appear in the center bottom by default
		// Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
	}
}
