import java.util.*;

class Lecture14 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 14");

        // Self-Check Problems:
        // Section 15.3: Advanced Features
        // 14. When this new version of the class fills to its capacity, it resizes.
        // How much does it grow? Why choose this growth rate, rather than increasing
        // the capacity by a single element or other constant amount?
        // The resize is the capacity multiplied by two. This is much less computationally expensive than
        // resizing for a single element because you won't need to resize as often and resizing is expensive.

        // 15. What is the benefit of adding an iterator to the list class?
        // Iterators make traversal easier because they dont reveal the underlying structure such as manual index based iteration.

        // 16. What state does the array list iterator store?
        // The iterator maintains a current index variable to keep track of its position.
        // The iterator needs a reference to the array list it is iterating over.

        // 17. How does the array list iterator know if there are more elements left to
        // examine?
        // What does it do if the client tries to examine a next element but there are
        // none left to examine?
        // The iterator uses the current index to ensure it is smaller than the size of the list.
        // If there are no elements left, the iterator will throw a NoSuchElementException

        // 18. What is a precondition of the iterator’s remove method?
        // How does the iterator enforce this precondition, and what does it do if the
        // precondition is violated?
        // The next() method must be called before remove() and remove() cannot be called consecutively you must use next().

        // 19. Write a method called sum that returns the sum of all values in the list.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.sum() should return 63. If the list is empty, sum should return
        // 0.

        // 20. Write a method called average that returns the average of the values in
        // the list as a real number.
        // For example, if a variable called list stores [11, –7, 3, 42, 0, 14], the
        // call of list.average() should return 10.5. If the list is empty, average
        // should return 0.0.

        // Section 15.4: ArrayList<E>
        // 21. What problem do we encounter when we try to construct an array of type E?
        // How do we resolve this problem?

        // 22. Since our list stores an unfilled array, the empty elements were filled
        // with the value 0 when our array was full of integers.
        // What value occupies the empty cells when our list stores values of type E?

        // 23. What changes need to be made to the indexOf method to search for objects
        // of type E in the new list class, and why are these changes necessary?

        // 24. What is an annotation? How are annotations useful in writing our
        // ArrayList<E> class?

        // 25. Why is it important to set empty elements to null when we are clearing or
        // removing from the list of type E, when we didn’t need to clear out these
        // elements in the previous ArrayIntList?

        // 26. What is one benefit of making the list iterator into an inner class?

        // Exercises:
        // None

    }


}

class ArrayIntListIterator {
    private int position;

    public ArrayIntListIterator() {
        this.position = 0;
    }
}
