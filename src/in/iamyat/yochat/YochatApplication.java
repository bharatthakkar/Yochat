package in.iamyat.yochat;

import in.iamyat.yochat.ui.MainActivity;
import in.iamyat.yochat.utils.ParseConstants;
import in.imyat.yochat.R;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class YochatApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "N5VVEZOtWuRH6pfIqDiepXgmZysdYsSyPA7J7uhf",
				"mlD8ZdCBVNx2PvZh9sbPF3h58LnyVNcToQMqh7dX");
		PushService.setDefaultPushCallback(this, MainActivity.class,
				R.drawable.ic);
	}

	public static void updateParseInstallation(ParseUser user) {
		ParseInstallation installation = ParseInstallation
				.getCurrentInstallation();
		installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
		installation.saveInBackground();
	}
}
