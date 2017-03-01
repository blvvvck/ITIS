package MyString;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Rinat Mukhammetzyanov
 * @version 1.0
 */

public class MyString {

    /**
     * The value is used for storage.
     */
    private char[] charArr;

    /**
     * Initializes a newly created object.
     * an empty character sequence.
     */
    public MyString(){
        charArr = new char[0];
    }

    /**
     * Initializes a newly created object so that it represents the sequence of
     * characters currently contained in the character array argument.
     *
     * @param newString The initial char sequences of the string
     */
    public MyString(char[] newString){
        this.charArr = newString;
    }

    /**
     * Initializes a newly created object so that it represents the characters
     * sequence of String argument.
     *
     * @param string
     * The initial value of the {@link java.lang.String String}.
     */
    MyString(String string){
        charArr = string.toCharArray();
    }


    /**
     * Concatenates the specified string to the end of this string.
     *
     * @param newString the MyString that is concatenated to the end
     *                of this MyString.
     * @return a string that represents the concatenation of this object's
     *          characters followed by the string argument's characters.
     */
     MyString concat (MyString newString){
         int newlength = newString.length();
         if (newlength == 0) {
             return this;
         }
         int length = charArr.length;
         char[] temp = Arrays.copyOf(charArr, length + newlength);
         System.arraycopy(newString.charArr, 0, temp, length, newlength);
         return new MyString(temp);
     }

    /**
     * Converts this string to a new character array.
     *
     * @return a new character array whose length is the length
     *          of this string and whose contents are initialized to contain
     *          the character sequence represented by this string.
     */
    public String toCharArray(){
        return Arrays.toString(this.charArr);
    }

    /**
     * Returns the char value at the specified index.
     *
     * @param index the index of the char value.
     * @return     the char value at the specified index of this string.
     * @exception  StringIndexOutOfBoundsException  if index
     *             argument is negative or larger than the length of this
     *             string.
     */
    public char charAt(int index){
        if (index < 0 || index > charArr.length){
            throw new StringIndexOutOfBoundsException(index);
        }
        return charArr[index];
    }

    /**
     * Returns a string that is a substring of this string.
     *
     * @param start the beginning index.
     * @param length the length.
     * @return the specified substring.
     * @exception  StringIndexOutOfBoundsException  if the
     *             beginIndex is negative, or
     *             sum of beginIndex and length is larger than the length of
     *             this MyString object, or
     *             length is negative.
     */
    public MyString substring(int start, int length){
        if (start < 0) {
            throw new StringIndexOutOfBoundsException(start);
        }
        if (length + start > charArr.length) {
            throw new StringIndexOutOfBoundsException(start + length);
        }
        if (length < 0) {
            throw new StringIndexOutOfBoundsException(length);
        }
        if ((start == 0) && (length + start == charArr.length)) {
            return this;
        }
        char sbstr[] = new char[length];
        System.arraycopy(charArr, start, sbstr, 0, length);
        return new MyString(sbstr);
    }

    /**
     * Returns the index within this string of the first appearance of the
     * specified substring.
     *
     * @param str the substring to search for.
     * @return the index of the first appearance of the specified substring,
     *          or -1 if there is no such appearance.
     */
    public int indexOf(MyString str) {
        int length = charArr.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (charArr[i] != str.charArr[0]) continue;
            for (int j = 0; j < str.length(); j++) {
                if (i + j < length && charArr[i + j] == str.charArr[j]) count++;
                else break;
            }
            if (count == str.length()) return i;
            else count = 0;
        }
        return -1;
    }

    /**
     * Splits this string around matches of
     * the given character.
     *
     * @param delimiter the delimiting character.
     * @return the array of strings computed by splitting this string
     *          around matches of the given character.
     */
    MyString[] split(char delimiter) {
        ArrayList<MyString> list = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == delimiter) {
                if (start != i) {
                    list.add(substring(start, i - start));
                }
                start = i + 1;
            } else if (i == charArr.length - 1) {
                list.add(substring(start, i - start + 1));
            }
        }
        MyString[] splitted = new MyString[list.size()];
        return list.toArray(splitted);
    }

    @Override
    public String toString(){
        return new String(charArr);
    }

    /**
     * Returns the length of this string.
     * The length is equal to the number of
     * characters in the string.
     *
     * @return  the length of the sequence of characters represented by this
     *          object.
     */
    public int length(){
        return this.charArr.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyString myStr = (MyString) o;

        return Arrays.equals(charArr, myStr.charArr);

    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(charArr);
    }

}
