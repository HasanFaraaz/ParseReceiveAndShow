package hasan.parsereceiveandshow;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

import android.app.Application;

public class ParseApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, Keys.applicationId, Keys.clientKey);
		PushService.setDefaultPushCallback(this, DisplayPush.class);
	//	ParseInstallation.getCurrentInstallation().saveInBackground();
		ParseInstallation.getCurrentInstallation().saveEventually();
	}

}
