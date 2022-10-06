# compose-pixelperfectdesign
To make percentile design in kotlin. This lib Will Help you.

### Pixel Perfect Design is a fase and efficient open source constant management That use for create Percentage wise design. so any size of device it's look Same.

## Dependency
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency
```
dependencies {
        implementation 'com.github.irealsp:compose-pixelperfectdesign:0.1.1'
}
```

## About
The library allows you to use use the device Width and Height as measuring units, that can be used to set the Modifier properties. The advantages of using dw(device width), dh (device height) values instead of dp is that you can scale the content of the Composable components according to the current device size.

To initialize the size inside your MainActivity onCreate method call the method initSize(), otherwise you would get an java.lang.IllegalArgumentException: Cannot round NaN value. error!
```
class MainActivity : ComponentActivity() {
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // init device width and height
        initSize() 

        setContent { 
	
            // your UI here
	    Text(
            text = "Hello",
            fontSize = 0.04.sh,
            color = Color.Green, 
            modifier = Modifier
                .offset(x = 0.07.dw, y = 0.2.dh)
            )
        }
    }
}
```
