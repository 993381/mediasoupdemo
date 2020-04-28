package org.mediasoup.droid;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Before;

public abstract class BaseTest {

  protected Context mContext;

  @Before
  public void setUp() {
    mContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    Logger.setLogLevel(Logger.LogLevel.LOG_DEBUG);
    Logger.setDefaultHandler();
    MediasoupClient.initialize(mContext.getApplicationContext());
  }
}
