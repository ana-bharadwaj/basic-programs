/**
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
 * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Example 1:
 * Input: jewels = "aA", stones = "aAAbbbb"
 * Output: 3
 *
 * Example 2:
 * Input: jewels = "z", stones = "ZZ"
 * Output: 0
 */
public class JewelAndStones{
public static void main(String[]args){ String jewels="z";
String stones="fkgkdjgkzk";int count=0;
char []a=jewels.toCharArray();
char [] b=stones.toCharArray();
for (int i=0;i<a.length;i++){
char c=a[i];
for(int j=0;j<b.length;j++){
char d =b[j];
if(d==c){
count++;
}
else
{count=count+0;}
}
}
System.out.println(count);
}
}