
# react-native-react-native-ip-address

## Getting started

`$ npm install react-native-react-native-ip-address --save`

### Mostly automatic installation

`$ react-native link react-native-react-native-ip-address`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeIpAddressPackage;` to the imports at the top of the file
  - Add `new RNReactNativeIpAddressPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-react-native-ip-address'
  	project(':react-native-react-native-ip-address').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-react-native-ip-address/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-react-native-ip-address')
  	```


## Usage
```javascript
import RNReactNativeIpAddress from 'react-native-react-native-ip-address';

// TODO: What to do with the module?
RNReactNativeIpAddress;
```
  