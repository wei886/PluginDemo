package com.l.plugincore;

import android.app.Activity;
import android.os.Bundle;

interface Pluginable {
      void onCreate(Bundle bundle);
      void onStart();
      void onResume();
      void onStop();
      void onPause();
      void onDestroy();

      void toast_();

}
