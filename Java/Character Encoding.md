since my java instructor recommended me to use ANSI format instead of UTF-8 in editplus, I had to find out what's the difference between the two.
</br>
</br>

- ### ANSI
  - American National Standards Institute  
  - 8-bit encoding
  - only supports 256 different combinations
  
- ### UTF
  - Unicode Transformation Format  
  - maximum of 32-bit encoding (UTF-32)
  - variable width encoding is employed in UTF-8, UTF-16  

http://www.differencebetween.net/technology/web-applications/difference-between-ansi-and-ascii/
</br>
</br>
checking out how characters with various decimal values in ANSI formats printed out on a console.

```java
char ansi_125 = 125;  System.out.println(ansi_125);
char ansi_126 = 126;  System.out.println(ansi_126);
char ansi_127 = 127;  System.out.println(ansi_127);
char ansi_128 = 128;  System.out.println(ansi_128);

System.out.println();

char ansi_255 = 255;  System.out.println(ansi_255);
char ansi_256 = 256;  System.out.println(ansi_256);
```  
```
}
~

?

?
?
```
in theory, char variable `ansi_255` with decimal value of 255 should be printed out as a character since it is within the range of ANSI code number, 32 ~ 255.  
but instead char variable with decimal value of 128 ~ 255 is printed out as question marks.
</br>
> If you use an old, non-Unicode version of Windows that was designed for a non-Latin alphabet such as Arabic, Cyrillic, Greek, Hebrew or Thai to view a document that has been typed using the ANSI character set, then characters from these languages may replace some of those in the 128–255 range.
http://www.alanwood.net/demos/ansi.html  
</br>
</br>

### Does ANSI have any benefits over richer encoding systems(such as UTF-8) ###

> Space requirements for UTF-8 encoding, as extracted Wikipedia's UTF-8 article and formatted/combined slightly:  
>  * So the first 128 (range [0, 0x7f]) characters (US-ASCII) need one byte.  
>  * The next 1,920 (range [0x80,0x07ff]) characters need two bytes to encode. ...  
>  * Three bytes are needed for the rest (range [0x0800,0xffff]) of the Basic Multilingual Plane (which contains virtually all characters in common use).  
>  * Four bytes are needed for characters in the other planes of Unicode,   which include less common CJK characters and various historic scripts.  
>
> Looking at an ANSI to Unicode mapping it can be seen that half the ANSI characters (the ASCII set) aligns with Unicode (1 byte encoding),
a number of the values over 127 also fall within the [0,0x7FF] Unicode range (2 bytes), and there are less common values which map into Unicode at over 0x07ff (require 3 bytes to encode in UTF-8).  
</br>Now, as for why that is the default encoding -- talk to the Notepad++ author :)
  
  
https://stackoverflow.com/questions/7134066/does-ansi-have-any-benefits-over-richer-encoding-systems-such-as-utf-8-for-sou
