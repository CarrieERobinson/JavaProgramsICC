
package genericarrayprog;


public class GenArray<E extends Object> {
    private E[] array;
    private E[] revArray;
    private E[] sortArray;
    
    public GenArray(int size)
    {
        array = (E[])new Object[size];
        System.out.println("Array initialized!");
    }
    
    public Object[] getArray() {
        return array;
    }
    
    public void setArray(E[] elements)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = elements[i];
            //System.out.println("Element Added!");

        }
    }
    
    public <T extends Comparable> void sort()
    {
      T[] sortArray = (T[]) new Object[this.array.length];
      for (int i = 0; i < sortArray.length - 1; ++i)
      {
        int min = i; //holds minimum index
        
        for (int j = i + 1; j < sortArray.length; j++) //starts count at i + 1
        {
          if (sortArray[j].compareTo((T)sortArray[min]) < 0) //check for < or > 
          {
            min = j; //store min index
          }
        }
        // switch arount with a temp variable
        T temp = (T)sortArray[i];
        sortArray[i] = sortArray[min];
        sortArray[min] = temp;
      }
      //print out array
      for(int i = 0; i < sortArray.length; i++)
        {
            System.out.println(sortArray[i]);
        }
      this.sortArray = (E[])sortArray;
    }
    
    public void print()
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
    
    public void printRev()
    {
        for(int i = 0; i < revArray.length; i++)
        {
            System.out.println(revArray[i]);
        }
    }
    
    public void reverse(int firstEl, int lastEl)
    {
       revArray = (E[]) new Object[array.length];
       revArray = array;

       if(firstEl < lastEl)
       {
          E temp = revArray[firstEl];
          revArray[firstEl] = revArray[lastEl];
          revArray[lastEl]  = temp;
          reverse(firstEl + 1, lastEl - 1);
       }
    }
}
