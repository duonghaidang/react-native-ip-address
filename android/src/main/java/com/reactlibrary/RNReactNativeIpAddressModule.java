
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class RNReactNativeIpAddressModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReactNativeIpAddressModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
    public void getIP(Promise promise){
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces();
                 en.hasMoreElements();) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        promise.resolve(inetAddress.getHostAddress());
                    }
                }
            }

        } catch (Exception ex) {
            promise.reject("Error", ex);
        }
    }

    @ReactMethod
    public void toastNative(String text){
        Toast.makeText(reactContext, text, Toast.LENGTH_LONG).show();
    }

  @Override
  public String getName() {
    return "RNReactNativeIpAddress";
  }
}