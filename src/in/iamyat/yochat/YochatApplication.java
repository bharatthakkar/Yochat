package in.iamyat.yochat;


import android.app.Application;

import com.parse.Parse;


public class YochatApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "N5VVEZOtWuRH6pfIqDiepXgmZysdYsSyPA7J7uhf",
				"mlD8ZdCBVNx2PvZh9sbPF3h58LnyVNcToQMqh7dX");
	}
}
