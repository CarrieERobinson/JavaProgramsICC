/**
*Program: Generic Array
*This: GenericArray.java
*Author: Carrie Robinson
*Date: 5-Feb-2018
*Purpose:Test driver for ArrayClass class
*/
package genericarray;
//=========================GenericArray=========================================
public class GenericArray {
//=============================main=============================================
    public static void main(String[] args) {
        
        Integer arr[] = {1, 3, 5, 34, 32, 4, 2}; //array, modify to test code
        String arr2[] = {"Hello", "World", "2", "Java", "Apple"}; //String array
        
        ArrayClass<Integer> myArr = new ArrayClass(arr);  //intantiate ArrayClass object
        ArrayClass<String> myArr2 = new ArrayClass(arr2);
        
        System.out.println(myArr.toString()); //print array
        myArr.printRevArray(0, arr.length-1, arr); //print reverse array
        myArr.sortArray(); //sort array
        System.out.println(myArr.toString()); //print sorted array
        
        System.out.println(myArr2.toString()); //print array
        myArr2.printRevArray(0, arr2.length-1, arr2); //print reverse array
        myArr2.sortArray(); //sort array
        System.out.println(myArr2.toString()); //print sorted array
        
    }
    
}
