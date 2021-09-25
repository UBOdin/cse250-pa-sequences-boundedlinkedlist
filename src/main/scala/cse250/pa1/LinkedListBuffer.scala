package cse250.pa1
/**
 * cse250.pa1.LinkedListBuffer
 *
 * Copyright 2021 Oliver Kennedy (okennedy@buffalo.edu)
 *           2021 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * Submission author
 * UBIT:
 * Person#:
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */

import scala.reflect.ClassTag

class LinkedListBuffer[A <: Any](capacity: Int)(implicit tag: ClassTag[A])
  extends Seq[A]
{
  val _buffer = new Array[LinkedListNode](size)

  /**
   * Append an entry into the sequence, displacing the oldest entry if needed.
   * @param     entry       The entry to insert
   * @return                The entry that was displaced, or None
   * 
   * After this function is called, `entry` should be the final element of the 
   * sequence.  If adding `entry` would cause the size of the sequence to 
   * exceed its `capacity`, the first entry in the sequence should be removed.
   * 
   * Data may only be stored in `_buffer`.  Your solution may not use any other
   * collection types.
   * 
   * This function must run in Θ(1) time (assume that all times are 
   * non-amortized unless otherwise specified).  
   */
  def append(entry: A): Option[A] = ???

  /**
   * Remove all instances of an element from the sequence.
   * @param     entry       The entry to remove.
   * @return                True if at least one instance of the entry was 
   *                        removed.
   * 
   * After this function is called, the sequence should contain no elements
   * that are equal (according to `==`) to `entry`.
   * 
   * This function must run in O(n) time, where n = [[length]] 
   */
  def remove(entry: A): Boolean = ???

  /**
   * Return an iterator over the elements of this sequence
   * @return                An iterator over the elements of this sequence
   * 
   * Iteration should proceed in order of insertion.  The first element to be
   * [[append]]ed should be the first element the iterator visits.  The most
   * recent element to be [[append]]ed should be the last element the iterator 
   * visits
   * 
   * This function must run in Θ(1) time.
   */
  override def iterator: Iterator[A] = ???

  /**
   * Return the current length of the sequence
   * @return                The number of elements in the sequence
   * 
   * Note that this is NOT exactly the same as the number of calls to append 
   * minus the number of calls to remove, since append will not increase the
   * size of the sequence beyond the sequence's `capacity`.
   * 
   * This function must run in Θ(1) time.
   */
  override def length: Int = ???

  /**
   * Retrieve the `idx`th element to be inserted into the sequence (i.e., the
   * `idx`th element in insertion order)
   * @param    idx      The position of the element to retrieve.
   * @return            The element at position `idx`
   * 
   * The order of the sequence is the order in which elements were inserted.
   * 
   * This function must run in O(n) time, where n = `idx`
   */
  override def apply(idx: Int): A = ???

  /**
   * Count the number of times `entry` occurs in the sequence.
   * @param    entry     The entry to count in the sequence
   * @return             The number of times entry (according to ==) occurs
   * 
   * Count the number of times the specified `entry` occurs in the sequence.
   * 
   * 
   * This function must run in O(n) time, where n = [[length]] 
   */
  def countEntry(entry: A): Int = ???

  /**
   * Update the value at position `idx` to `elem`
   * @param    idx       The index to update
   * @param    elem      The element to update the sequence to
   * 
   * Modify the sequence, replacing the element previously at position `idx` 
   * with `elem`.  This does not otherwise change the order of the list.
   * 
   * This function must run in O(n) time, where n = `idx`
   */
  def update(idx: Int, elem: A): Unit = ???


  /**
   * One node of a linked list.
   */
  class LinkedListNode(var _data: A)
  {
    /**
     * A reference (pointer) to the position in `_buffer` where the preceding
     * element of the sequence is located, or -1 if this is the first element
     * of the sequence.
     */
    var _prev: Int = -1

    /**
     * A reference (pointer) to the position in `_buffer` where the following
     * element of the sequence is located, or -1 if this is the last element
     * of the sequence.
     */
    var _next: Int = -1
  }

  /**
   * An iterator over the elements of this linked list.
   */
  class LinkedListIterator extends Iterator[A]
  {
    /**
     * Return true if there are additional elements in this iterator, or 
     * false if the iterator has no further elements.
     */
    override def hasNext: Boolean = ???

    /**
     * Return the next element of the iterator, and advance the iterator to 
     * the following position.
     */
    override def next(): A = ???
  }

}