/**
 * OrderedListADT defines the interface to an ordered list collection. Only
 * Comparable elements are stored, kept in the order determined by
 * the inherent relationship among the elements.
 * 
 * @author Dr. Lewis
 * @author Dr. Chase
 * @version 1.0, 8/19/08
 */

package jsjf;

public interface OrderedListADT<T> extends ListADT<T>
{
   /**  
    * Adds the specified element to this list at the proper location
    *
    * @param element  the element to be added to the list at the proper location
    */
   public void add (T element);
}
