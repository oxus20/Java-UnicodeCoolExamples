# Java Unicode with Cool GUI Examples
With Unicode you can program and accomplish many funny, cool and useful programs and tools as for instance, **Abjad Calculator** calculating the numerical value of letters derived from the Arabic alphabet through the use of the Abjad writing system, **Bubble Text Generator** to write letters in circle, **Flip Text Generator** to write letters upside down, **Google Transliteration** to convert English names to Persian/Arabic, etc.

**Important Notes:**

  1. You must set encoding properties of the project to **UTF-8**. Otherwise, Unicode characters won't interpret and recognized!

  2. You must to have an Image named **background.jpg** with **500 x 250 dimensions** inside the root of your project.
  

## Abjad Calculator
**Abjad Calculator** is a tool for calculating the numerical value of letters derived from the Arabic alphabet through the use of the Abjad writing system. 

### Abjad Calculator Method
 
 ```java
// Abjad Kabir calculation method
public static String abjadKabir(char ch) {
	String abjad_help = Character.toString(ch);
	String input = abjad_help.replaceAll("ا", "1").replaceAll("آ", "1")
			.replaceAll("ب", "2").replaceAll("پ", "2").replaceAll("ج", "3")
			.replaceAll("چ", "3").replaceAll("د", "4").replaceAll("ه", "5")
			.replaceAll("و", "6").replaceAll(" ", "0").replaceAll("ز", "7")
			.replaceAll("ژ", "7").replaceAll("ح", "8").replaceAll("ط", "9")
			.replaceAll("ی", "10").replaceAll("ي", "10")
			.replaceAll("ک", "20").replaceAll("گ", "20")
			.replaceAll("ل", "30").replaceAll("م", "40")
			.replaceAll("ن", "50").replaceAll("س", "60")
			.replaceAll("ع", "70").replaceAll("ف", "80")
			.replaceAll("ص", "90").replaceAll("ق", "100")
			.replaceAll("ر", "200").replaceAll("ش", "300")
			.replaceAll("ت", "400").replaceAll("ث", "500")
			.replaceAll("خ", "600").replaceAll("ذ", "700")
			.replaceAll("ض", "800").replaceAll("ظ", "900")
			.replaceAll("غ", "1000");
	return input;
}
 ```
 
## Bubble Text Generator
With **Bubble Text Generator**, you can copy and paste the generated bubble letters into any website that you'd like i.e. Facebook, Myspace, and Google++. Enjoy the bubble text converter and bubble (circle) letters! 

### Bubble Text Generator Method
 
 ```java
private String toBubble(String input) {
	String change = input.replace('0', 'ⓞ').replace('1', '➀')
			.replace('2', '➁').replace('3', '➂').replace('4', '➃')
			.replace('5', '➄').replace('6', '➅').replace('7', '➆')
			.replace('8', '➇').replace('9', '➈').replace('a', 'ⓐ')
			.replace('b', 'ⓑ').replace('c', 'ⓒ').replace('d', 'ⓓ')
			.replace('e', 'ⓔ').replace('f', 'ⓕ').replace('g', 'ⓖ')
			.replace('h', 'ⓗ').replace('i', 'ⓘ').replace('j', 'ⓙ')
			.replace('k', 'ⓚ').replace('l', 'ⓛ').replace('m', 'ⓜ')
			.replace('n', 'ⓝ').replace('o', 'ⓞ').replace('p', 'ⓟ')
			.replace('q', 'ⓠ').replace('r', 'ⓡ').replace('s', 'ⓢ')
			.replace('t', 'ⓣ').replace('u', 'ⓤ').replace('v', 'ⓥ')
			.replace('w', 'ⓦ').replace('x', 'ⓧ').replace('y', 'ⓨ')
			.replace('z', 'ⓩ').replace('A', 'Ⓐ').replace('B', 'Ⓑ')
			.replace('C', 'Ⓒ').replace('D', 'Ⓓ').replace('E', 'Ⓔ')
			.replace('F', 'Ⓕ').replace('G', 'Ⓖ').replace('H', 'Ⓗ')
			.replace('I', 'Ⓘ').replace('J', 'Ⓙ').replace('K', 'Ⓚ')
			.replace('L', 'Ⓛ').replace('M', 'Ⓜ').replace('N', 'Ⓝ')
			.replace('O', 'Ⓞ').replace('P', 'Ⓟ').replace('Q', 'Ⓠ')
			.replace('R', 'Ⓡ').replace('S', 'Ⓢ').replace('T', 'Ⓣ')
			.replace('U', 'Ⓤ').replace('V', 'Ⓥ').replace('W', 'Ⓦ')
			.replace('X', 'Ⓧ').replace('Y', 'Ⓨ').replace('Z', 'Ⓩ');
	return change;
}
 ```

## Flip Text Generator
**Flip Text Generator** write upside down: How to write upside down on Facebook, Twitter, Myspace or Blog. Type in your text and it will instantly flip. It's cool!

### Flip Text Generator Method
 
 ```java
private String toFlip(String input) {
	String change = input.replace('a', 'ɐ').replace('b', 'q')
			.replace('c', 'ɔ').replace('d', 'p').replace('e', 'ǝ')
			.replace('f', 'ɟ').replace('g', 'ƃ').replace('h', 'ɥ')
			.replace('i', '!').replace('j', 'ɾ').replace('k', 'ʞ')
			.replace('l', 'ן').replace('m', 'ɯ').replace('n', 'u')
			.replace('o', 'o').replace('p', 'd').replace('q', 'b')
			.replace('r', 'ɹ').replace('s', 's').replace('t', 'ʇ')
			.replace('u', 'n').replace('v', 'ʌ').replace('w', 'ʍ')
			.replace('x', 'x').replace('y', 'ʎ').replace('z', 'z')
			.replace('A', '∀').replace('B', 'ᗺ').replace('C', 'Ɔ')
			.replace('D', 'p').replace('E', 'Ǝ').replace('F', 'Ⅎ')
			.replace('G', 'פ').replace('H', 'H').replace('I', 'I')
			.replace('J', 'ſ').replace('K', 'ʞ').replace('L', '˥')
			.replace('M', 'W').replace('N', 'N').replace('O', 'O')
			.replace('P', 'd').replace('Q', 'ઠ').replace('R', 'ᴚ')
			.replace('S', 'S').replace('T', '⊥').replace('U', '∩')
			.replace('V', 'ᴧ').replace('W', 'M').replace('X', 'X')
			.replace('Y', 'ʎ').replace('Z', 'Z');
	return change;
}
 ```

## English Digit to Farsi/Persian
**English Digit to Farsi/Persian** converts the digit from English format to Persian/Farsi format and this can be used in multilingual application projects.

### English Digit to Farsi/Persian Method
 
 ```java
private String digitToFarsi(String input) {
	String change = input.replace('0', '\u0660').replace('1', '\u0661')
			.replace('2', '\u0662').replace('3', '\u0663')
			.replace('4', '\u0664').replace('5', '\u0665')
			.replace('6', '\u0666').replace('7', '\u0667')
			.replace('8', '\u0668').replace('9', '\u0669');
	return change;
}
 ```

For further information refer to the [Presentation on Slide Share website](http://www.slideshare.net/absherzad/java-unicode-with-live-gui-examples)
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)